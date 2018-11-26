package ChapterThree.Gui_Graphics;

import javax.swing.JFrame;

/**
 * DrawPanel.java
 * This program test the capabilities
 * of the DrawPanel class
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 23 November 2018
 */

public class DrawPanelTest {

    public static void main(String[] args) {
        //create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();

        // create a new frame to hold the panel
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250, 250);
        app.setVisible(true);
    }

}
