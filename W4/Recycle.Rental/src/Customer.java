import java.time.LocalDate;
import java.time.Period;

public class Customer
{
    private String name;
    private LocalDate dateOfBirth;

    public Customer(String name, LocalDate dateOfBirth)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge()
    {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
