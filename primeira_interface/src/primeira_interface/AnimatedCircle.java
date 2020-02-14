/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeira_interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class AnimatedCircle extends Application implements Runnable {

    Circle circle = new Circle(40);
    Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);
        stage.setScene(scene);
        circle.setCenterX(40);
        circle.setCenterY(scene.getHeight() / 2);
        pane.getChildren().add(circle);
        stage.show();

        Thread t = new Thread(this);
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void run() {
        boolean forward = true;
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (circle.getTranslateX() >= stage.getWidth() - 80) {
                forward = false;
            }
            if (circle.getTranslateX() <= 0) {
                forward = true;
            }
            if (forward) {
                circle.setTranslateX(circle.getTranslateX() + 5);
            } else {
                circle.setTranslateX(circle.getTranslateX() - 5);
            }
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
