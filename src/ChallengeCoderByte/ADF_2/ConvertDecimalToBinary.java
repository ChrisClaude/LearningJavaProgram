package ChallengeCoderByte.ADF_2;

import java.util.Scanner;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        System.out.print("Please enter the number you want to convert : ");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if (no > 0) {
            System.out.println("Binary conversion for " + no + " is: ");
            System.out.println("Using Array: ");
            convertToBinary(no);
            System.out.println("\nUsing StringBuilder: ");
            convertToBinaryUsingString(no);
            System.out.println("\nUsing toBinaryString(): ");
            System.out.print(Integer.toBinaryString(no));
        }
    }

    static void convertToBinary(int no) {
        int container[] = new int[100];
        int i = 0;
        while (no > 0) {
            container[i] = no % 2;
            i++;
            no = no / 2;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(container[j]);
        }
    }

    static void convertToBinaryUsingString(int no) {
        StringBuilder result = new StringBuilder();
        while (no > 0) {
            result.append(no % 2);
            no = no / 2;
        }
        System.out.println(result.reverse());
    }

}
