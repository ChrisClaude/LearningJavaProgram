package ChallengeCoderByte;

import java.util.Scanner;

/**
 * Challenge:
 * Have the function changeLetter(str) take the str parameter
 * being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it
 * in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u)
 * and finally return this modified string.
 */
public class LetterChanges {

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or a sentence: ");
        str = input.nextLine();

        System.out.printf("Changed string: %s%n", changeLetter(str));

    }

    public static String changeLetter(String str) {
        String changedString = "";
        char letter;

        // looping through the characters of the string parameter
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);

            // ensuring that letter is in alphabet range
            if (letter >= 'a' && letter <= 'z') {
                // checking whether the current character is z (remember that the character after 'z' is '{')
                if (letter == 'z')
                    changedString += "a";
                else
                    changedString += ++letter; // changing the current letter to following one in the alphabet

                // getting current character from changedString
                letter = changedString.charAt(i);

            /*
                checking for vowels in the changed string
             */
                switch (letter) {
                    case 'a':
                        changedString = changedString.replace('a', 'A');
                        break;
                    case 'e':
                        changedString = changedString.replace('e', 'E');
                        break;
                    case 'i':
                        changedString = changedString.replace('i', 'I');
                        break;
                    case 'o':
                        changedString = changedString.replace('o', 'O');
                        break;
                    case 'u':
                        changedString = changedString.replace('u', 'U');
                        break;
                }
            } else {
                changedString += letter;
            }
        }

        return changedString;
    }


    /*

    Best Solution
    ==========================================================

    public static String changeLetter(String str) {
        StringBuilder result = new StringBuilder();
        char[] strChars = str.toLowerCase().toCharArray();
        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        for (int i = 0; i < str.length(); i++) {
            result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ? replacements[strChars[i] - 97] : strChars[i]);
        }
        return result.toString();
    }

    */

}
