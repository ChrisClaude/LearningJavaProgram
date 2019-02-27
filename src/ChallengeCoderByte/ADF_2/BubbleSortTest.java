package ChallengeCoderByte.ADF_2;
/*
store the following numbers in an array and sort them in ascending order
9, 5, 7, 3, 2, 8, 16.
use two different sorting algorithms.
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] numbers = {9, 5, 7, 3, 2, 8, 16, 1};

        System.out.println("Before sorting");
        displayArray(numbers);
        System.out.println();

        bubbleSort(numbers);
        System.out.println("After sorting");
        displayArray(numbers);

        // sorting numbers_2 array
        // NB: number_2 is already sorted, we're checking the bubbleSort method performance
        int[] numbers_2 = {13, 18, 23, 33, 41, 52};
        System.out.println();
        System.out.println("Before sorting");
        displayArray(numbers_2);
        System.out.println();

        bubbleSort(numbers_2);
        System.out.println("After sorting");
        displayArray(numbers_2);
    }

    /**
     * bubbleSort is a sorting algorithm,
     * it sorts a given array in a descending order.
     * @param array - this an array of numbers to be sorted
     * @return the given array sorted in ascending order
     */
    public static int[] bubbleSort(int [] array) {
        boolean arrayNotSorted = true;
        int count = 0;
        for (int i = 1; i < array.length && arrayNotSorted; i++) {
            int temp;
            arrayNotSorted = false;

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    arrayNotSorted = true;
                }
                ++count;
            }
        }

        System.out.println("Count for performance: " + count);
        return array;
    }

    // display array method
    public static void displayArray(int[] arr) {
        for (int x : arr) {
            System.out.printf("%d ", x);
        }
        System.out.println();
    }

}
