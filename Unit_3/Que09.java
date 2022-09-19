
// Write a Java program that will print your name as lable whenevr you click on the button.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Que09 extends JFrame {
    Container con;
    JButton button1;
    JLabel label;

    public Que09() {
        setSize(600, 600);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));
        button1 = new JButton("Click me");

        label = new JLabel("Click button to get Name");
        con.add(label);
        con.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Divy");
            }
        });

    }

    public static void main(String[] args) {
        Que09 b = new Que09();
        b.setVisible(true);
    }
}
