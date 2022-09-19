// Create a JDBC program to perform the insertion of data into database.

import java.sql.*;

public class Que01 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/divydb";
    static final String USER = "root";
    static final String PASS = "divy9708";

    public static void main(String[] args) {
        // Open a connection
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            // Execute a query
            String sql = "INSERT INTO persons VALUES (103, 'Ali', 'Akbar', 'xyz avenue', 'mumbai')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO persons VALUES (104, 'Zubair', 'Ahmed', 'wwe avenue', 'goa')";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}