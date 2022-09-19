// Write a Java program that will Create one image button and clicking on it the messeage 
// “welcome to advance java” will be printed on terminal.

import java.awt.event.*;
import javax.swing.*;

public class Que05 {

    public static void main(String[] args) {
        // frame

        JFrame frame = new JFrame("Closing button demo");
        frame.setSize(400, 400);
        frame.setVisible(true);
        // button

        JButton button = new JButton(new ImageIcon("./photo.png"));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("welcome to advance java");
            }
        });
        frame.add(button);
    }

}