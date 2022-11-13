// Write a Java program to that will Create one frame with a label “WELCOME TO GLS 
// UNIVERSITY”.

import javax.swing.*;

public class Que01 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("HEy");
        JLabel label = new JLabel();

        frame.setSize(200, 400);
        frame.setVisible(true);

        System.out.println(frame.getTitle());

        label.setText("GLS UNIVERSITY");
        frame.add(label);

    }
}
