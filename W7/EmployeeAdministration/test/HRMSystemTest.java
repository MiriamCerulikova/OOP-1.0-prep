import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class HRMSystemTest
{
    private HRMSystem hrmSystem;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        hrmSystem = new HRMSystem();
    }

    @org.junit.jupiter.api.Test
    void getAverageYearsOfService()
    {
        assertEquals(0, hrmSystem.getAverageYearsOfService());

        Employee employee1 = new Employee("John Doe", "01-12345", LocalDate.of(1990, 1, 1), LocalDate.of(2015, 1, 1));
        hrmSystem.addEmployee(employee1);
        assertEquals(10, hrmSystem.getAverageYearsOfService());

        Employee employee2 = new Employee("Jane Smith", "02-23456", LocalDate.of(1985, 5, 15), LocalDate.of(2010, 5, 15));
        Employee employee3 = new Employee("Alice Brown", "03-34567", LocalDate.of(1992, 3, 20), LocalDate.of(2018, 3, 20));
        hrmSystem.addEmployee(employee2);
        hrmSystem.addEmployee(employee3);

        double expectedAverage = (15 + 6 + 3) / 3.0;
        assertEquals(10.3, hrmSystem.getAverageYearsOfService(), 0.1);
    }

    @org.junit.jupiter.api.Test
    void getOldestEmployee()
    {
        assertNull(hrmSystem.getOldestEmployee());

        Employee employee1 = new Employee("John Doe", "01-12345", LocalDate.of(1990, 1, 1), LocalDate.of(2015, 1, 1));
        hrmSystem.addEmployee(employee1);
        assertEquals(employee1, hrmSystem.getOldestEmployee());

        Employee employee2 = new Employee("Jane Smith", "02-23456", LocalDate.of(1985, 5, 15), LocalDate.of(2010, 5, 15));
        Employee employee3 = new Employee("Alice Brown", "03-34567", LocalDate.of(1992, 3, 20), LocalDate.of(2018, 3, 20));
        hrmSystem.addEmployee(employee2);
        hrmSystem.addEmployee(employee3);

        assertEquals(employee2, hrmSystem.getOldestEmployee());
    }
}
