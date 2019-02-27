package ChallengeCoderByte.ADP_Practicals.Prac6;

import javax.swing.*;

public class RunComputer {

    public static void main(String[] args) {
        // taking user input to create objects of Computer and MultimediaComputer
        int processType = Integer.parseInt(JOptionPane.showInputDialog("Enter processor type for computer"));
        int processSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter processor speed for computer"));
        int processType_2 = Integer.parseInt(JOptionPane.showInputDialog("Enter processor type for multimedia computer"));
        int processSpeed_2 = Integer.parseInt(JOptionPane.showInputDialog("Enter processor speed for multimedia computer"));
        int cdRomSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter CD-Rom speed for multimedia computer"));

        // creating objects
        Computer computer = new Computer(processType, processSpeed);
        MultimediaComputer multimediaComputer = new MultimediaComputer(processType_2, processSpeed_2, cdRomSpeed);

        // displaying details of objects
        JOptionPane.showMessageDialog(null, computer, "Computer", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, multimediaComputer, "Multimedia Computer", JOptionPane.INFORMATION_MESSAGE);
    }

}
