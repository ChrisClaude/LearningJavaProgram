package ChapterSix.GUICaseStudy;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawBullEye extends JPanel {

    public static void main(String[] args) {
        DrawBullEye drawBullEye = new DrawBullEye();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(drawBullEye);
        application.setSize(250, 255);
        application.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        SecureRandom random = new SecureRandom();
        int red_1 = random.nextInt(255) +1;
        int green_1 = random.nextInt(255) +1;
        int blue_1 = random.nextInt(255) +1;
        int red_2 = random.nextInt(255) +1;
        int green_2 = random.nextInt(255) +1;
        int blue_2 = random.nextInt(255) +1;

        // first set of circles with same colors
        g.setColor(new Color(red_1, green_1, blue_1));
        g.fillOval(10, 10, 200, 200);

        g.setColor(new Color(red_2, green_2, blue_2));
        g.fillOval(35, 35, 150, 150);

        g.setColor(new Color(red_1, green_1, blue_1));
        g.fillOval(60, 60, 100, 100);

        g.setColor(new Color(red_2, green_2, blue_2));
        g.fillOval(85, 85, 50, 50);

        g.setColor(new Color(red_1, green_1, blue_1));
        g.fillOval(97, 97, 25, 25);

        // second set of circles with same colors


    }

}
