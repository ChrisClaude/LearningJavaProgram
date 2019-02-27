package ChallengeCoderByte.ADP_Practicals.Prac7;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter radius for the circle"));
        int radius_2 = Integer.parseInt(JOptionPane.showInputDialog("Enter radius for the cylinder"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height for the cylinder"));
        int base = Integer.parseInt(JOptionPane.showInputDialog("Enter base for the cylinder"));

        Circle circle = new Circle(radius);
        Cylinder cylinder = new Cylinder(radius_2, height, base);

        JOptionPane.showMessageDialog(null, circle, "Circle", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, cylinder, "Cylinder", JOptionPane.INFORMATION_MESSAGE);
    }

}
