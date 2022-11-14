import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowClose extends WindowAdapter {
    public void WindowClosing(WindowEvent we) {
        System.out.println("frame is closed");
        System.exit(0);
    }
}

public class practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J_Label");
        JLabel label = new JLabel();

        label.setText("HEY I AM A LABEL");
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(500, 600);

        WindowClose windowClosing = new WindowClose();
        frame.addWindowListener(windowClosing);
    }
}
