package ChallengeCoderByte.ADF_2.Recursion;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        int num;
        System.out.println("Fibonacci Sequence");
        System.out.print("Enter number of elements to display: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
    }

}
