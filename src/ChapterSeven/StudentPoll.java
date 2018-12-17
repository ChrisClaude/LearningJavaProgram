package ChapterSeven;
/*
Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
in an integer array and determine the frequency of each rating.
 */

import java.security.SecureRandom;

public class StudentPoll {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] student_rates = new int[20];

        for (int i = 0; i < student_rates.length; i++) {
            student_rates[i] = random.nextInt(5) + 1;
        }

        int[] frequency = new int[6];

        // this is a way to computes the frequency of values in an array using for loop
        for (int x = 0; x < student_rates.length; x++) {
            ++frequency[student_rates[x]];
        }

        System.out.printf("%s%11s%n", "Rating", "Frequency");

        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%6d%11s%n", i, frequency[i]);
        }

    }

}
