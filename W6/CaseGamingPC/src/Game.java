class Game
{
    private String title;
    private int requiredSpace;
    private int requiredVideoMemory;

    public Game(String title, int requiredSpace, int requiredVideoMemory)
    {
        if (requiredSpace <= 0 || requiredVideoMemory <= 0)
        {
            throw new IllegalArgumentException("Invalid game specifications.");
        }
        this.title = title;
        this.requiredSpace = requiredSpace;
        this.requiredVideoMemory = requiredVideoMemory;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getRequiredSpace()
    {
        return this.requiredSpace;
    }

    public void setRequiredSpace(int requiredSpace)
    {
        this.requiredSpace = requiredSpace;
    }

    public int getRequiredVideoMemory()
    {
        return this.requiredVideoMemory;
    }

    public void setRequiredVideoMemory(int requiredVideoMemory)
    {
        this.requiredVideoMemory = requiredVideoMemory;
    }
}
