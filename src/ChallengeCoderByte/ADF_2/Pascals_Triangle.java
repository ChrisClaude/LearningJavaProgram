package ChallengeCoderByte.ADF_2;

import java.util.Scanner;

public class Pascals_Triangle {

    public static void main(String[] args) {
        int rows, columns;
        Scanner sc = new Scanner(System.in);

        System.out.printf("This program prints the Pascal's Triangle%n%n" +
                "Please enter the number of rows to be displayed: ");

        rows = sc.nextInt();
        columns = 0;
        int[][] array = new int[rows][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[++columns];

            for (int j = 0; j < array[i].length; j++) {
                if (i >= j) {
                    if (i == j || j == 0)
                        array[i][j] = 1;
                    else if (i > j)
                        array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }

        // displaying the pascal's triangle
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.printf("%d ", array[i][j]);

            System.out.println();
        }
    }

    // this method displays the pascals triangle without using arrays
    /*public static void triangle(int maxRows) {
        int r, num;
        for (int i = 0; i <= maxRows; i++) {
            num = 1;
            r = i + 1;
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }*/
}
