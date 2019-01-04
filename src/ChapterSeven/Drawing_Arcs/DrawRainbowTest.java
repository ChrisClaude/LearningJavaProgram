package ChapterSeven.Drawing_Arcs;

import javax.swing.*;

/**
 * DrawRainbowTest.java
 * Test application to display a rainbow
 */
public class DrawRainbowTest extends JPanel {

    public static void main(String[] args) {
        DrawRainbow rainbow = new DrawRainbow();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(rainbow);
        app.setVisible(true);
        app.setSize(400, 250);
    }

}
