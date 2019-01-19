package ChapterFive.DrawingShapes;

import java.awt.Graphics;
import javax.swing.JPanel;
/**
 * Shapes.java
 * This is the class that draws the shapes
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 2 December 2018
 */
public class Shapes extends JPanel{

    private int choice;

    // constructor
    public Shapes(int userChoice){
        choice = userChoice;
    }

    // draws a cascade of shapes starting from the upper-left corner
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 0; i < 10; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
            }
        }
    }

}
