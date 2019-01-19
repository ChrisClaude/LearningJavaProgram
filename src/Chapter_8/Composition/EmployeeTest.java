package ChapterEight.Composition;

/**
 * EmployeeTest.java
 * Composition demonstration
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Date birth = new Date(2, 16, 1999);
        Date hire = new Date(6, 20, 2019);
        Employee employee = new Employee("De-Tchambila", "Claude", birth, hire);

        System.out.println(employee);
    }

}
