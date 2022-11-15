import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class que03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hey");

        String array[] = { "C++", "JAVA", "JS" };
        JList list = new JList(array);

        frame.add(list);

        frame.setVisible(true);
        frame.setSize(500, 500);
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String data = "";
                if (list.getSelectedIndex() != -1) {
                    data = "language is: " + list.getSelectedValue();
                    System.out.println(data);
                }
            }
        });

        JButton button = new JButton("SHOW");
        frame.add(button);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (list.getSelectedIndex() != -1) {
                    data = "Programming language Selected: " + list.getSelectedValue();
                    System.out.println(data);
                }
            }
        });
    }
}
