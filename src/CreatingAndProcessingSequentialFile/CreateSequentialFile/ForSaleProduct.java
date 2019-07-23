package CreatingAndProcessingSequentialFile.CreateSequentialFile;

/**
 * ForSaleProduct.java
 *
 * This is the model class of Product objects that are for sale
 *
 * @author Claude DE-TCHAMBILA
 * Student Number: 217035027
 */
public class ForSaleProduct extends Product {

    private int catalogNumber;
    private int purchasePricePerItem;

    public ForSaleProduct() {
    }

    public ForSaleProduct(int prodType, String prodDescription, int prodSellPrice, int prodQuantity, int catalogNumber, int purchasePricePerItem) {
        super(prodType, prodDescription, prodSellPrice, prodQuantity);
        this.catalogNumber = catalogNumber;
        this.purchasePricePerItem = purchasePricePerItem;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public void setPurchasePricePerItem(int purchasePricePerItem) {
        this.purchasePricePerItem = purchasePricePerItem;
    }

    @Override
    public String toString() {
        return String.format("ForSaleProduct = { ProductType: %d, Catalog number: %d, Item description: %s," +
                        "Purchase price per item: %d, Selling price per unit: %d, Quantity sold: %d}",
                super.getProdType(), catalogNumber, super.getProdDescription(), purchasePricePerItem,
                super.getProdSellPrice(), super.getProdQuantity());
    }
}
