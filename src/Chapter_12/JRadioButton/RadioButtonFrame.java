package Chapter_12.JRadioButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

// RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
public class RadioButtonFrame extends JFrame {

    private final JTextField textField; // used to display font changes
    private final Font plainFont; // font for plain text
    private final Font boldFont;
    private final Font italicFont;
    private final Font boldItalicFont;
    private final JRadioButton plainJRadioButton; // selects plain text
    private final JRadioButton boldJRadioButton; // selects bold text
    private final JRadioButton italicJRadioButton; // selects italic text
    private final JRadioButton boldItalicJRadioButton; // selects bold and italic text
    private final ButtonGroup radioGroup; // holds radio buttons

    // RadioButtonFrame constructor adds JRadioButtons to JFrame
    public RadioButtonFrame () {
        super("RadioButton test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 25);
        add(textField); // add textfield to JFrame

        // create radio buttons
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        add(plainJRadioButton); // add plain button to JFrame
        add(boldJRadioButton); // add bold button to JFrame
        add(italicJRadioButton); // add italic button to JFrame
        add(boldItalicJRadioButton); // add bold and italic button

        // create logical relationship between JRadioButtons
        radioGroup = new ButtonGroup(); // create ButtonGroup
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        // create font objects
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        // register events for JRadioButtons
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }

    // private inner class to handle radio button events
    private class RadioButtonHandler implements ItemListener {

        private Font font; // font associated with this listener

        public RadioButtonHandler(Font font) {
            this.font = font;
        }

        // handle radio button events
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField.setFont(font);
        }
    }
}
