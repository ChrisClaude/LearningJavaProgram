package Chapter_12.Layout_Managers.Using_Panels_for_Complex_Layouts;

import javax.swing.*;
import java.awt.*;

// PanelFrame.java
// Using a JPanel to help lay out components
public class PanelFrame extends JFrame {

    private final JPanel buttonJPanel; // panel to hold buttons
    private final JButton[] buttons;

    // no-argument constructor
    public PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        // create and add buttons
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button" + (count + 1));
            buttonJPanel.add(buttons[count]); // add button to panel
        }

        add(buttonJPanel, BorderLayout.SOUTH); // add panel to JFrame
    }

}
