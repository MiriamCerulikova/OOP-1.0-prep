import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutAppTest {

    private WorkoutApp app;
    private Workout shortWorkout;
    private Workout longWorkout;

    @BeforeEach
    void setUp() {
        app = new WorkoutApp();

        shortWorkout = new Workout("Quick Workout", 2.0);
        shortWorkout.addActivity(new Activity("Jumping Jacks", 300, 0));

        longWorkout = new Workout("Intense Workout", 4.5);
        longWorkout.addActivity(new Activity("Running", 700, 0)); // Ends after 700 seconds
    }

    @Test
    void addWorkout() {
        app.addWorkout(shortWorkout);
        assertEquals(1, app.getWorkouts().size());
    }

    @Test
    void removeLongWorkouts() {
        app.addWorkout(shortWorkout);
        app.addWorkout(longWorkout);
        assertEquals(2, app.getWorkouts().size());

        var removed = app.removeLongWorkouts();
        assertEquals(1, removed.size());
        assertEquals("Intense Workout", removed.get(0).getTitle());
        assertEquals(1, app.getWorkouts().size());
    }
}
