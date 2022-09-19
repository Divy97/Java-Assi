// Write a Java program that will create a square on the frame whenever the mouse is 
// clicked on the frame.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Que08 extends JFrame implements MouseListener {
    Container con;

    public Que08() {

        setSize(300, 300);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));

        con.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillRect(e.getX(), e.getY(), 30, 30);
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
        Que08 b = new Que08();
        b.setVisible(true);
    }
}