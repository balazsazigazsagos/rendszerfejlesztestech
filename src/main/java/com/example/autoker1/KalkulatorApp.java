package com.example.autoker1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KalkulatorApp extends Application {
    public Stage stage;
    public void start(Stage stage) throws Exception{
        this.stage=stage;
        FXMLLoader fxmlLoader=new FXMLLoader(KalkulatorApp.class.getResource("kalkulator-view.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        KalkulatorController kalkulatorController=fxmlLoader.getController();
        kalkulatorController.kalkulatorApp=this;
        stage.setTitle("Kalkulátor");
        stage.setScene(scene);
        stage.setWidth(730);
        stage.setHeight(400);
        stage.showAndWait();
    }
    public void Close() {
        stage.close();
    }
}