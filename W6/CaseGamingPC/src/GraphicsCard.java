class GraphicsCard
{
    private double maxGHz;
    private int videoMemory;

    public GraphicsCard(double maxGHz, int videoMemory)
    {
        if (maxGHz <= 0 || videoMemory <= 0)
        {
            throw new IllegalArgumentException("Invalid graphics card specifications.");
        }
        this.maxGHz = maxGHz;
        this.videoMemory = videoMemory;
    }

    public double getMaxGHz()
    {
        return this.maxGHz;
    }

    public void setMaxGHz(double maxGHz)
    {
        this.maxGHz = maxGHz;
    }

    public int getVideoMemory()
    {
        return this.videoMemory;
    }

    public void setVideoMemory(int videoMemory)
    {
        this.videoMemory = videoMemory;
    }
}
