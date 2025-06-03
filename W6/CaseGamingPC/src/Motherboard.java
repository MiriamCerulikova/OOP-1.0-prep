import java.util.ArrayList;
import java.util.List;

class Motherboard
{
    private int maxSlots;
    private int usedSlots;
    private List<GraphicsCard> graphicsCards;
    private List<SSD> ssds;
    private List<SoundCard> soundCards;

    public Motherboard(int maxSlots)
    {
        if (maxSlots <= 0)
        {
            throw new IllegalArgumentException("Max slots must be greater than zero.");
        }
        this.maxSlots = maxSlots;
        this.usedSlots = 0;
        this.graphicsCards = new ArrayList<>();
        this.ssds = new ArrayList<>();
        this.soundCards = new ArrayList<>();
    }

    public int getMaxSlots()
    {
        return this.maxSlots;
    }

    public void setMaxSlots(int maxSlots)
    {
        this.maxSlots = maxSlots;
    }

    public int getUsedSlots()
    {
        return this.usedSlots;
    }

    public List<GraphicsCard> getGraphicsCards()
    {
        return this.graphicsCards;
    }

    public List<SSD> getSsds()
    {
        return this.ssds;
    }

    public List<SoundCard> getSoundCards()
    {
        return this.soundCards;
    }

    public int getAvailableSlots()
    {
        return this.maxSlots - usedSlots;
    }

    public void addGraphicsCard(GraphicsCard graphicsCard)
    {
        if (getAvailableSlots() < 3)
        {
            throw new RuntimeException("Not enough slots available for the graphics card.");
        }
        graphicsCards.add(graphicsCard);
        usedSlots += 3;
    }

    public void addSSD(SSD ssd)
    {
        int requiredSlots = ssd.getCapacity() > 2048 ? 2 : 1;
        if (getAvailableSlots() < requiredSlots)
        {
            throw new RuntimeException("Not enough slots available for the SSD.");
        }
        ssds.add(ssd);
        usedSlots += requiredSlots;
    }

    public void addSoundCard(SoundCard soundCard)
    {
        if (getAvailableSlots() < 1)
        {
            throw new RuntimeException("Not enough slots available for the sound card.");
        }
        soundCards.add(soundCard);
        usedSlots++;
    }
}
