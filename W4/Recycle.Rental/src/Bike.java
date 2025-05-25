public class Bike
{
    private String id;
    private double totalDistance;

    public Bike(String id)
    {
        this.id = id;
        this.totalDistance = 0;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public double getTotalDistance()
    {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance)
    {
        this.totalDistance = totalDistance;
    }

    public void addDistance(double km)
    {
        this.totalDistance += km;
    }

    public boolean needsMaintenance()
    {
        return totalDistance > 500;
    }
}
