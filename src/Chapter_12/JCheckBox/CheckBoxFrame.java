package Chapter_12.JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * CheckBoxFrame.java
 * JCheckBoxes and item events
 */
public class CheckBoxFrame extends JFrame{

    private final JTextField textField; // displays text in changing fonts
    private final JCheckBox boldJCheckBox; // to select/deselect bold
    private final JCheckBox italicJCheckBox; // to select/deselect italic

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        // set up JTextField and set its font
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField); // add textField to JFrame

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox); // add bold checkbox to JFrame
        add(italicJCheckBox); // add italic checkbox to JFrame

        // register listeners for JCheckboxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    }

    // private inner class for ItemListener event handling
    private class CheckBoxHandler implements ItemListener {

        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null; // stores the font

            // determine which CheckBoxes are checked and create Font
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldJCheckBox.isSelected())
                font= new Font("Serif", Font.BOLD, 14);
            else if (italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);
        }
    }
}
