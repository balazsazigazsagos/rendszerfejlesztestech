package com.example.autoker1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainController {
    public AnchorPane anchorPane;
    public ImageView imgShowedOnScreen;
    public Button addCartoShopBTN;
    public Label osszesar;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void disAppearImage(MouseEvent mouseEvent) {
    }

    public void addNewCartoShop(ActionEvent event) {
    }
}