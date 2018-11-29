package ChapterThree;

import javax.swing.JOptionPane;

/**
 * InputDialog.java
 * This program asks the user to input his name
 * then it welcomes the user by name
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 13 November 2018
 */

public class InputDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        // Create the message
        String message = String.format("Welcome, %s, to java programming!", name);

        // display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);

    }

}
