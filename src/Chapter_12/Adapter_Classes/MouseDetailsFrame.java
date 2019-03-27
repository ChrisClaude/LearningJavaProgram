package Chapter_12.Adapter_Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// MouseDetailsFrame.java
// Demonstrate mouse clicks and distinguishing between mouse buttons
public class MouseDetailsFrame extends JFrame {

    private final JLabel statusBar; // JLabel at bottom of window
    private String details; // String displayed in the statusBar

    // constructor sets title bar String and register mouse listener
    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // add handler    }

    }

    // inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter {

        // handle mouse-click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent e) {
            int xPos = e.getX();
            int yPos = e.getY();

            details = String.format("Clicked %d time(s) at [%d, %d]", e.getClickCount(), xPos, yPos);

            if (e.isMetaDown()) // right mouse button
                details += " with right mouse button";
            else if (e.isAltDown()) // middle mouse button
                details += " with center mouse button";
            else // left mouse button
                details += " with left mouse button";

            statusBar.setText(details); // displays message in statusBar
        }
    }
}