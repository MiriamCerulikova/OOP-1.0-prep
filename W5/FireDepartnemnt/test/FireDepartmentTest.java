import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

class FireDepartmentTest
{

    private FireDepartment fireDepartment;
    private FireTruck fireTruck;
    private Firefighter firefighter;
    private Emergency emergency;

    @BeforeEach
    void setUp()
    {
        fireDepartment = new FireDepartment();
        fireTruck = new FireTruck(1000, 500);
        firefighter = new Firefighter("John Doe", LocalDate.of(2015, 3, 16));
        emergency = new Emergency("Fire in warehouse", 5, 300);

        fireDepartment.getFirefighters().add(firefighter);
        fireDepartment.getFireTrucks().add(fireTruck);
    }

    @Test
    void findAvailableTruck()
    {
        // Act
        FireTruck availableTruck = fireDepartment.findAvailableTruck(300);

        // Assert
        assertNotNull(availableTruck);
        assertEquals(fireTruck, availableTruck);
    }

    @Test
    void findAvailableTruckNotEnoughWater()
    {
        // Act
        FireTruck availableTruck = fireDepartment.findAvailableTruck(600);

        // Assert
        assertNull(availableTruck);
    }

    @Test
    void assignFirefightersWithoutPriority()
    {
        // Act
        List<Firefighter> assignedFirefighters = fireDepartment.assignFirefighters(2);

        // Assert
        assertEquals(1, assignedFirefighters.size());
        assertTrue(assignedFirefighters.contains(firefighter));
    }

    @Test
    void completeEmergency()
    {
        // Act
        fireDepartment.completeEmergency(emergency);

        // Assert
        assertTrue(emergency.isCompleted());
    }
}
