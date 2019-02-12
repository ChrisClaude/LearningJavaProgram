package ChallengeCoderByte.ADP_Practicals;

/**
 * Find in the array all name starting with B
 */
public class ArrayChecking {

    public static void main(String[] args) {
        String[] names = {"Jon", "Mary", "Brenda", "Sam", "Bulelani"};

        System.out.printf("Names starting with B is(are) the following: %s", checkNames(names));
    }

    public static String checkNames(String[] arr) {
        String result = "";
        int i = 0;
        for (String name : arr) {
            if (name.startsWith("B")) {
                i++;
                result += (i > 1 ? " and " : "") + name;
            }
        }

        return result;
    }

}
