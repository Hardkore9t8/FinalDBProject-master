package databaseproject;

import connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;

public class Controller {

    public TextField teamtextfield;
    public TextField playertextfield;
    public Label teamLabel;
    public Label playerLabel;
    public ChoiceBox teamdropdown;
    public ChoiceBox playerdropdown;
    public Button teambutton;
    public Button playerbutton;


    public void teambutton(ActionEvent actionEvent){
     ConnectionClass connectionClass = new ConnectionClass();
     Connection connection = connectionClass.getConnection();

    }
    public void playerbutton(ActionEvent actionEvent){
playerLabel.setText(playertextfield.getText());
    }
}
