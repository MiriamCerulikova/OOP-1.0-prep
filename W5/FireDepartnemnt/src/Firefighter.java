import java.time.LocalDate;
import java.time.Period;

public class Firefighter
{
    private String name;
    private LocalDate dateEnteredService;

    public Firefighter(String name, LocalDate dateEnteredService)
    {
        this.name = name;
        this.dateEnteredService = dateEnteredService;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getDateEnteredService()
    {
        return this.dateEnteredService;
    }

    public void setDateEnteredService(LocalDate dateEnteredService)
    {
        this.dateEnteredService = dateEnteredService;
    }

    public int getYearsOfExperience()
    {
        return Period.between(dateEnteredService, LocalDate.now()).getYears();
    }
}
