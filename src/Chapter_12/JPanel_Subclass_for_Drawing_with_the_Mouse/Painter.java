package Chapter_12.JPanel_Subclass_for_Drawing_with_the_Mouse;

import javax.swing.*;
import java.awt.*;

// Painter.java
// Testing PaintPanel
public class Painter {

    public static void main(String[] args) {
        // create JFrame
        JFrame application = new JFrame("A simple paint program");

        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);

        // create a label and place it in SOUTH of BorderLayout
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }

}
