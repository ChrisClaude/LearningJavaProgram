package ChapterThree.TargetHeartRateCalculator;

/**
 * HeartRates.java
 * This is the worker class of a java program that calculates
 * the target heart rate of an individual based on his
 * personal information(age).
 *
 * @author Claude C DE-TCHAMBILA
 * Date 26 November 2006
 */
public class HeartRates {

    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;

    public HeartRates(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

}
