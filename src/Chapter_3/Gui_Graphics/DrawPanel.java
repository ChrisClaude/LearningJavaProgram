package ChapterThree.Gui_Graphics;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * DrawPanel.java
 * This program is a tutorial on
 * how to draw simple lines in java
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 23 November 2018
 */

public class DrawPanel extends JPanel {

    // draws an X from the corners of the panel
    public void paintComponent(Graphics g) {

        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        // draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);

    }

}
