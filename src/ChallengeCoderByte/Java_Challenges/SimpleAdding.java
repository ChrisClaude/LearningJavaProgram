package ChallengeCoderByte.Java_Challenges;

import javax.swing.*;

/**
 * SimpleAdding.java
 *
 * Challenge
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num.
 * For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.
 * For the test cases, the parameter num will be any number from 1 to 1000.
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 04 December 2018
 */
public class SimpleAdding {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number");
        int num = Integer.parseInt(input);

        String message = String.format("The sum is: %d", addingNumbers(num));
        JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int addingNumbers(int num) {
        if(num == 1)
            return 1;
        else
            return (num + addingNumbers(num -1));
    }

}
