package ChallengeCoderByte.ADF_2.Term_1_Test;

import java.util.Scanner;

/**
 * Question_2.java
 * This is a program on question 2
 * that displays figure 2 on the question paper
 *
 * @author Claude DE-TCHAMBILA (217035027)
 */
public class Question_2 {

    public static void main(String[] args) {
        int rows;
        int columns = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        rows = scan.nextInt();

        int[][] array = new int[rows][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[++columns];

            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == 0)
                    array[i][j] = 1;
                else if (i > j)
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];

            }


        }

        // displaying the array
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println();
        }
    }

}
