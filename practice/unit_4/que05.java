import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class que05 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        String array[] = { "c++", "Java", "JS" };
        JComboBox box = new JComboBox(array);

        frame.add(box);
        frame.setSize(350, 350);
        frame.setVisible(true);

        JButton button = new JButton("SHOW");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "" + box.getItemAt(box.getSelectedIndex());
                System.out.println(data);
            }
        });

    }

}
