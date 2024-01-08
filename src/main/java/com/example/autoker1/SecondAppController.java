package com.example.autoker1;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SecondAppController extends MainController {
    public SecondApp secondApp;
    public ImageView img;
    public Button submitBTN;
    public Label labelKepLink;
    public Button tallozas;
    public TextField textfield1;
    public TextField textfield2;
    public TextField textfield3;
    public TextField textfield4;

    public void addToAutoker(ActionEvent event) {
        autoAdatKezelo.addAuto(textfield1.getText(),textfield2.getText(),
                textfield3.getText(),textfield4.getText(),labelKepLink.getText());
        secondApp.Close();
    }
}
