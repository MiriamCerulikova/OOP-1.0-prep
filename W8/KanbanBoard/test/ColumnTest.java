import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ColumnTest {

    private Column column;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        column = new Column("To Do");
        Employee employee = new Employee("John", LocalDate.now().minusYears(5));
        ticket = new Ticket("Fix bug", 3, 2, 5, employee);
    }

    @Test
    void addTicket() {
        column.addTicket(ticket);
        assertEquals(1, column.getTickets().size());
        assertEquals(ticket, column.getTickets().get(0));
    }
}
