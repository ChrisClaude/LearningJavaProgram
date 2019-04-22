package Chapter_12.Layout_Managers.FlowLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// FlowLayoutFrame.java
// FlowLayout allows components to flow over multiple lines.
public class FlowLayoutFrame extends JFrame {

    private final JButton leftButton; // button to set alignment left
    private final JButton centerJButton; // button to set alignment center
    private final JButton rightJButton; // button to set alignment right
    private final FlowLayout layout; // layout object
    private final Container container; // container to set layout

    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane(); // get container to layout
        setLayout(layout);

        // set up leftJButton and register listener
        leftButton = new JButton("Left");
        add(leftButton); // add Left button to frame
        leftButton.addActionListener(e -> {
            layout.setAlignment(FlowLayout.LEFT);

            // realign attached components
            layout.layoutContainer(container);
        });

        // set up centerJButton and register listener
        centerJButton = new JButton("Center");
        add(centerJButton); // add Center button to frame
        centerJButton.addActionListener(e -> {
            layout.setAlignment(FlowLayout.CENTER);

            // realign attached components
            layout.layoutContainer(container);
        });

        // set up rightJButton and register listener
        rightJButton = new JButton("Right");
        add(rightJButton); // add Center button to frame
        rightJButton.addActionListener(e -> {
            layout.setAlignment(FlowLayout.RIGHT);

            // realign attached components
            layout.layoutContainer(container);
        });
    }

}
