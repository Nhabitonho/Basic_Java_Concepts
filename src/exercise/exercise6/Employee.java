package exercise.exercise6;

public class Employee {

    String firstName;

    String lastName;
    double monthSalary;

    public Employee(String firstName, String lastName, double monthSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthSalary > 0.0) {
            this.monthSalary = monthSalary;
        } else {
            monthSalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }


}
