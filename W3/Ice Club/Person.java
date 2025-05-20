import java.time.LocalDate;
import java.time.Period;

class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getMonths();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
}
