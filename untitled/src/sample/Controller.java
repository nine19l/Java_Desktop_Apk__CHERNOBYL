package sample;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;


import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class Controller  implements Initializable {
@FXML
    public Parent root;
    //@FXML
    //public Stage stage;
    @FXML
    public Scene scene;


    @FXML
    public HBox aaa;

    @FXML
   public TextField a1,a2,a3;

    @FXML
    public Button btn,btn1;
@FXML
 public Label redi;


@FXML
public final void getOnMouseEntered(){

    btn.setStyle(("-fx-background-color : #7cb9e8;"));



    }
    @FXML
    public final void getOnMouseExited(){

        btn.setStyle(("-fx-background-color : #0fc0fc;"));

    }

    @FXML
    public final void getOnMouseEntered1(){

        btn1.setStyle(("-fx-background-color : #7cb9e8;"));



    }
    @FXML
    public final void getOnMouseExited1(){

        btn1.setStyle(("-fx-background-color : #0fc0fc;"));

    }

@FXML
    public void ds(ActionEvent event) {

   System.exit(0);

    }

@FXML

    public void dsl(javafx.event.ActionEvent event) {

if((a3.getText().contains("@")) ){

    if ((a3.getText().contains("."))){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apk?autoReconnect=true&useSSL=false", "root", "Malek2002");
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * from apkkkkk where username='" + a1.getText() + "'");

        String duplicate = null;

        while (rs.next()) {

            duplicate = rs.getString(1);

        }

        if (duplicate == null) {

            stmt.executeUpdate("INSERT INTO apkkkkk (username,password,email) VALUES ('" + a1.getText() + "','" + a2.getText() + "','" + a3.getText() + "')");

            con.close();


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("APK");
            alert.setHeaderText("Sign up");
            alert.setContentText("Sign up succeful :)");

            alert.showAndWait();


        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("APK eroor");
            alert.setHeaderText("Sign up");
            alert.setContentText("there'is already a user with this name :(");

            alert.showAndWait();
        }


    } catch (Exception ex) {

        System.out.println("Capatchiro");

        System.out.print(ex);
        ex.printStackTrace();


    }
}else {
    Alert alert = new Alert(Alert.AlertType.WARNING);
    alert.setTitle("APK eroor");
    alert.setHeaderText("Sign up");
    alert.setContentText("Email wrong format :(");

    alert.showAndWait();


}}else {
    Alert alert = new Alert(Alert.AlertType.WARNING);
    alert.setTitle("APK eroor");
    alert.setHeaderText("Sign up");
    alert.setContentText("Email wrong format :(");

    alert.showAndWait();


}



}

@FXML
    public void qqq(MouseEvent mouseEvent) {
        redi.setTextFill(Color.BLUE);

    }
@FXML
    public void qqqq(MouseEvent mouseEvent) {

        redi.setTextFill(Color.BLACK);
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
@FXML
    public void pk(MouseEvent mouseEvent) throws IOException {

aaa.getScene().getWindow().hide();
    Parent root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
    Scene scene = new Scene(root,797,599);
   Stage primaryStage = new Stage();
    primaryStage.setTitle("Sign in");
    primaryStage.setScene(scene);
    primaryStage.show();
    primaryStage.setResizable(false);


}
}

