/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Clock extends Application implements Runnable {

    /**
     * @param args the command line arguments
     */
    Stage stage = new Stage();
    Pane pane = new Pane();
    Scene scene = new Scene(pane, 500, 500);

    @Override
    public void start(Stage stage) {

        Circle.makeCircle(stage, scene, pane);
        Pointers.makePointers(stage, scene, pane);
        Texts.makeTexts(stage, scene, pane);
        CenterCircle.makeCenterCircle(stage, scene, pane);

        Thread t = new Thread(this);
        t.setDaemon(true);
        t.start();

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    pane.getChildren().clear();

                    Circle.makeCircle(stage, scene, pane);

                    Pointers.makePointers(stage, scene, pane);

                    Texts.makeTexts(stage, scene, pane);

                    CenterCircle.makeCenterCircle(stage, scene, pane);
                }

            });

        }

    }

}
