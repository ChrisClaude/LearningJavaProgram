package ChapterSix.GUICaseStudy;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SmileyFace.java
 * Drawing a smiley face using colors and filled shapes
 */
public class SmileyFace extends JPanel {

    public static void main(String[] args) {
        SmileyFace panel = new SmileyFace();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230, 250);
        app.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // draw the mouth
        g.fillOval(50, 110, 120, 60);

        // touch up the  mouth into a smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }

}
