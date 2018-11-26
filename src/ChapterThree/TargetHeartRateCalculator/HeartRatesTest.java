package ChapterThree.TargetHeartRateCalculator;

import java.util.Scanner;

/**
 * HeartRates.java
 * This is the working class of a java program that calculates
 * the target heart rate of an individual based on his
 * personal information(age).
 *
 * @author Claude C DE-TCHAMBILA
 * Date 26 November 2006
 */
public class HeartRatesTest {

    public static void main(String[] args) {
        String firstName, lastName;
        int year, month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter last name: ");
        lastName = input.nextLine();
        System.out.print("Enter year of birth: ");
        year = input.nextInt();
        System.out.print("Enter month of birth: ");
        month = input.nextInt();
        System.out.print("Enter day of birth: ");
        day = input.nextInt();

        HeartRates h = new HeartRates(firstName, lastName, year, month, day);

        System.out.printf("First name: %s\nLast name: %s\n" +
                        "Date of birth(day/Month/year): %d/%d/%d\n" +
                        "Age: %d\nMaximum heart rate: %d per minute\nTarget heart rate range: %s per minute",
                h.getFirstName(), h.getLastName(), h.getDay(), h.getMonth(), h.getYear(),
                h.ageInYears(), h.maxHeartRate(), h.targetHeartRateRange());

    }

}
