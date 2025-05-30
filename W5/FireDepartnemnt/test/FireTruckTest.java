import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class FireTruckTest {

    private FireTruck fireTruck;
    private Firefighter firefighter;

    @BeforeEach
    void setUp()
    {
        fireTruck = new FireTruck(1000, 500);
        firefighter = new Firefighter("John Doe", LocalDate.of(2015, 3, 16));
    }

    @Test
    void addFirefighter()
    {
        // Act
        fireTruck.addFirefighter(firefighter);

        // Assert
        assertEquals(1, fireTruck.getFirefighters().size());
        assertTrue(fireTruck.getFirefighters().contains(firefighter));
    }

    @Test
    void useWater()
    {
        // Act
        boolean result = fireTruck.useWater(300);

        // Assert
        assertTrue(result);
        assertEquals(200, fireTruck.getCurrentWaterLevel());
    }

    @Test
    void useWaterNotEnough()
    {
        // Act
        boolean result = fireTruck.useWater(600);

        // Assert
        assertFalse(result);
        assertEquals(500, fireTruck.getCurrentWaterLevel());
    }

    @Test
    void refillWater()
    {
        // Act
        fireTruck.refillWater();

        // Assert
        assertEquals(1000, fireTruck.getCurrentWaterLevel());
    }
}
