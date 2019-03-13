package ChallengeCoderByte.ADF_2.Term_1_Test;

/**
 * Question_3.java
 * This is a program on question 3
 * an efficient bubbleSort algorithm
 *
 * @author Claude DE-TCHAMBILA (217035027)
 */
public class Question_3 {

    public static void main(String[] args) {
        int[] Arr = {7, 3, 1, 4, 9, 6, 10, 5};
        int temp;
        int count = 0;
        boolean arraySorted = true;

        System.out.println("Before sorted");
        displayArray(Arr);

        for (int i = 1; i < Arr.length && arraySorted; i++) {
            arraySorted = false;

            for (int j = 0; j < Arr.length - 1; j++) {
                if (Arr[i] < Arr[j]) {
                    temp = Arr[j];
                    Arr[j] = Arr[i];
                    Arr[i] = temp;
                    arraySorted = true;
                }
                count++;
            }
        }

        System.out.println();

        System.out.println("After sorted");
        displayArray(Arr);
        System.out.println("Number of comparisons: " + count);



    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
