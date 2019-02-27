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
    }

    /**
     * bubbleSort is a sorting algorithm,
     * it sorts a given array in a descending order.
     * @param array - this an array of numbers to be sorted
     * @return the given array sorted in ascending order
     */
    public static int[] bubbleSort(int [] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int temp;

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                ++count;
            }
        }

        System.out.println(count);
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
