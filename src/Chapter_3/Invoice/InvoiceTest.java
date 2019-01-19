package ChapterThree.Invoice;

/**
 * InvoiceTest.java
 * This is a program that demonstrate the capabilities the Invoice.java class
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 19 November 2018
 */


public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoiceOne = new Invoice("0001", "Pencils", 3, 5);
        Invoice invoiceTwo = new Invoice("0002", "Computers", 6, 560);

        // printing the objects
        System.out.println(invoiceOne.toString());
        System.out.println(invoiceTwo.toString());
    }

}
