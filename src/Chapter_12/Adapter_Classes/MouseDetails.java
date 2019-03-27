package Chapter_12.Adapter_Classes;

import javax.swing.*;

// MouseDetails.java
// Testing MouseDetailsFrame
public class MouseDetails {

    public static void main(String[] args) {
        MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 150);
        mouseDetailsFrame.setVisible(true);
    }

}
