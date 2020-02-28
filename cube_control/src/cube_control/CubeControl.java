/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube_control;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.A;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class CubeControl extends Application implements Runnable {

    Pane pane = new Pane();
    Rectangle rec = drawCube.getCube();
    Scene scene = new Scene(pane, 300, 300);
    KeyCode atualKey = A;
    float rotateVel = 0;

    @Override
    public void start(Stage stage) {

        scene.setOnKeyPressed(e -> {
            atualKey = scene_onKeyPressed(e);
        });

        stage.setScene(scene);
        pane.getChildren().add(rec);
        stage.show();

        Thread t = new Thread(this);
        t.setDaemon(true);
        t.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.getMessage();
            }

            doMoviment(atualKey);
        }
    }

    private KeyCode scene_onKeyPressed(KeyEvent e) {

        return e.getCode();

    }

    private void doMoviment(KeyCode atualKey) {

        switch (atualKey) {
            case UP:
                rotateVel = Controls.toUp(rec, scene, rotateVel);
                break;
            case DOWN:
                rotateVel = Controls.toDown(rec, scene, rotateVel);
                break;
            case LEFT:
                rotateVel = Controls.toLeft(rec, scene, rotateVel);
                break;
            case RIGHT:
                rotateVel = Controls.toRight(rec, scene, rotateVel);
                break;
            default:
                break;
        }
    }
}
