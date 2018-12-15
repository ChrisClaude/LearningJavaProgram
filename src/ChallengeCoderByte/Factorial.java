package ChallengeCoderByte;

import java.util.Scanner;

/**
 * Factorial with recursion
 */
public class Factorial {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.printf("%d! = %d%n", num, factorial(num));
    }

    public static long factorial(int num) {
        if (num <= 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

}
