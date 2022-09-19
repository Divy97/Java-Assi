import java.sql.*;
import java.util.Scanner;

public class Que05 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/divydb";
    static final String USER = "root";
    static final String PASS = "divy9708";

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conn.createStatement();

        Scanner input = new Scanner(System.in);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO persons VALUES (?,?,?,?,?)");

        System.out.println("Enter id person to insert");
        int personID = input.nextInt();
        System.out.println("Enter firstName to insert");
        String firstName = input.next();
        System.out.println("Enter lastName to insert");
        String lastName = input.next();
        System.out.println("Enter address to insert");
        String address = input.next();
        System.out.println("Enter city to insert");
        String city = input.next();

        stmt.setInt(1, 105);
        stmt.setString(2, firstName);
        stmt.setString(3, lastName);
        stmt.setString(4, address);
        stmt.setString(5, city);

        stmt.executeUpdate();
        System.out.println("inserted");

        conn.close();
    }
}
