
// Write a Java program that will Create three button named as “BUTTON1”,“BUTTON2” 
// and “BUTTON3”.When we click on any button the text written on that button will be 
// printed on terminal.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Que04 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Buttons");
        frame.setSize(1000, 1000);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton button1 = new JButton("BUTTON1");
        JButton button2 = new JButton("BUTTON2");
        JButton button3 = new JButton("BUTTON3");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });

        frame.setVisible(true);
    }
}
