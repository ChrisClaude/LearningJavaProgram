package ChallengeCoderByte.ADF_2.Recursion;

import java.util.Scanner;

/**
 * SumOfIntegers.java
 * This program computes the sum of integers
 * using recursion.
 *
 * @author Claude DE-TCHAMBILA
 * Date: 12/04/2019
 */
public class SumOfIntegers {

    public static int computeSum(int num) {
        if (num == 1)
            return 1;
        else
            return num + computeSum(num - 1);
    }

    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        input = scan.nextInt();

        System.out.printf("The sum is %d", computeSum(input));
    }

}
