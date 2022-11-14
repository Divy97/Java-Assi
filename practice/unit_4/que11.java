
/*1. Write a Java program that will Create one frame with a 
JtoggleButton with two values
“ON” and “OFF”. When the button is clicked the values 
must be print on terminal
screen. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class que11 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 300);
        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        JToggleButton tb1 = new JToggleButton("ON");
        // JToggleButton tb2=new JToggleButton("OFF");
        f.add(tb1);
        // f.add(tb2);
        tb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (tb1.isSelected()) {
                    tb1.setText("OFF");
                    System.out.println("OFF");
                } else {
                    tb1.setText("ON");
                    System.out.println("ON");
                }
            }
        });
    }
}