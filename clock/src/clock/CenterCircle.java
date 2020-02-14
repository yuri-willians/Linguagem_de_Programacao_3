/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class CenterCircle extends Clock {

    static public void makeCenterCircle(Stage stage, Scene scene, Pane pane) {
        javafx.scene.shape.Circle circleCenter = new javafx.scene.shape.Circle();
        circleCenter.setCenterX(scene.getWidth() / 2);
        circleCenter.setCenterY(scene.getHeight() / 2);
        circleCenter.setRadius(2);
        circleCenter.setStroke(Color.BLACK);
        circleCenter.setFill(Color.BLACK);
        pane.getChildren().add(circleCenter);
    }

}
