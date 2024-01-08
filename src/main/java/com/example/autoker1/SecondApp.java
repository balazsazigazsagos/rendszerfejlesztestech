package com.example.autoker1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecondApp extends Application {
    public Stage stage;
    public void start(Stage stage) throws Exception{
        this.stage=stage;
        FXMLLoader fxmlLoader=new FXMLLoader(SecondApp.class.getResource("autohozzaadas-view.fxml"));
        Scene scene=new Scene(fxmlLoader.load());

    }
}
