import java.util.ArrayList;
import java.util.List;

public class Column
{
    private String title;
    private List<Ticket> tickets;

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public List<Ticket> getTickets()
    {
        return this.tickets;
    }

    public void setTickets(List<Ticket> tickets)
    {
        this.tickets = tickets;
    }

    public Column(String title)
    {
        this.title = title;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket)
    {
        tickets.add(ticket);
    }
}
