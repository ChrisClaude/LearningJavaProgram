package ChapterNine.Inheritance_with_CommissionEmployee;

/**
 * CommissionEmployee.java
 * CommissionEmployee class represents an employee paid a
 * percentage of gross  sales.
 */
public class CommissionEmployee {

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales; // gross weekly sales
    protected double commissionRate; //commission percentage

    // five-argument constructor


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        // implicit call to Object's default constructor occurs here

        // if grossSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        // if commmissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >=0.0");

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // return commission rate

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // calculate earnings
    public double earnings() {
        return commissionRate * grossSales;
    }

    // return String representation of CommissionEmployee object


    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName, "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate);
    }
}
