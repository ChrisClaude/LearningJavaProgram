package Chapter_10.Polymorphism_and_Interfaces;

/**
 * Employee.java
 * Employee abstract superclass that implements Payable
 */
public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
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

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
                getSocialSecurityNumber());
    }

    /*
    Note: We do not implement Payable method getPaymentAmount here so
    this class must be declared abstract to avoid a compilation error.
     */
}
