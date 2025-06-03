class SoundCard
{
    private int channels;

    public SoundCard(int channels)
    {
        if (channels <= 0)
        {
            throw new IllegalArgumentException("Number of channels must be positive.");
        }
        this.channels = channels;
    }

    public int getChannels()
    {
        return this.channels;
    }

    public void setChannels(int channels)
    {
        this.channels = channels;
    }
}
