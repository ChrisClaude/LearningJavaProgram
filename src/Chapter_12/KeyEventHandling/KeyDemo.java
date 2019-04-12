package Chapter_12.KeyEventHandling;

import javax.swing.*;

public class KeyDemo {

    public static void main(String[] args) {
        KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350, 100);
        keyDemoFrame.setVisible(true);
    }

}