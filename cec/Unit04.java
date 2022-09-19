// Write a GUI java program which ask the following details
// from the Customer:
// Customer Name (Text Box), Customer Address(Text Area),
// Customer Gender (Radio Button).
// When user click on Button all the above detail should be
// display on Labels.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Unit04 extends JFrame implements ActionListener {

    Container con;

    JTextField userName;
    JTextArea address;
    JLabel labelName;
    JLabel labelAddress;
    JLabel labelGender;
    JButton button;

    JRadioButton rButton1, rButton2, rButton3;
    ButtonGroup group;

    public Unit04() {
        setSize(600, 600);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));

        userName = new JTextField("Enter your name: ");
        address = new JTextArea("Enter your address");

        button = new JButton("Get details");
        button.addActionListener(this);

        labelName = new JLabel("Name : ");
        labelAddress = new JLabel("Address : ");
        labelGender = new JLabel("Gender : ");

        rButton1 = new JRadioButton("Male");
        rButton2 = new JRadioButton("Female");
        rButton3 = new JRadioButton("Other");

        group = new ButtonGroup();
        group.add(rButton1);
        group.add(rButton2);
        group.add(rButton3);

        con.add(userName);
        con.add(address);
        con.add(rButton1);
        con.add(rButton2);
        con.add(rButton3);
        con.add(button);
        con.add(labelName);
        con.add(labelAddress);
        con.add(labelGender);

    }

    public void actionPerformed(ActionEvent e) {
        String name = userName.getText();
        String addressText = address.getText();
        String gender = "null";
        if (rButton1.isSelected()) {
            gender = "Male";
        }
        if (rButton2.isSelected()) {
            gender = "Female";
        }
        if (rButton3.isSelected()) {
            gender = "Other";
        }

        if (e.getSource() == button) {
            labelName.setText(name);
            labelAddress.setText(addressText);
            labelGender.setText(gender);
        }
    }

    public static void main(String[] args) {
        Unit04 b = new Unit04();
        b.setVisible(true);
    }
}