import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest
{
    private Employee employee;

    @BeforeEach
    void setUp()
    {
        employee = new Employee("John Doe", "01-12345", LocalDate.of(1990, 1, 1), LocalDate.of(2015, 1, 1));
    }

    @Test
    void getAge()
    {
        assertEquals(35, employee.getAge());
    }

    @Test
    void getYearsOfService()
    {
        assertEquals(10, employee.getYearsOfService());
    }

    @Test
    void getVacationDays()
    {
        assertEquals(20, employee.getVacationDays());
    }

    @Test
    void getGrossSalary()
    {
        assertEquals(60000, employee.getGrossSalary());
    }

    @Test
    void getNetSalary()
    {
        employee.setHasIncomeTaxCredit(true);
        employee.setContributesToInsurance(true);
        assertEquals(45000, employee.getNetSalary(), 0.1);
    }

    @Test
    void getThirteenthMonthBonus()
    {
        assertEquals(5000, employee.getThirteenthMonthBonus());
    }

    @Test
    void addPerformanceRating()
    {
        employee.addPerformanceRating(2020, "Excellent");
        assertEquals("Excellent", employee.getPerformanceRatings().get(2020));
    }
}
