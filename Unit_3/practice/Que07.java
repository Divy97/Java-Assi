// Write a Java program that will Perform all mouseevents and print appropriate message 
// related to every event.

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Que07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JButton button = new JButton("CLICK");
        frame.add(button);

        button.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }
        });
        frame.setVisible(true);
    }
}
