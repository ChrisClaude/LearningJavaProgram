package ChallengeCoderByte.ADF_2.Term_1_Test;

import java.util.Scanner;

/**
 * Question_1.java
 * This is a program on question 1
 * that displays figure 1 on the question paper
 *
 * @author Claude DE-TCHAMBILA (217035027)
 */
public class Question_1 {

    public static void main(String[] args) {
        int rows;
        int columns = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        rows = sc.nextInt();

        int[][] array = new int[rows][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[++columns];

            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    array[i][j] = 1;
                else if (j == 0) {
                    if ((i + 1) % 2 == 0)
                        array[i][j] = 0;
                    else
                        array[i][j] = 1;
                } else {
                    if (array[i][j - 1] == 0)
                        array[i][j] = 1;
                    else if (array[i][j - 1] == 1)
                        array[i][j] = 0;

                }
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
