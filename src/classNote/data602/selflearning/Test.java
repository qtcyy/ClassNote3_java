package classNote.data602.selflearning;

import java.sql.Connection;
import java.sql.DriverManager;
public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/yourDatabaseName", "username", "password"
            );
            System.out.println("Database connected!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
