import java.util.ArrayList;
import java.util.List;

class HRMSystem
{
    private List<Employee> employees;

    public HRMSystem()
    {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() { return employees; }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public double getAverageYearsOfService()
    {
        if (employees.isEmpty())
        {
            return 0;
        }

        int totalYears = 0;
        for (Employee e : employees)
        {
            totalYears += e.getYearsOfService();
        }
        return (double) totalYears / employees.size();
    }

    public Employee getOldestEmployee()
    {
        if (employees.isEmpty())
        {
            return null;
        }

        Employee oldest = employees.get(0);
        for (Employee e : employees)
        {
            if (e.getAge() > oldest.getAge())
            {
                oldest = e;
            }
        }
        return oldest;
    }
}
