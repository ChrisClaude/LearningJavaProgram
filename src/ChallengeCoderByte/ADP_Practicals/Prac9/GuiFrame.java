package ChallengeCoderByte.ADP_Practicals.Prac9;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * author Claude DE-TCHAMBILA
 * student number: 217035027
 */
public class GuiFrame extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JRadioButton green;
    private JRadioButton yellow;
    private JLabel textfieldLabel; // Textfield text
    private JLabel comboBoxLabel; // ComboBox text
    private JLabel radioButtonText; // RadioButton text
    private JComboBox<String> colours;
    private ButtonGroup colourGroup;
    private TextField textField;
    private Button red;
    private Button blue;
    private Button read;
    private Button exit;

    public GuiFrame() {
        super("Fun with colours");
        setLayout(new BorderLayout(5, 5));

        String[] colourNames = {"Cyan", "Blue", "Pink", "Magenta", "Orange"};

        // initializing the comboBox
        colours = new JComboBox<>(colourNames);
        colours.setMaximumRowCount(3);

        colours.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (colours.getSelectedIndex() == 0) {
                        textArea.setBackground(Color.CYAN);

                        String text = "Cyan combobox" + "\n";

                        textArea.append(text);
                    }
                    if (colours.getSelectedIndex() == 1) {
                        textArea.setBackground(Color.BLUE);
                        String text = "Blue combobox" + "\n";

                        textArea.append(text);
                    }
                    if (colours.getSelectedIndex() == 2) {
                        textArea.setBackground(Color.PINK);
                        String text = "Pink combobox" + "\n";

                        textArea.append(text);
                    }
                    if (colours.getSelectedIndex() == 3) {
                        textArea.setBackground(Color.MAGENTA);

                        String text = "Magenta combobox" + "\n";

                        textArea.append(text);
                    }
                    if (colours.getSelectedIndex() == 4) {
                        textArea.setBackground(Color.ORANGE);

                        String text = "Orange combobox" + "\n";

                        textArea.append(text);
                    }
                }

            }
        });

        // initializing the radio buttons
        green = new JRadioButton("Green", true);
        yellow = new JRadioButton("Yellow");
        green.addActionListener(this);
        yellow.addActionListener(this);


        // initializing the labels
        radioButtonText = new JLabel("RadioButton");
        textfieldLabel = new JLabel("Textfield");
        comboBoxLabel = new JLabel("Textfield");

        // initializing the textfield and the textarea
        textField = new TextField(10);
        textArea = new JTextArea(50, 30);
//        textArea.setSize(50, 50);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + "\n";

                textArea.setText(textArea.getText() + text);
            }
        });

        // initializing the buttons
        red = new Button("Red");
        blue = new Button("Blue");
        read = new Button("Read");
        exit = new Button("Exit");

        // adding radioButtons to button group
        colourGroup = new ButtonGroup();
        colourGroup.add(green);
        colourGroup.add(yellow);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));
        panel.setSize(70, 50);
        panel.add(radioButtonText);
        panel.add(green);
        panel.add(yellow);
        panel.add(textfieldLabel);
        panel.add(textField);
        panel.add(comboBoxLabel);
        panel.add(colours);

        JPanel panel1 = new JPanel();
        panel1.add(red);
        panel1.add(blue);
        panel1.add(read);
        panel1.add(exit);

        JPanel panel2 = new JPanel();
        panel2.add(textArea);

        add(panel, BorderLayout.WEST);
        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.CENTER);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == green)
            textArea.setBackground(Color.GREEN);
        if (e.getSource() == yellow)
            textArea.setBackground(Color.YELLOW);

        if (e.getSource() == colourGroup) {

        }
    }

}
