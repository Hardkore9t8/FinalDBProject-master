package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginConnect {
    public Connection login;
    public Connection getLogin() {

        String dbName = "login";
        String userName = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            login = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return login;
    }
}
