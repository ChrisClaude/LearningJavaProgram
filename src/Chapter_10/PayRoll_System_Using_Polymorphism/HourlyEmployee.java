package Chapter_10.PayRoll_System_Using_Polymorphism;

public class HourlyEmployee extends Employee {

    private double wage; // wage per hour
    private double hours; // hours worked for week

    // constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    }

    // return wage
    public double getWage() {
        return wage;
    }

    // set wage
    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    // returns hours worked
    public double getHours() {
        return hours;
    }

    // set hours worked
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }

}
