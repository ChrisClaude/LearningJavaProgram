package Chapter_10.Exercise_Solving;

public class Bicycle implements CarbonFootPrint {

    private final String brand;
    private final String type; // human-powered or motor-powered
    private double price;
    private int monthlyPetrolUsage;

    // constructor
    public Bicycle(String brand, String type, double price, int monthlyPetrolUsage) {
        type = BicycleTypeValidation(type);

        this.brand = brand;
        this.type = type;
        this.price = price;
        this.monthlyPetrolUsage = monthlyPetrolUsage;
    }

    // validates type of bicycle
    public static String BicycleTypeValidation(String str) {
        str = str.toLowerCase().trim();
        String validated;

        if (!(str.equals("human-powered") || str.equals("machine-powered")))
            throw new IllegalArgumentException("The type of the bicycle must either be \"human-powered\" or " +
                    "\"machine-powered\"");

        validated = str;

        return validated;
    }

    // returns Bicycle brand
    public String getBrand() {
        return brand;
    }

    // returns Bicycle type
    public String getType() {
        return type;
    }

    // returns Bicycle price
    public double getPrice() {
        return price;
    }

    // sets Bicycle price
    public void setPrice(double price) {
        this.price = price;
    }

    // returns monthly petrol usage
    public int getMonthlyPetrolUsage() {
        return monthlyPetrolUsage;
    }

    // sets monthly petrol usage
    public void setMonthlyPetrolUsage(int monthlyPetrolUsage) {
        this.monthlyPetrolUsage = monthlyPetrolUsage;
    }

    // returns a String representation of the bicycle
    @Override
    public String toString() {
        return String.format("\tBicycle%nBrand: %s%nType: %s%nPrice: %.2f", getBrand(), getType(), getPrice());
    }

    // calculates the carbon emission of the bicycle
    @Override
    public double getCarbonFootPrint() {
        return monthlyPetrolUsage * 19.4;
    }
}
