public class Emergency
{
    private String description;
    private int priority;
    private double estimatedWaterNeeded;
    private boolean completed;

    public Emergency(String description, int priority, double estimatedWaterNeeded)
    {
        this.description = description;
        this.priority = priority;
        this.estimatedWaterNeeded = estimatedWaterNeeded;
        this.completed = false;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getPriority()
    {
        return this.priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public double getEstimatedWaterNeeded()
    {
        return this.estimatedWaterNeeded;
    }

    public void setEstimatedWaterNeeded(double estimatedWaterNeeded)
    {
        this.estimatedWaterNeeded = estimatedWaterNeeded;
    }

    public boolean isCompleted()
    {
        return this.completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public void markAsCompleted()
    {
        this.completed = true;
    }
}
