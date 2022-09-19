// Write a Java program to that will Create one frame, when we press on cancel button of 
// the frame the message “frame is closed” should be printed on the terminal.

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

class WindowClose extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.out.println("frame is closed");
        System.exit(0);
    }
}

public class Que02 {
    public static void main(String[] args) {

        // frame

        JFrame frame = new JFrame("Closing button demo");
        frame.setSize(200, 400);
        frame.setVisible(true);

        // window Closing

        WindowClose windowClosing = new WindowClose();
        frame.addWindowListener(windowClosing);

    }
}
