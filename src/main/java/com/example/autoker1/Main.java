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
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("autokereskedes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainController controller=fxmlLoader.getController();
        controller.application=this;
        controller.initalize();
        stage.setTitle("Kókány autókereskedés bt.");
        //teljes képernyős window
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
    public void Hide() {
        stage.hide();
    }
    public void Refresh(){
        try {
            stage.close();
            start(stage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}