
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowClose extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.out.println("CLOSED");
        System.exit(0);
    }
}

public class practice3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FRAME");

        frame.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.RED);
                g.fillOval(e.getX(), e.getY(), 30, 30);
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased");
            }

        });
        frame.setVisible(true);
        frame.setSize(500, 600);

        WindowClose windowClosing = new WindowClose();
        frame.addWindowListener(windowClosing);
    }
}
