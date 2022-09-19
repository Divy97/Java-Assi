// Write a Java program that will Create one button named as “click me” and clicking on it 
// the message “welcome to advance java” will be printed on terminal.

import java.awt.event.*;
import javax.swing.*;

public class Que03 {

    public static void main(String[] args) {
        // frame

        JFrame frame = new JFrame("Closing button demo");
        frame.setSize(200, 400);
        frame.setVisible(true);
        // button

        JButton button = new JButton("Click Here");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "Click Here") {
                    System.out.println("BUTTON CLICKED");
                }
            }
        });
        frame.add(button);
    }

}
