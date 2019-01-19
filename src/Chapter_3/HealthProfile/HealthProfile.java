package ChapterThree.HealthProfile;

/**
 * HealthProfile.java
 * worker class of
 * a program that manages the health record
 * and information of a patient
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 26 November 2018
 */
public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int year;
    private int month;
    private int day;
    private double height; // height in kilogram
    private double weight; // weight in meter

    public HealthProfile(String firstName, String lastName, String gender, int year, int month, int day, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.day = day;
        this.height = height;
        this.weight = weight;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * This method calculates the age of
     * the individual in years
     * @return age in years
     */
    public int ageInYears() {
        int currentYear = 2018;
        return (currentYear - year);
    }

    /**
     * This method calculates the maximum heart rate of
     * the individual based on his age.
     * @return max heart rate per minute
     */
    public int maxHeartRate() {
        return (220 - ageInYears());
    }

    /**
     * This method evaluates the target heart rate range
     * based on the personal information of the individual,
     * provided by the user.
     * @return the target heart rate range
     */
    public String targetHeartRateRange() {
        int min = (maxHeartRate() * 50)/100;
        int max = (maxHeartRate() * 85)/100;

        return min + "-" + max;
    }

    /**
     * This method computes the body mass index of a patient
     * based on the personal information of provided
     * @return the body mass index(bmi) of the patient
     */
    public double computeBodyMassIndex() {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

}
