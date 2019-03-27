package Chapter_12.JPanel_Subclass_for_Drawing_with_the_Mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class PaintPanel extends JPanel {

    // list of Point references
    private final ArrayList<Point> points = new ArrayList<>();

    // set up GUI and register mouse event handler
    public PaintPanel() {
        // handle frame mouse motion event
        addMouseMotionListener(new MouseMotionAdapter()  { // anonymous inner class
            // stores drag coordinates and repaint
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint(); // repaint JFrame
            }
        });
    }

    // draw ovals in a 4-by-4 bounding box at specified locations on window
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // clears drawing area

        // draw all points
        for (Point point : points)
            g.fillOval(point.x, point.y, 4, 4);
    }
}
