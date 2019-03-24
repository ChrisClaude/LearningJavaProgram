package Chapter_12.MultipleSelectionList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelectionFrame extends JFrame {

    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
            "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private final JList<String> colorJList; // list to hold color names
    private final JList<String> copyJList; // list to hold copied names
    private JButton copyJButton; // button to copy to selected names

    // MultipleSelectionFrame constructor
    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<>(colorNames); // list of color names
        colorJList.setVisibleRowCount(5); // show five rows
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList)); // add list with scrollpane

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              // place selected values in copyJList
                                              copyJList.setListData(
                                                      colorJList.getSelectedValuesList().toArray(new String[0])
                                              );
                                          }
                                      }
        );

        add(copyJButton); // add copy button to JFrame

        copyJList = new JList<>(); // list to hold copied color names
        copyJList.setVisibleRowCount(5); // shows 5 rows
        copyJList.setFixedCellWidth(100); // set width
        copyJList.setFixedCellHeight(15); // set height
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList)); // add list with scrollpane
    }

}
