import java.time.LocalDate;
import java.time.Period;

public class Employee
{
    private String name;
    private LocalDate dateJoined;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getDateJoined()
    {
        return this.dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined)
    {
        this.dateJoined = dateJoined;
    }

    public Employee(String name, LocalDate dateJoined)
    {
        this.name = name;
        this.dateJoined = dateJoined;
    }

    public int getYearsOfExperience()
    {
        return Period.between(dateJoined, LocalDate.now()).getYears();
    }
}
