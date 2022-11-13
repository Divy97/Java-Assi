
// Write a Java program that will Create one button named as “click me” and clicking on it 
// the message “welcome to advance java” will be printed on terminal.

import javax.swing.*;
import java.awt.event.*;

public class Que03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("CLICK ME");

        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "CLICK ME") {
                    System.out.println("welcome to advance java");
                }
            }
        });
    }
}
