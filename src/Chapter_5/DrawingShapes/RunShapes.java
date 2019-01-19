package ChapterFive.DrawingShapes;

import javax.swing.*;

/**
 * Shapes.java
 * This is the class that runs the Shapes class
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 2 December 2018
 */
public class RunShapes {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\nEnter 2 to draw ovals");
        int userChoice = Integer.parseInt(input);

        Shapes panel = new Shapes(userChoice);

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

}
