package Chapter_12.JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ButtonFrame.java
// Command buttons and action events
public class ButtonFrame extends JFrame{

    private final JButton plainJButton; // button with just text
    private final JButton fancyJButton; // button with icons

    // ButtonFrame adds JButtons JFrame
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button"); // button with text
        add(plainJButton); // add plainJButton to JFrame

        Icon bug1 = new ImageIcon(getClass().getResource("/Chapter_12/JLabel/Bug1.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("/Chapter_12/JButton/bug_green.png"));
        fancyJButton = new JButton("Fancy Button", bug1); // set image
        fancyJButton.setRolloverIcon(bug2); // set rollover image
        add(fancyJButton); // add fancyJButton to JFrame

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    //inner class for button event handling
    private class ButtonHandler implements ActionListener {

        // handle button event
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s",
                    e.getActionCommand()));
        }
    }
}
