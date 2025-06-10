import java.util.*;

public class WorkoutApp
{
    private List<Workout> workouts;

    public List<Workout> getWorkouts()
    {
        return this.workouts;
    }

    public void setWorkouts(List<Workout> workouts)
    {
        this.workouts = workouts;
    }

    public WorkoutApp()
    {
        this.workouts = new ArrayList<>();
    }

    public void addWorkout(Workout workout)
    {
        workouts.add(workout);
    }

    public List<Workout> removeLongWorkouts()
    {
        List<Workout> removed = new ArrayList<>();
        Iterator<Workout> it = workouts.iterator();
        while (it.hasNext())
        {
            Workout w = it.next();
            if (w.getDuration() > 600)
            {
                removed.add(w);
                it.remove();
            }
        }
        return removed;
    }
}
