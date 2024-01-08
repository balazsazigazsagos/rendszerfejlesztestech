package com.example.autoker1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MainController {
    public AnchorPane anchorPane;
    public ImageView imgShowedOnScreen;
    public Button addCartoShopBTN;
    public Label osszesar;

    @FXML
    //Új Pane létrehozása megjelenítéshez
    public Pane createPane(int index) {
        Pane pane = new Pane();
        pane.setPrefHeight(240);
        pane.setPrefWidth(200);

        //Visszatérési érték
        return pane;
    }

    public void disAppearImage(MouseEvent mouseEvent) {
    }

    public void addNewCartoShop(ActionEvent event) {
    }
}