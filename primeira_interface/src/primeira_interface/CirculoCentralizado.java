/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeira_interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class CirculoCentralizado extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);

        //Essas duas linhas poderiam ser subistituídas por:
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        /*
        circle.setStyle("-fx-stroke: black; -fx-fill: red;");
         */
        //JaxaFX CSS

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("Círculo Sempre Centralizado");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
