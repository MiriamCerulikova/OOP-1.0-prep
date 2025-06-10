import java.util.ArrayList;
import java.util.List;

public class KanbanBoard
{
    private List<Column> columns;

    public List<Column> getColumns()
    {
        return this.columns;
    }

    public void setColumns(List<Column> columns)
    {
        this.columns = columns;
    }

    public KanbanBoard()
    {
        this.columns = new ArrayList<>();
        columns.add(new Column("To Do"));
        columns.add(new Column("In Progress"));
        columns.add(new Column("Done"));
    }

    public void addColumn(Column column)
    {
        columns.add(column);
    }

    public List<Ticket> getTicketsByEmployee(String employeeName)
    {
        List<Ticket> result = new ArrayList<>();
        for (Column column : columns)
        {
            for (Ticket ticket : column.getTickets())
            {
                if (ticket.getEmployee().getName().equals(employeeName))
                {
                    result.add(ticket);
                }
            }
        }
        return result;
    }

    public double getCompletionPercentage()
    {
        int total = 0;
        int done = 0;
        for (Column column : columns)
        {
            List<Ticket> tickets = column.getTickets();
            total += tickets.size();
            if (column.getTitle().equals("Done"))
            {
                done += tickets.size();
            }
        }
        if (total == 0) return 0;
        return (done * 100.0) / total;
    }
}
