/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Pointers {

    static public void makePointers(Stage stage, Scene scene, Pane pane) {
        Line hour = new Line();
        hour.setStartX(pane.getWidth() / 2);
        hour.setStartY(pane.getHeight() / 2);
        hour.setEndX(pane.getWidth() / 2 + 120);
        hour.setEndY(pane.getHeight() / 2 + 30);
        pane.getChildren().add(hour);

        Line minute = new Line();
        minute.setStartX(pane.getWidth() / 2);
        minute.setStartY(pane.getHeight() / 2);
        minute.setEndX(pane.getWidth() / 2 + 120);
        minute.setEndY(pane.getHeight() / 2 + 60);
        pane.getChildren().add(minute);

        Line second = new Line();
        second.setStartX(pane.getWidth() / 2);
        second.setStartY(pane.getHeight() / 2);
        second.setEndX(pane.getWidth() / 2 + 120);
        second.setEndY(pane.getHeight() / 2 + 120);
        pane.getChildren().add(second);

    }

}
