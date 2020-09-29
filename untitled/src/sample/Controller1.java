package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.Callable;


public class Controller1 {

    @FXML
    public HBox qw;

    @FXML
    public Label idi;
    @FXML
    public Button bttn1,bttn2;

@FXML
public TextField ttt,ttt1;

    @FXML
    public void gg(MouseEvent mouseEvent) {

        bttn1.setStyle(("-fx-background-color : #7cb9e8;"));

    }
@FXML
    public void gg1(MouseEvent mouseEvent) {
    bttn1.setStyle(("-fx-background-color : #0fc0fc;"));

    }
@FXML
    public void gg2(MouseEvent mouseEvent) {
    bttn2.setStyle(("-fx-background-color : #7cb9e8;"));

    }

@FXML
    public void gg3(MouseEvent mouseEvent) {

        bttn2.setStyle(("-fx-background-color : #0fc0fc;"));
    }

    public void qqq(ActionEvent event) {

System.exit(0);



    }


    public void sin(ActionEvent event) {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apk?autoReconnect=true&useSSL=false","root","Malek2002");
            Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery("SELECT * FROM apkkkkk WHERE username ='"+ttt.getText()+"' AND password='"+ttt1.getText()+"'");

if (rs.next()){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("APK");
    alert.setHeaderText("Sign in");
    alert.setContentText("Sign in succeful :)");

    alert.showAndWait();
}else {

    Alert alert = new Alert(Alert.AlertType.WARNING);
    alert.setTitle("APK eroor");
    alert.setHeaderText("Sign in");
    alert.setContentText("there'is no user with those info :(");

    alert.showAndWait();

}


        }catch (Exception ex){

        }


    }

    public void me(MouseEvent mouseEvent) {

        idi.setTextFill(Color.BLUE);
    }

    public void ml(MouseEvent mouseEvent) {
        idi.setTextFill(Color.BLACK);

    }


    public void ssd(MouseEvent mouseEvent) throws IOException {

        qw.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root,797,599);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Sign up");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);


    }
}
