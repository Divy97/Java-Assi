// Write a Java program that will Create one image button and clicking on it another image
// button must be display.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Que06 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton button = new JButton(new ImageIcon("../photo.png"));
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button2 = new JButton(new ImageIcon("../photo2.png"));
                frame.add(button2);
                button2.setBounds(0, 150, 200, 200);
            }
        });
        frame.setVisible(true);
    }
}
