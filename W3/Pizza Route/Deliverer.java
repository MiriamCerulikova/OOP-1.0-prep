import java.time.*;

class Deliverer {
    private String name;
    private LocalDate dateOfBirth;

    public Deliverer(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public double getSalary() {
        int age = getAge();
        if (age >= 22) {
            return 5.25;
        } else if (age >= 20) {
            return 4.75;
        } else if (age >= 16) {
            return 4.0;
        }
        return 0.0;
    }
}