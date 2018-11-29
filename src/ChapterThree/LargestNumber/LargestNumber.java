package ChapterThree.LargestNumber;

import java.util.Scanner;

/**
 * LargestNumber.java
 * In this program the user inputs
 * 10 numbers(integers) that the program processes
 * to find the largest number
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 29 November 2018
 */
public class LargestNumber {

    public static void main(String[] args) {
        int number;
        int largest = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        while(counter < 10) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.printf("%nThe largest number is: %d%n", largest);

    }

}
