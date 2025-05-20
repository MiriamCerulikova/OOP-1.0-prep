import java.time.LocalDate;
import java.time.Period;

class Membership {
    private Person person;
    private LocalDate registrationDate;

    public Membership(Person person, LocalDate registrationDate) {
        this.person = person;
        this.registrationDate = registrationDate;
    }

    public double getMembershipFee() {
        int age = this.person.getAge();
        double fee;

        if (age < 12) {
            fee = 5.0;
        } else if (age <= 18) { 
            fee = 7.5;
        } else if (age >= 65) {
            fee = 30.35;
        } else {
            fee = 10.0;
        }

        if (Period.between(this.registrationDate, LocalDate.now()).getYears() > 5) {
            fee = fee * 0.9; 
        }

        return fee;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public Person getPerson() {
        return this.person;
    }
}
