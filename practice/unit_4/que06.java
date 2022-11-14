import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class que06 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("MENU");
        JMenu subMenu = new JMenu("SUBMENU");

        JMenuItem i1 = new JMenuItem("item1");
        JMenuItem i2 = new JMenuItem("item2");
        JMenuItem i3 = new JMenuItem("item3");
        JMenuItem i4 = new JMenuItem("item4");
        JMenuItem i5 = new JMenuItem("item5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        subMenu.add(i4);
        subMenu.add(i5);

        menu.add(subMenu);
        mb.add(menu);

        frame.setJMenuBar(mb);
        frame.setSize(350, 350);
        frame.setVisible(true);

        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i1");
            }
        });

        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i2");
            }
        });
        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i3");
            }
        });
        i4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i4");
            }
        });

        i5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i5");
            }
        });
    }
}
