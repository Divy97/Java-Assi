// Write a GUI java program which ask the following details for
// visa application inquary:
// Applicant Name (Text Box), Applicant Mobile No(maximum
// 10 digits in text field), Country (combobox - U.k, USA,
// Canada).
// When user click on Submit Button all the above detail should
// be store in database.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Unit05 extends JFrame implements ActionListener {

    Container con;
    JTextField applicantName;
    JTextField mobileNumber;
    JLabel labelName;
    JLabel countryName;
    JLabel number;
    JButton button;
    JComboBox cb;

    // database
    static final String DB_URL = "jdbc:mysql://localhost:3306/divydb";
    static final String USER = "root";
    static final String PASS = "divy9708";

    public Unit05() {
        setSize(600, 600);
        con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));

        applicantName = new JTextField("Enter your name: ");
        mobileNumber = new JTextField("Enter your mobile number: ");

        button = new JButton("Get details");
        button.addActionListener(this);

        String countries[] = { "U.K", "U.S.A", "Canada" };
        cb = new JComboBox(countries);

        labelName = new JLabel("Name : ");
        countryName = new JLabel("Country : ");
        number = new JLabel("MobileNumber: ");

        con.add(applicantName);
        con.add(mobileNumber);
        con.add(cb);

        con.add(button);

        con.add(labelName);
        con.add(countryName);
        con.add(number);

    }

    public void actionPerformed(ActionEvent e) {
        String name = applicantName.getText();
        String cont = "" + cb.getItemAt(cb.getSelectedIndex());
        String mobNumber = mobileNumber.getText();
        if (e.getSource() == button) {
            labelName.setText(name);
            countryName.setText(cont);
            number.setText(mobNumber);

            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement st = conn.createStatement();

                PreparedStatement stmt = conn.prepareStatement("INSERT INTO inquiry VALUES (?,?,?)");
                stmt.setString(1, name);
                stmt.setString(2, cont);
                stmt.setString(3, mobNumber);

                stmt.executeUpdate();
                stmt.close();
            } catch (Exception error) {
                System.out.println(error);
            }

        }
    }

    public static void main(String[] args) {
        Unit05 b = new Unit05();
        b.setVisible(true);

    }
}
