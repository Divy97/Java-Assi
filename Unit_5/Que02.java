
// Create a JDBC program to retrieve some data from database and display it on terminal.
import java.sql.*;

public class Que02 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/divydb";
    static final String USER = "root";
    static final String PASS = "divy9708";

    public static void main(String args[]) throws Exception {

        int personID;
        String firstName;

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conn.createStatement();
        ResultSet result = st.executeQuery("select * from persons");

        System.out.println("personID" + " firstName");
        while (result.next()) { // Position the cursor 3
            personID = result.getInt(1);
            firstName = result.getString(3); // Retrieve only the first column value
            System.out.println(personID + "       " + firstName);

        }

        conn.close();
        st.close();
    }
}
