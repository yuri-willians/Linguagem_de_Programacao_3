/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        Circle.makeCircle(stage, scene, pane);
        Pointers.makePointers(stage, scene, pane);
        Texts.makeTexts(stage, scene, pane);
        CenterCircle.makeCenterCircle(stage, scene, pane);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
