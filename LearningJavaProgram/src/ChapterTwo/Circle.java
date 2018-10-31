package ChapterTwo;

import java.util.Scanner;

/**
 * Circle.java
 * Diameter, Circumference and Area of a Circle
 * @author Claude C DE-TCHAMBILA
 * Date: 31 October 2018
 */

public class Circle {

    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = input.nextInt();

        System.out.printf("Diameter: %d\n", 2*radius);
        System.out.printf("Circumference: %f\n", 2*Math.PI*radius);
        System.out.printf("Area: %f\n", Math.PI*Math.pow(radius, 2));

    }

}
