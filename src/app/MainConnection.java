
package app;

import form.LoginForm;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class MainConnection {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Muscle3T;encrypt=true;trustServerCertificate=true;", "sa", "L@csocool");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return conn;
    }
}



