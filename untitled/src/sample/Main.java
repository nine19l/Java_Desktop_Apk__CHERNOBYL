package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override

    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root,797,599);
        primaryStage.setTitle("Sign up");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
