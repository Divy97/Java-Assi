// Write a Java program that will Create one image button and clicking on it another image
// button must be display.

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Que06 extends JFrame {
    Container con;
    JButton button1, button2;

    public Que06() {
        setSize(600, 600);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));
        button1 = new JButton(new ImageIcon("./photo.png"));

        con.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2 = new JButton(new ImageIcon("./photo2.png"));
                con.add(button2);
                button2.setBounds(0, 150, 200, 200);
            }
        });

    }

    public static void main(String[] args) {
        Que06 b = new Que06();
        b.setVisible(true);
    }
}
