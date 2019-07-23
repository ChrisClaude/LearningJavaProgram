package CreatingAndProcessingSequentialFile.CreateSequentialFile;

import java.io.Serializable;

/**
 * Product.java
 *
 * This is the worker class for product objects
 *
 * @author Claude DE-TCHAMBILA
 * Student number: 217035027
 */
public class Product implements Serializable {

    private int prodType;
    private String prodDescription;
    private int prodSellPrice;
    private int prodQuantity;

    public Product() {
    }

    public Product(int prodType, String prodDescription, int prodSellPrice, int prodQuantity) {
        this.prodType = prodType;
        this.prodDescription = prodDescription;
        this.prodSellPrice = prodSellPrice;
        this.prodQuantity = prodQuantity;
    }

    // getters
    public int getProdType() {
        return prodType;
    }

    // setters
    public void setProdType(int prodType) {
        this.prodType = prodType;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public int getProdSellPrice() {
        return prodSellPrice;
    }

    public void setProdSellPrice(int prodSellPrice) {
        this.prodSellPrice = prodSellPrice;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    @Override
    public String toString() {
        return String.format("CreateSequentialFile.Product = {CreateSequentialFile.Product Type: %d, CreateSequentialFile.Product Description: %s, CreateSequentialFile.Product Sell Price: %d, " +
                "CreateSequentialFile.Product Quantity: %d}", prodType, prodDescription, prodSellPrice, prodQuantity);
    }
}
