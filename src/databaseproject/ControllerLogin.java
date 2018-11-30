package databaseproject;

import connectivity.LoginConnect;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ControllerLogin {

    public TextField userField;
    public PasswordField passField;
    public Label passLabel;
    public Label userLabel;

    public void button(ActionEvent actionEvent) throws SQLException {
        LoginConnect loginConnect = new LoginConnect();
        Connection connection = loginConnect.getLogin();

        String sql = "INSERT INTO USER VALUES('" + userField.getText() + "')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }
}