// Write a Java program to that will Create one frame, when we press on cancel button of 
// the frame the message “frame is closed”should be printed on the terminal.

import javax.swing.*;
import java.awt.event.*;

class WindowClose extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

public class Que02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CLOSING");

        frame.setSize(200, 400);
        frame.setVisible(true);

        WindowClose wc = new WindowClose();
        frame.addWindowListener(wc);
    }
}
