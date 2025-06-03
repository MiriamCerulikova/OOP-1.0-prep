class SSD
{
    private int capacity;
    private int maxCapacity;
    private int usedSpace;

    public SSD(int capacity, int maxCapacity)
    {
        if (capacity <= 0 || maxCapacity <= 0 || capacity > maxCapacity)
        {
            throw new IllegalArgumentException("Invalid SSD capacity values.");
        }
        this.capacity = capacity;
        this.maxCapacity = maxCapacity;
        this.usedSpace = 0;
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }

    public int getUsedSpace()
    {
        return this.usedSpace;
    }

    public void setUsedSpace(int usedSpace)
    {
        this.usedSpace = usedSpace;
    }

    public int getRemainingSpace()
    {
        return this.maxCapacity - usedSpace;
    }
}
