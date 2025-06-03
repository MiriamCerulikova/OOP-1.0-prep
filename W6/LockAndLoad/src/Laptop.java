import java.lang.IllegalArgumentException;

class Laptop
{
    private String serialNumber;
    private int currentBattery;
    private int maxBattery;

    public Laptop(String serialNumber, int currentBattery, int maxBattery)
    {
        if (currentBattery > maxBattery || currentBattery < 0 || maxBattery <= 0)
        {
            throw new IllegalArgumentException("Invalid battery values");
        }
        this.serialNumber = serialNumber;
        this.currentBattery = currentBattery;
        this.maxBattery = maxBattery;
    }

    public String getSerialNumber()
    {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public int getCurrentBattery()
    {
        return this.currentBattery;
    }

    public void setCurrentBattery(int currentBattery)
    {
        if (currentBattery > maxBattery || currentBattery < 0)
        {
            throw new IllegalArgumentException("Invalid battery value");
        }
        this.currentBattery = currentBattery;
    }

    public int getMaxBattery()
    {
        return this.maxBattery;
    }

    public void setMaxBattery(int maxBattery)
    {
        if (maxBattery <= 0)
        {
            throw new IllegalArgumentException("Invalid max battery value");
        }
        this.maxBattery = maxBattery;
    }

    public double getBatteryPercentage()
    {
        return (double) currentBattery / maxBattery * 100;
    }
}
