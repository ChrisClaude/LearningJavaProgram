package Chapter_20;

public class GenericMethodTest {

    /*
     *The letters T (for “type”), E (for “element”), K (for “key”) and V (for “value”)
     * are commonly used as type parameters.
     * For other common ones, see http://docs.oracle.com/javase/ tutorial/java/generics/types.html.
     *
     */

    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(intArray); // pass an Integer Array
        System.out.printf("Array doubleArray contains:%n");
        printArray(doubleArray); // pass a Double Array
        System.out.printf("Array characterArray contains:%n");
        printArray(charArray); // pass a Character Array
    }

    // generic method printArray
    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

}
