package ChapterTwo;

import java.util.Scanner;

/**
 * BodyMassIndex.java
 * This is an application that evaluates the body mass index
 * based on the coordinates required, input by the user
 * @author Claude C DE-TCHAMBILA
 * Date: 31 October 2018
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        double height, weight;
        double bodyMassIndex;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight(in kilograms): ");
        weight = input.nextDouble();

        System.out.print("Enter the height(in meters): ");
        height = input.nextDouble();

        bodyMassIndex = weight / Math.pow(height, 2);

        System.out.println();
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5 ");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
        System.out.println("===============================");
        System.out.printf("Your Body Mass Index is: %f", bodyMassIndex);

    }

}
