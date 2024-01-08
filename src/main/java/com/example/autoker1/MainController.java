package com.example.autoker1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.List;

public class MainController {
    public AnchorPane anchorPane;
    public ImageView imgShowedOnScreen;
    public Button addCartoShopBTN;
    public Label osszesar;

    public Main application;

    AutoAdatKezelo autoAdatKezelo = new AutoAdatKezelo();
    List<Auto> osszesAuto = autoAdatKezelo.osszesAuto;

    @FXML
    //Új Pane létrehozása megjelenítéshez
    public Pane createPane(int index) {
        Pane pane = new Pane();
        pane.setPrefHeight(240);
        pane.setPrefWidth(200);

        //ImageView létrehozása - image hozzáadás
        ImageView imageView = new ImageView();
        imageView.setId("img"+index);
        imageView.setFitHeight(133);
        imageView.setFitWidth(200);

        File file = new File(osszesAuto.get(index).kep_link);
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);

        pane.getChildren().add(imageView);

        //Értékesítve gomb és id létrehozása
        Button sellButton = new Button("Értékesítve");
        sellButton.setLayoutX(113);
        sellButton.setLayoutY(201);
        // Egyedi fx:id beállítása
        sellButton.setId("sell" + index);
        sellButton.setOnAction(this::sellCar);
        pane.getChildren().add(sellButton);

        //Label létrehozása
        Label label = new Label();

        //Visszatérési érték
        return pane;
    }

    public void disAppearImage(MouseEvent mouseEvent) {
    }

    public void addNewCartoShop(ActionEvent event) {
    }

    //autó eladásához gomb -értékesítés
    public void sellCar(ActionEvent event) {

    }
}