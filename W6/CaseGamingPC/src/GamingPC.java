import java.util.ArrayList;
import java.util.List;

class GamingPC
{
    private Motherboard motherboard;
    private List<Game> installedGames;

    public GamingPC(Motherboard motherboard)
    {
        this.motherboard = motherboard;
        this.installedGames = new ArrayList<>();
    }

    public Motherboard getMotherboard()
    {
        return this.motherboard;
    }

    public void setMotherboard(Motherboard motherboard)
    {
        this.motherboard = motherboard;
    }

    public List<Game> getInstalledGames()
    {
        return this.installedGames;
    }

    public void installGame(Game game)
    {

    }

    public boolean hasEnoughSpace()
    {
        int totalCapacity = 0;
        int totalUsed = 0;

        for (SSD ssd : motherboard.getSsds())
        {
            totalCapacity += ssd.getMaxCapacity();
            totalUsed += ssd.getUsedSpace();
        }

        return ((double) (totalCapacity - totalUsed) / totalCapacity) > 0.01;
    }
}
