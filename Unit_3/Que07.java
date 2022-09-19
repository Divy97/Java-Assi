
// Write a Java program that will Perform all mouseevents and print appropriate message 
// related to every event.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Que07 extends JFrame implements MouseListener {
    JButton button;
    Container con;

    public Que07() {

        setSize(300, 300);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));

        button = new JButton("Button");

        con.add(button);

        button.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public static void main(String[] args) {
        Que07 b = new Que07();
        b.setVisible(true);
    }
}