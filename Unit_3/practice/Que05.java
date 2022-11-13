// Write a Java program that will Create one image button and clicking on it the message 
// “welcome to advance java” will be printed on terminal.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Que05 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        frame.setSize(500, 500);

        JButton button = new JButton(new ImageIcon("../photo.png"));
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "HEY") {
                    System.out.println("welcome to advance java");
                }
            }
        });

        frame.setVisible(true);
    }
}
