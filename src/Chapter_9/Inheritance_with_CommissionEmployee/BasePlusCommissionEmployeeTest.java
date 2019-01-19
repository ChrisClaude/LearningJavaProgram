package ChapterNine.Inheritance_with_CommissionEmployee;

/**
 * BasePlusCommissionEmployeeTest.java
 * BasePlusCommissionEmployee test program
 */
public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Claude", "Ford", "637-33-3993", 5070, .05, 370);

        // get base-salaried commission employee data
        System.out.printf("Employee information obtained by get methods%n" +
                "--------------------------------------------");
        System.out.printf("%n%n%s %s", "First name is", employee.getFirstName());
        System.out.printf("%n%s %s", "Last name is", employee.getLastName());
        System.out.printf("%n%s %s", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %.2f", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %.2f", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%n%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(2000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
    }

}
