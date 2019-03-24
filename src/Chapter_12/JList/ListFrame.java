package Chapter_12.JList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

// ListFrame.java
// JList that displays a list of colors
public class ListFrame extends JFrame {

    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    private final JList<String> colorJList; // list to display colors

    // ListFrame constructor add JScrollPane containing JList to JFrame
    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<>(colorNames); // list of colorNames
        colorJList.setVisibleRowCount(5); // displays five rows at once

        // do not allow multiple selections
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add a JScrollPane containing JList to frame
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
            }
        });
    }

}
