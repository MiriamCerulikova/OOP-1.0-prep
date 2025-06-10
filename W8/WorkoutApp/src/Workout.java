import java.util.*;

public class Workout
{
    private String title;
    private double difficulty;
    private List<Activity> activities;

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getDifficulty()
    {
        return this.difficulty;
    }

    public void setDifficulty(double difficulty)
    {
        this.difficulty = difficulty;
    }

    public List<Activity> getActivities()
    {
        return this.activities;
    }

    public void setActivities(List<Activity> activities)
    {
        this.activities = activities;
    }

    public Workout(String title, double difficulty)
    {
        this.title = title;
        this.difficulty = difficulty;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity)
    {
        for (Activity a : activities)
        {
            int aStart = a.getStartTime();
            int aEnd = aStart + a.getLength();
            int newStart = activity.getStartTime();
            int newEnd = newStart + activity.getLength();
            if ((newStart >= aStart && newStart < aEnd) || (newEnd > aStart && newEnd <= aEnd))
            {
                throw new IllegalArgumentException("Activity overlaps with existing one");
            }
        }
        activities.add(activity);
    }

    public String getDescription()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        int i = 1;
        for (Activity a : activities)
        {
            sb.append(i).append(") ").append(a.getName()).append(" (").append(a.getLength()).append(" seconds)").append("\n");
            i++;
        }
        return sb.toString();
    }

    public int getBreakTime()
    {
        if (activities.size() <= 1) return 0;
        int totalBreak = 0;
        for (int i = 0; i < activities.size() - 1; i++)
        {
            Activity current = activities.get(i);
            Activity next = activities.get(i + 1);
            int currentEnd = current.getStartTime() + current.getLength();
            int breakTime = next.getStartTime() - currentEnd;
            if (breakTime > 0)
            {
                totalBreak += breakTime;
            }
        }
        return totalBreak;
    }

    public int getDuration()

        int max = 0;
        for (Activity a : activities)
        {
            int end = a.getStartTime() + a.getLength();
            if (end > max)
            {
                max = end;
            }
        }
        return max;
    }
}
