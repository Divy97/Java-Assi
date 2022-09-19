
// Write a Java program that will Create three button named as “BUTTON1”,“BUTTON2” 
// and “BUTTON3”.When we click on any button the text written on that button will be 
// printed on terminal.
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Que04 extends JFrame {

    JButton button1, button2, button3;
    Container con;

    public Que04() {

        setSize(300, 100);
        // setVisible(true);

        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");

        con.add(button1);
        con.add(button2);
        con.add(button3);

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
    }

    // public void actionPerformed(ActionEvent e) {
    // Object buttonObject = e.getSource();
    // if (buttonObject == button1) {
    // System.out.println(e.getActionCommand());
    // } else if (buttonObject == button2) {
    // System.out.println(e.getActionCommand());
    // } else if (buttonObject == button3) {
    // System.out.println(e.getActionCommand() + " hey ");
    // } else {
    // System.out.println("");
    // }
    // }

    public static void main(String[] args) {
        Que04 b = new Que04();
        b.setVisible(true);
    }
}
