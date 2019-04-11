package ChallengeCoderByte.ADP_Practicals.Pra8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Prac_8.java
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 08 April 2019
 */
public class GuiFrame extends JFrame implements ActionListener {

    private TextField textField1;
    private TextField textField2;
    private TextField textField3;
    private Button button;
    private Button redButton, blueButton, greenButton;


    public GuiFrame() {
        super("Integers Sum");

        setLayout(new FlowLayout());

        textField1 = new TextField(12);
        textField2 = new TextField(12);
        textField3 = new TextField("Answer", 8);

        button = new Button("Calculate Sum");
        redButton = new Button("Red");
        blueButton = new Button("Blue");
        greenButton = new Button("Green");

        add(textField1);
        add(textField2);
        add(button);
        add(textField3);
        add(redButton);
        add(blueButton);
        add(greenButton);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = textField1.getText();
                String str2 = textField2.getText();
                int result = 0;

                if (str1 != null && str2 != null) {

                    try {
                        int num1 = Integer.parseInt(str1);
                        int num2 = Integer.parseInt(str2);

                        result = num1 + num2;
                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(null, "Please enter integers in the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    textField3.setText(String.format("%d", result));
                }
            }
        });

        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            JOptionPane.showMessageDialog(null, "The red button has been clicked", "Button Clicked", JOptionPane.INFORMATION_MESSAGE);
            textField3.setBackground(Color.RED);
        } else if (e.getSource() == blueButton) {
            JOptionPane.showMessageDialog(null, "The blue button has been clicked", "Button Clicked", JOptionPane.INFORMATION_MESSAGE);
            textField3.setBackground(Color.BLUE);
        } else if (e.getSource() == greenButton) {
            JOptionPane.showMessageDialog(null, "The green button has been clicked", "Button Clicked", JOptionPane.INFORMATION_MESSAGE);
            textField3.setBackground(Color.GREEN);
        }
    }
}

class Main {

    public static void main(String[] args) {
        GuiFrame guiFrame = new GuiFrame();

        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setSize(260, 190);
        guiFrame.setVisible(true);
        guiFrame.setResizable(false);
    }

}
