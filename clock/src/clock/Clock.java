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
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Clock extends Application {

    /**
     * @param args the command line arguments
     */
    Stage stage = new Stage();
    Pane pane = new Pane();
    Scene scene = new Scene(pane, 500, 500);

    public void start(Stage stage) {
        circle(stage);
        texts(stage);
        clockPointers(stage);

        stage.setScene(scene);
        stage.show();
    }

    public void circle(Stage stage) {
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle();
        circle.setCenterX(scene.getWidth() / 2);
        circle.setCenterY(scene.getHeight() / 2);
        circle.setRadius(200);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        pane.getChildren().add(circle);
    }

    public void texts(Stage stage) {
        Text t_12 = new Text((scene.getWidth() / 2) - 3, 75, "12");
        pane.getChildren().add(t_12);

        Text t_9 = new Text(65, scene.getHeight() / 2, "9");
        pane.getChildren().add(t_9);

        Text t_6 = new Text((scene.getWidth() / 2) - 2, 75 + 360, "6");
        pane.getChildren().add(t_6);

        Text t_3 = new Text(65 + 360, scene.getHeight() / 2, "3");
        pane.getChildren().add(t_3);
    }

    public void clockPointers(Stage stage) {
        Line hour = new Line();
        hour.setStartX(pane.getWidth() / 2);
        hour.setStartY(pane.getHeight() / 2);
        hour.setEndX(pane.getWidth() / 2 + 120);
        hour.setEndY(pane.getHeight() / 2 + 120);
        pane.getChildren().add(hour);
        
        Line minute = new Line();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
