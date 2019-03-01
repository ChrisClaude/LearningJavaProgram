package Chapter_12;

import javax.swing.*;

/**
 * Addition.java
 * Addition program that uses JOptionPane for input and output
 */
public class Addition {

    public static void main(String[] args) {
        // obtain user input from JOptionPane input dialogs
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        // convert String inputs to int va;ues in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }

}
