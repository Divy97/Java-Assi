// Write a Java program to that will Create one frame with a label “WELCOME TO GLS UNIVERSITY”.

import javax.swing.*;

public class Que01 {
    public static void main(String[] args) {

        // objects
        JFrame frame = new JFrame("Label Frame");
        JLabel label = new JLabel();

        // frame
        frame.setSize(200, 400);
        frame.setVisible(true);

        // label
        label.setText("GLS UNIVERSITY");
        frame.add(label);

    }
}