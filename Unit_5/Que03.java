
// Create a JDBC program to delete some data from database.
import java.sql.*;

public class Que03 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/divydb";
    static final String USER = "root";
    static final String PASS = "divy9708";

    public static void main(String args[]) throws Exception {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conn.createStatement();

        String sql = "DELETE FROM persons WHERE personID=102;";
        st.executeUpdate(sql);

        conn.close();

    }
}