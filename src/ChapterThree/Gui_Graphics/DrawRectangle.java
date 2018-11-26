package ChapterThree.Gui_Graphics;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * DrawRectangle.java
 * This is the worker class of a program that draws
 * a rectangle
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 23 November 2018
 */
public class DrawRectangle extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width =  (getWidth()/3) * 2;
        int height = (getHeight()/3) * 2;

        // drawing the two length sides of the rectangle
        g.drawLine(getWidth()/3,getHeight()/3, getWidth()/3, height);
        g.drawLine(width,getHeight()/3, width, height);

        // drawing the two width sides of the rectangle
        g.drawLine(getWidth()/3, getHeight()/3, width, getHeight()/3);
        g.drawLine(getWidth()/3, height, width, height);

    }

}
