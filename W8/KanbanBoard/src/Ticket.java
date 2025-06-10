public class Ticket
{
    private String description;
    private int requiredExperience;
    private int priority;
    private int hoursToResolve;
    private Employee employee;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getRequiredExperience()
    {
        return this.requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience)
    {
        this.requiredExperience = requiredExperience;
    }

    public int getPriority()
    {
        return this.priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public int getHoursToResolve()
    {
        return this.hoursToResolve;
    }

    public void setHoursToResolve(int hoursToResolve)
    {
        this.hoursToResolve = hoursToResolve;
    }

    public Employee getEmployee()
    {
        return this.employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    public Ticket(String description, int requiredExperience, int priority, int hoursToResolve, Employee employee)
    {
        if (employee.getYearsOfExperience() < requiredExperience)
        {
            throw new RuntimeException("Employee does not have enough experience for this ticket.");
        }
        this.description = description;
        this.requiredExperience = requiredExperience;
        this.priority = priority;
        this.hoursToResolve = hoursToResolve;
        this.employee = employee;
    }
}
