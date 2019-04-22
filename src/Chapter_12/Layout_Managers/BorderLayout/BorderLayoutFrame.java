package Chapter_12.Layout_Managers.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// BorderLayoutFrame.java
// BorderLayout containing five buttons
public class BorderLayoutFrame extends JFrame implements ActionListener {

    private final JButton[] buttons; // array of buttons to hide portions
    private static final String[] names = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout layout;

    // set up GUI event handling
    public BorderLayoutFrame() {
        super("BorderLayout Demo");

        layout = new BorderLayout(5, 5); // 5 pixel gaps
        setLayout(layout);
        buttons = new JButton[names.length];

        //create JButtons and register listeners for them
        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }

    // handle button events
    @Override
    public void actionPerformed(ActionEvent e) {
        // check event source and lay out content pane correspondingly
        for (JButton button : buttons) {
            if (e.getSource() == button)
                button.setVisible(false); // hide the button that was clicked
            else
                button.setVisible(true); // show other buttons
        }

        layout.layoutContainer(getContentPane());
    }
}
