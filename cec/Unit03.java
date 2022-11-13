
// Write a GUI java program which contain JButton and JLabel
// controls on JFrame. Initialize the label value with 0. When
// user click on button increment counter by one and display the
// value on label. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Unit03 extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    Container con;
    int increment = 0;

    public Unit03() {
        setSize(600, 600);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));

        button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("0");

        con.add(label);
        con.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Click me") {
            increment++;
            label.setText("" + increment);
        }
    }

    public static void main(String[] args) {
        Unit03 b = new Unit03();
        b.setVisible(true);
    }
}