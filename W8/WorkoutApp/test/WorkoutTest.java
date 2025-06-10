import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {

    private Workout workout;
    private Activity activity1;
    private Activity activity2;
    private Activity overlappingActivity;

    @BeforeEach
    void setUp() {
        workout = new Workout("Morning Routine", 3.5);
        activity1 = new Activity("Stretching", 300, 0);
        activity2 = new Activity("Running", 600, 400); // Break time between stretching and running: 100
        overlappingActivity = new Activity("Push-ups", 100, 250); // Overlaps with activity1
    }

    @Test
    void addActivity() {
        workout.addActivity(activity1);
        workout.addActivity(activity2);
        assertEquals(2, workout.getActivities().size());
        assertThrows(IllegalArgumentException.class, () -> workout.addActivity(overlappingActivity));
    }

    @Test
    void getDescription() {
        workout.addActivity(activity1);
        workout.addActivity(activity2);
        String desc = workout.getDescription();
        assertTrue(desc.contains("1) Stretching"));
        assertTrue(desc.contains("2) Running"));
    }

    @Test
    void getBreakTime() {
        workout.addActivity(activity1);
        workout.addActivity(activity2);
        assertEquals(100, workout.getBreakTime());
    }

    @Test
    void getDuration() {
        workout.addActivity(activity1);
        workout.addActivity(activity2); // Ends at 1000
        assertEquals(1000, workout.getDuration());
    }
}
