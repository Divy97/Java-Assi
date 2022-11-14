
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowClose extends WindowAdapter {
    public void WindowClosing(WindowEvent we) {
        System.out.println("frame is closed");
        System.exit(0);
    }
}

public class que01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J_Label");
        JToggleButton button = new JToggleButton("ON");

        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (button.isSelected()) {
                    button.setText("OFF");
                    System.out.println("OFF");
                } else {
                    button.setText("ON");
                    System.out.println("ON");
                }
            }
        });

        frame.add(button);
        frame.setVisible(true);
        frame.setSize(500, 600);

        WindowClose windowClosing = new WindowClose();
        frame.addWindowListener(windowClosing);
    }
}
