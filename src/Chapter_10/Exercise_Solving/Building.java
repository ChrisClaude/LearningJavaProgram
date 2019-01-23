package Chapter_10.Exercise_Solving;

public class Building implements CarbonFootPrint{

    private String name;
    private String address;
    private String buildingType; // residential, administrative, hotel
    private final int yearCompleted;
    private int monthlyElectricUsage; // monthly electric usage of the building in kwh

    // constructor
    public Building(String name, String address, String buildingType, int yearCompleted, int monthlyElectricUsage) {
        if (yearCompleted < 1900 || yearCompleted > 2019)
            throw new IllegalArgumentException("The year of completion of the building must be > 1900 or < 2019");

        this.name = name;
        this.address = address;
        this.buildingType = buildingType;
        this.yearCompleted = yearCompleted;
        this.monthlyElectricUsage = monthlyElectricUsage;
    }

    // returns Building's name
    public String getName() {
        return name;
    }

    // sets Building's name
    public void setName(String name) {
        this.name = name;
    }

    // returns Building's physical address
    public String getAddress() {
        return address;
    }

    // sets Building's physical address
    public void setAddress(String address) {
        this.address = address;
    }

    // returns the type of building
    public String getBuildingType() {
        return buildingType;
    }

    // sets the type of building
    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    // returns the year of completion of the Building
    public int getYearCompleted() {
        return yearCompleted;
    }

    // returns the monthly electric usage for the building
    public int getMonthlyElectricUsage() {
        return monthlyElectricUsage;
    }

    // sets the monthly electric usage for the building
    public void setMonthlyElectricUsage(int monthlyElectricUsage) {
        this.monthlyElectricUsage = monthlyElectricUsage;
    }

    // returns a String representation of the Building object
    @Override
    public String toString() {
        return String.format("\t\t\t%s Building%n%nName: %s%nAddress: %s%nType: %sBuilding%nYear of completion: %d%n",
                getName(), getName(), getAddress(), getBuildingType(), getYearCompleted());
    }

    // calculating the building carbon's emission
    @Override
    public double getCarbonFootPrint() {
        /*
        Carbon Emission = [monthly electric usage (in Kwh) * 16.44 lbs of carbon](in cubic feet) * 0.12lbs of Carbon
         */
        return getMonthlyElectricUsage() * 16.44 * 0.12;
    }
}
