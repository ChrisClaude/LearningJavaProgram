package ChapterTwo;


import java.util.Scanner;

/**
 * CheckingInputNumber.java
 * Negative, Positive and Zero Values
 * Using simple java techniques this program
 * determines how many of the 5 number inputs of the user
 * are positive, negative or zero
 * @author Claude C DE-TCHAMBILA
 * Date: 31 October 2018
 */
public class CheckingInputNumber {

    public static void main(String[] args) {
        int i, j, k, l, m;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        i = input.nextInt();
        if (i > 0)
            positive = positive +1;
        if (i < 0)
            negative = negative + 1;
        if (i == 0)
            zero = zero +1;

        System.out.print("Enter second number: ");
        j = input.nextInt();
        if (j > 0)
            positive = positive +1;
        if (j < 0)
            negative = negative + 1;
        if (j == 0)
            zero = zero +1;


        System.out.print("Enter third number: ");
        k = input.nextInt();
        if (k > 0)
            positive = positive +1;
        if (k < 0)
            negative = negative + 1;
        if (k == 0)
            zero = zero +1;


        System.out.print("Enter fourth number: ");
        l = input.nextInt();
        if (l > 0)
            positive = positive +1;
        if (l < 0)
            negative = negative + 1;
        if (l == 0)
            zero = zero +1;


        System.out.print("Enter fifth number: ");
        m = input.nextInt();
        if (m > 0)
            positive = positive +1;
        if (m < 0)
            negative = negative + 1;
        if (m == 0)
            zero = zero +1;

        System.out.printf("You input %d positive number(s), %d negative number(s) and %d zero(s)%n",
                positive, negative, zero);

    }

}
