package ChapterThree.HealthProfile;

import java.util.Scanner;

/**
 * HealthProfile.java
 * working class of
 * a program that manages the health record
 * and information of a patient
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 26 November 2018
 */
public class RunHealthProfile {

    public static void main(String[] args) {
        String firstName, lastName, gender;
        int year, month, day;
        double weight, height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient's first name: ");
        firstName = input.nextLine();
        System.out.print("Enter patient's last name: ");
        lastName = input.nextLine();
        System.out.print("Enter patient's gender: ");
        gender = input.nextLine();
        System.out.print("Enter patient's year of birth: ");
        year = input.nextInt();
        System.out.print("Enter patient's month of birth: ");
        month = input.nextInt();
        System.out.print("Enter patient's day of birth: ");
        day = input.nextInt();
        System.out.print("Enter patient's weight: ");
        weight = input.nextDouble();
        System.out.print("Enter patient's height: ");
        height = input.nextDouble();


        HealthProfile h = new HealthProfile(firstName, lastName, gender, year, month, day, height, weight);

        System.out.println();
        System.out.println("===============================");
        System.out.println();
        System.out.printf("First name: %s\nLast name: %s\nGender: %s\n" +
                        "Date of birth(day/Month/year): %d/%d/%d\n" +
                        "Height: %f\nWeight: %f\n" +
                        "Age: %d\nBody Mass Index is: %.2f\nMaximum heart rate: %d per minute\n" +
                        "Target heart rate range: %s per minute\n",
                h.getFirstName(), h.getLastName(), h.getGender(), h.getDay(), h.getMonth(), h.getYear(),
                h.getHeight(), h.getWeight(), h.ageInYears(), h.computeBodyMassIndex(), h.maxHeartRate(),
                h.targetHeartRateRange());

        System.out.println();
        System.out.println("===============================");
        System.out.println();
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

    }

}
