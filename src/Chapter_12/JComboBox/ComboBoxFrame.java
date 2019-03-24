package Chapter_12.JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// ComboBoxFrame.java
// JComboBox that displays a list of image names.
public class ComboBoxFrame extends JFrame {

    private static final String[] names = {"bug1.GIF", "bug2.GIF", "travelbug.gif", "buganim.gif"};
    private final JComboBox<String> imagesJComboBox; // holds icon names
    private final JLabel label; // displays selected icon

    //FIXME Sort out the issue, the class can't load the images
    // - link the string argument in every getResource() method to the string values in the names array above
    private final Icon[] icons = {new ImageIcon(getClass().getResource("/Chapter_12/JComboBox/bug_blue.png")),
            new ImageIcon(getClass().getResource("/Chapter_12/JComboBox/bug_red.png")),
            new ImageIcon( getClass().getResource("/Chapter_12/JComboBox/bug_screwdriver.png")),
            new ImageIcon(getClass().getResource("/Chapter_12/JComboBox/bug_yellow.png"))};

    // ComboBoxFrame constructor adds JComboBox to JFrame
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout()); // set frame layout

        imagesJComboBox = new JComboBox<>(names); // set up JComboBox
        imagesJComboBox.setMaximumRowCount(3); // display three rows

        imagesJComboBox.addItemListener(new ItemListener() { // anonymous inner class
            // handle JComboBox event
            @Override
            public void itemStateChanged(ItemEvent e) {
                // determine whether item selected
                if (e.getStateChange() == ItemEvent.SELECTED)
                    label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
            }
        });

        add(imagesJComboBox); // add combo box to JFrame
        label = new JLabel(icons[0]); // display first icon
        add(label);
    }

}
