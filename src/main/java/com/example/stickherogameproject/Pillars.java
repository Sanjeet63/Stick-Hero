package com.example.stickherogameproject;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Pillars {

    public static void addFirstPilar(List<Rectangle> pillars, AnchorPane anchorPane, double x, double width, double height) {
        Rectangle firstPillar = new Rectangle(x, 204.0, width, height);
        anchorPane.getChildren().add(firstPillar);
        pillars.add(firstPillar);
    }
}
