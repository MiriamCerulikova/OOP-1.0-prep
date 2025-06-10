import java.util.*;

public class Activity
{
    private String name;
    private int length;
    private int startTime;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLength()
    {
        return this.length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getStartTime()
    {
        return this.startTime;
    }

    public void setStartTime(int startTime)
    {
        this.startTime = startTime;
    }

    public Activity(String name, int length, int startTime)
    {
        this.name = name;
        this.length = length;
        this.startTime = startTime;
    }
}
