package Chapter_12.MouseEventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//MouseTrackerFrame.java
// Mouse event handling
public class MouseTrackerFrame extends JFrame {

    private final JPanel mousePanel; // panel in which mouse events occurs
    private final JLabel statusBar; // displays event information

    // MouseTrackerFrame constructor sets up GUI and
    // registers mouse event handlers
    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");
        //TODO: give the title bar an icon so that the java icon may be
        // replaced by a customized one.
//        this.setIconImage(new ImageIcon(getClass().getResource("/Chapter_12/JButton/bug_green.png")));

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER); // add panel to JFrame

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH); // add label to JFrame

        // create and register listener for mouse and mouse motion events
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseListener(handler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {

        // MouseListener event handlers
        // handle event when mouse released immediately after press
        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(), e.getY()));
        }

        // handle event when mouse pressed
        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));
        }

        // handle when mouse released
        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Released at [%d, %d]", e.getX(), e.getY()));
        }

        // handle event when mouse enters area
        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        // handle event when exits area
        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        // MouseMotionListener event handlers
        // handle event when user drags mouse with button pressed
        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));
        }

        // handle event when user moves mouse
        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));
        }
    }

}
