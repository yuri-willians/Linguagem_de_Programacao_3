/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Circle extends Clock {

    static public void makeCircle(Stage stage, Scene scene, Pane pane) {
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle();
        circle.setCenterX(scene.getWidth() / 2);
        circle.setCenterY(scene.getHeight() / 2);
        circle.setRadius(200);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        pane.getChildren().add(circle);
    }
}
