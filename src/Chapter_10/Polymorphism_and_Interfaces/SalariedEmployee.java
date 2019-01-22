package Chapter_10.Polymorphism_and_Interfaces;

/**
 * SalariedEmployee.java
 * SalariedEmployee class that implements interface Payable.
 * method getPaymentAmount
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * calculate earnings; implement interface Payable method that was
     * abstract in superclass Employee
     * @return weekly salary
     */
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }

}
