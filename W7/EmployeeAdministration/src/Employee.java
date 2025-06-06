import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

class Employee
{
    private String name;
    private String employeeNumber;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHire;
    private Map<Integer, String> performanceRatings;
    private boolean hasIncomeTaxCredit;
    private boolean contributesToInsurance;

    public Employee(String name, String employeeNumber, LocalDate dateOfBirth, LocalDate dateOfHire)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
        this.performanceRatings = new HashMap<>();
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmployeeNumber()
    {
        return this.employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfHire()
    {
        return this.dateOfHire;
    }
    public void setDateOfHire(LocalDate dateOfHire)
    {
        this.dateOfHire = dateOfHire;
    }

    public Map<Integer, String> getPerformanceRatings()
    {
        return this.performanceRatings;
    }

    public boolean isHasIncomeTaxCredit()
    {
        return this.hasIncomeTaxCredit;
    }
    public void setHasIncomeTaxCredit(boolean hasIncomeTaxCredit)
    {
        this.hasIncomeTaxCredit = hasIncomeTaxCredit;
    }

    public boolean isContributesToInsurance()
    {
        return this.contributesToInsurance;
    }

    public void setContributesToInsurance(boolean contributesToInsurance) { this.contributesToInsurance = contributesToInsurance; }

    public int getDepartment()
    {
        return Integer.parseInt(employeeNumber.substring(0, 2));
    }

    public int getAge()
    {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public int getYearsOfService()
    {
        return Period.between(dateOfHire, LocalDate.now()).getYears();
    }

    public int getVacationDays()
    {
        int years = getYearsOfService();
        return years < 5 ? 10 : years < 10 ? 15 : 20;
    }

    public double getGrossSalary()
    {
        return 50000 + (getYearsOfService() * 1000);
    }

    public double getNetSalary()
    {
        double gross = getGrossSalary();
        double tax = hasIncomeTaxCredit ? 0.2 : 0.25;
        double insurance = contributesToInsurance ? 0.05 : 0;
        return gross * (1 - tax - insurance);
    }

    public double getThirteenthMonthBonus()
    {
        return getGrossSalary() / 12;
    }

    public void addPerformanceRating(int year, String rating)
    {
        performanceRatings.put(year, rating);
    }
}
