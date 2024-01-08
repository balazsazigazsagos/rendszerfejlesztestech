package com.example.autoker1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainController controller=fxmlLoader.getController();

        //teljes képernyős window
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}