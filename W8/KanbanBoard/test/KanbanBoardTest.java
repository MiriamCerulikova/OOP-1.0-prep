import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KanbanBoardTest {

    private KanbanBoard board;
    private Employee employee1;
    private Employee employee2;
    private Ticket ticket1;
    private Ticket ticket2;
    private Ticket ticket3;

    @BeforeEach
    void setUp() {
        board = new KanbanBoard();
        employee1 = new Employee("Alice", LocalDate.now().minusYears(4));
        employee2 = new Employee("Bob", LocalDate.now().minusYears(2));

        ticket1 = new Ticket("Task 1", 2, 3, 4, employee1);
        ticket2 = new Ticket("Task 2", 1, 4, 2, employee2);
        ticket3 = new Ticket("Task 3", 2, 1, 3, employee1);

        board.getColumns().get(0).addTicket(ticket1); // To Do
        board.getColumns().get(1).addTicket(ticket2); // In Progress
        board.getColumns().get(2).addTicket(ticket3); // Done
    }

    @Test
    void addColumn() {
        int initialSize = board.getColumns().size();
        board.addColumn(new Column("Review"));
        assertEquals(initialSize + 1, board.getColumns().size());
    }

    @Test
    void getTicketsByEmployee() {
        List<Ticket> tickets = board.getTicketsByEmployee("Alice");
        assertEquals(2, tickets.size());
        assertTrue(tickets.contains(ticket1));
        assertTrue(tickets.contains(ticket3));
    }

    @Test
    void getCompletionPercentage() {
        double percentage = board.getCompletionPercentage();
        assertEquals(33.33, percentage, 0.01);
    }
}
