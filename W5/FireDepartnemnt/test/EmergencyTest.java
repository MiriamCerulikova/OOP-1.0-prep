import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmergencyTest
{

    @Test
    void isCompleted()
    {
        //Arrange
        Emergency emergency = new Emergency("Fire in warehouse", 5, 500.0);

        //Assert
        assertFalse(emergency.isCompleted());
    }

    @Test
    void markAsCompleted()
    {
        //Arrange
        Emergency emergency = new Emergency("Fire in warehouse", 5, 500.0);

        //Act
        emergency.markAsCompleted();

        //Assert
        assertTrue(emergency.isCompleted());
    }
}
