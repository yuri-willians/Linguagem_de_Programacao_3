/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Texts extends Clock {

    static public void makeTexts(Stage stage, Scene scene, Pane pane) {
        Text t_12 = new Text((scene.getWidth() / 2) - 3, 75, "12");
        pane.getChildren().add(t_12);

        Text t_9 = new Text(65, scene.getHeight() / 2, "9");
        pane.getChildren().add(t_9);

        Text t_6 = new Text((scene.getWidth() / 2) - 2, 75 + 360, "6");
        pane.getChildren().add(t_6);

        Text t_3 = new Text(65 + 360, scene.getHeight() / 2, "3");
        pane.getChildren().add(t_3);
    }

}
