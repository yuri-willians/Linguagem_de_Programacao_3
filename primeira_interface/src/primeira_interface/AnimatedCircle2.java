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
public class AnimatedCircle2 extends Application implements Runnable {

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
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (circle.getTranslateX() >= stage.getWidth()) {
                circle.setTranslateX(-80);
            } else {
                circle.setTranslateX(circle.getTranslateX() + 1);
            }
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
