import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        // Employee joined exactly 3 years ago
        employee = new Employee("Alice", LocalDate.now().minusYears(3));
    }

    @Test
    void getYearsOfExperience() {
        assertEquals(3, employee.getYearsOfExperience());
    }
}
