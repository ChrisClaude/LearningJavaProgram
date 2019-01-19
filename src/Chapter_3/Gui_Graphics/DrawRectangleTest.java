package ChapterThree.Gui_Graphics;

import javax.swing.JFrame;

/**
 * DrawRectangleTest.java
 * This is working class of the program
 * that draws a rectangle
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 24 November 2018
 */
public class DrawRectangleTest {

    public static void main(String[] args) {
        DrawRectangle rectangle = new DrawRectangle();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(rectangle);
        app.setSize(272, 272);
        app.setVisible(true);

    }

}
