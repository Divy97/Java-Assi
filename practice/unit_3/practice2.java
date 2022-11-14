import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowClose extends WindowAdapter {
    public void windowClosing(WindowEvent wc) {
        System.out.println("CLOSED");
        System.exit(0);
    }
}

public class practice2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J_Label");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton button1 = new JButton("Click 1!");
        JButton button2 = new JButton("Click 2!");
        JButton button3 = new JButton("Click 3!");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.setSize(500, 600);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "Click 1!") {
                    System.out.println("click 1");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "Click 2!") {
                    System.out.println("click 2");
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "Click 3!") {
                    System.out.println("click 3!");
                }
            }
        });

        WindowClose windowClosing = new WindowClose();
        frame.addWindowListener(windowClosing);
    }
}
