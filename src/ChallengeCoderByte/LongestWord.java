package ChallengeCoderByte;

import java.util.Scanner;

/*
Challenge
Using the Java language, have the function LongestWord(sen) take the sen parameter
being passed and return the largest word in the string. If there are two or more
words that are the same length, return the first word from the string with that length.
Ignore punctuation and assume sen will not be empty.

Sample Test Cases
Input:"fun&!! time"

Output:"time"


Input:"I love dogs"

Output:"love"
 */

public class LongestWord {

    public static String LongestWord(String sen) {


        return sen;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
