package ChapterThree.Invoice;

/**
 * Invoice.java
 * This is a program that a hardware store might use to represent
 * an invoice for an item sold at the store.
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 19 November 2018
 */

public class Invoice {

    private String number; // this is a universal product code (bar code)
    private String description; // This is the description of the product being purchased
    private int quantity; // quantity of the product
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    // getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This method computes the total cost of item purchased
     *
     * @return total price of item purchased
     */
    public double getInvoiceAmount() {
        return (quantity * price);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", Total=" + getInvoiceAmount() +
                '}';
    }
}
