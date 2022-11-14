
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowClose extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.out.println("frame is closed");
        System.exit(0);
    }
}

public class que02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J_Label");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label = new JLabel("hey");
        JCheckBox box1 = new JCheckBox("C++");
        JCheckBox box2 = new JCheckBox("Java");

        frame.add(label);

        box1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (box1.isSelected()) {
                    label.setText(box1.getText() + " Checked");
                    System.out.println(box1.getText() + " Checked");
                } else {
                    System.out.println(box1.getText() + " not Checked");
                }
            }
        });

        box2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (box2.isSelected()) {
                    label.setText(box2.getText() + " Checked");
                    System.out.println(box2.getText() + " Checked");
                } else {
                    System.out.println(box2.getText() + " not Checked");
                }
            }
        });

        frame.add(box1);
        frame.add(box2);

        frame.setVisible(true);
        frame.setSize(500, 600);

        WindowClose windowClosing = new WindowClose();
        frame.addWindowListener(windowClosing);
    }
}
