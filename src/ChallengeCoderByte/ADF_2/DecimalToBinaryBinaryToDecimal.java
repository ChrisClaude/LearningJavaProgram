package ChallengeCoderByte.ADF_2;

import java.util.Scanner;

/**
 * DecimalToBinaryBinaryToDecimal.java
 * This app converts a given number from
 * decimal to binary and binary to decimal
 * all according to the interaction of the user with the app
 * @author Claude C DE-TCHAMBILA
 * March 11, 2019
 */
public class DecimalToBinaryBinaryToDecimal {

    public static void main(String[] args) {
        String choice;
        String strBinary;
        int binary;
        int decimal;

        Scanner sc = new Scanner(System.in);

        choice = menu();
        do {

            switch (choice) {
                case "1":
                    System.out.print("Enter a decimal number: ");
                    decimal = sc.nextInt();
                    strBinary = decimalToBinary(decimal);
                    System.out.printf("Decimal: %d\tBinary: %s%n%n", decimal, strBinary);
                    break;
                case "2":
                    System.out.print("Enter a binary number: ");
                    binary = sc.nextInt();
                    decimal = binaryToDecimal(binary);
                    System.out.printf("Binary: %s\tDecimal: %d%n%n", binary, decimal);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number according to the menu");
                    System.out.println();
                    break;
            }

            choice = menu();

        } while (!choice.equals("3"));
    }

    public static String menu() {
        String menuChoice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Decimal to binary");
        System.out.println("2. Binary to decimal");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");

        menuChoice = scanner.next();
        System.out.println();

        return menuChoice;
    }

    public static String decimalToBinary(int decimal) {
        int y = 1;
        String str = "";
//        long result;

        // storing the remainders (of the division of decimal by 2) in str
        while (decimal != 0) {
            y = decimal % 2;
            decimal /= 2;
            str += y;
        }

        // reversing the string to get the expected binary result
        String[] array = str.split("");
        str = "";

        for (int i = array.length - 1; i >= 0; i--) {
            str += array[i];
        }

        // converting the final string to a number
//        result = Long.parseLong(str);

        // return the result
        return str;
    }

    public static int binaryToDecimal(int binary) {
        int num = binary;
        int divide = 1;
        int i;
        int result = 0;

        // checking how many digits binary has
        for (i = 0; num != 0; i++) {
            num /= 10;

            divide *= 10;
        }

        divide /= 10;
        int loop = i;

        for (int j = 0; j < loop; j++) {
            i--;
            int check = binary / divide; // this integer division will help us check in in the following if statement
            // whether we should add up (to result) a corresponding power of 2.
            if (check % 2 == 1)
                result += Math.pow(2, i);

            divide /= 10;
        }

        return result;
    }

}
