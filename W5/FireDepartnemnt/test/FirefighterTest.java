import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class FirefighterTest {

    @org.junit.jupiter.api.Test
    void getYearsOfExperience() {
        // Arrange
        LocalDate dateEnteredService = LocalDate.of(2015, 3, 16);
        Firefighter firefighter = new Firefighter("John Doe", dateEnteredService);

        // Act
        int yearsOfExperience = firefighter.getYearsOfExperience();

        // Assert
        assertEquals(10, yearsOfExperience);
    }
}
