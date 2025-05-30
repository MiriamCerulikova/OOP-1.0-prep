import java.util.ArrayList;
import java.util.List;

public class FireTruck
{
    private double maxWaterCapacity;
    private double currentWaterLevel;
    private List<Firefighter> firefighters;

    public FireTruck(double maxWaterCapacity, double currentWaterLevel)
    {
        this.maxWaterCapacity = maxWaterCapacity;
        this.currentWaterLevel = currentWaterLevel;
        this.firefighters = new ArrayList<>();
    }

    public double getMaxWaterCapacity()
    {
        return this.maxWaterCapacity;
    }

    public void setMaxWaterCapacity(double maxWaterCapacity)
    {
        this.maxWaterCapacity = maxWaterCapacity;
    }

    public double getCurrentWaterLevel()
    {
        return this.currentWaterLevel;
    }

    public void setCurrentWaterLevel(double currentWaterLevel)
    {
        this.currentWaterLevel = currentWaterLevel;
    }

    public List<Firefighter> getFirefighters()
    {
        return this.firefighters;
    }

    public void setFirefighters(List<Firefighter> firefighters)
    {
        this.firefighters = firefighters;
    }

    public void addFirefighter(Firefighter firefighter)
    {
        firefighters.add(firefighter);
    }

    public boolean useWater(double amount)
    {
        if (currentWaterLevel >= amount)
        {
            currentWaterLevel -= amount;
            return true;
        }
        return false;
    }

    public void refillWater()
    {
        this.currentWaterLevel = maxWaterCapacity;
    }
}
