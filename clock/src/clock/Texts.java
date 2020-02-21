/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Texts extends Clock {

    static public void makeTexts(Stage stage, Scene scene, Pane pane) {
//        Text t_12 = new Text((scene.getWidth() / 2) - 3, 75, "12");
        Text t_12 = new Text((scene.getWidth() / 2) - 5, scene.getHeight() / 2 - 165, "12");
        pane.getChildren().add(t_12);

        Text t_11 = new Text((scene.getWidth() / 2) - 5, scene.getHeight() / 2 - 165, "11");
        t_11.getTransforms().add(new Rotate(-30, scene.getWidth() / 2, scene.getHeight() / 2));
        t_11.getTransforms().add(new Rotate(30, t_11.getX(), t_11.getY()));
        pane.getChildren().add(t_11);

        Text t_10 = new Text((scene.getWidth() / 2) - 5, scene.getHeight() / 2 - 165, "10");
        t_10.getTransforms().add(new Rotate(-60, scene.getWidth() / 2, scene.getHeight() / 2));
        t_10.getTransforms().add(new Rotate(60, t_10.getX(), t_10.getY()));
        pane.getChildren().add(t_10);

        Text t_9 = new Text(scene.getWidth() / 2 - 175, scene.getHeight() / 2 + 5, "9");
        pane.getChildren().add(t_9);

        Text t_8 = new Text(scene.getWidth() / 2 - 175, scene.getHeight() / 2 + 5, "8");
        t_8.getTransforms().add(new Rotate(-30, scene.getWidth() / 2, scene.getHeight() / 2));
        t_8.getTransforms().add(new Rotate(30, t_8.getX(), t_8.getY()));
        pane.getChildren().add(t_8);

        Text t_7 = new Text(scene.getWidth() / 2 - 175, scene.getHeight() / 2 + 5, "7");
        t_7.getTransforms().add(new Rotate(-60, scene.getWidth() / 2, scene.getHeight() / 2));
        t_7.getTransforms().add(new Rotate(60, t_7.getX(), t_7.getY()));
        pane.getChildren().add(t_7);

        Text t_6 = new Text((scene.getWidth() / 2) - 5, scene.getHeight() / 2 + 175, "6");
        pane.getChildren().add(t_6);

        Text t_5 = new Text(scene.getWidth() / 2 - 5, scene.getHeight() / 2 + 175, "5");
        t_5.getTransforms().add(new Rotate(-30, scene.getWidth() / 2, scene.getHeight() / 2));
        t_5.getTransforms().add(new Rotate(30, t_5.getX(), t_5.getY()));
        pane.getChildren().add(t_5);
        
        Text t_4 = new Text(scene.getWidth()/2 - 5, scene.getHeight()/2 + 175, "4");
        t_4.getTransforms().add(new Rotate(-60, scene.getWidth() / 2, scene.getHeight() / 2));
        t_4.getTransforms().add(new Rotate(60, t_4.getX(), t_4.getY()));
        pane.getChildren().add(t_4);

        Text t_3 = new Text(scene.getWidth() / 2 + 165, scene.getHeight() / 2 + 5, "3");
        pane.getChildren().add(t_3);
        
        Text t_2 = new Text(scene.getWidth() / 2 + 165, scene.getHeight() / 2 + 5, "2");
        t_2.getTransforms().add(new Rotate(-30, scene.getWidth() / 2, scene.getHeight() / 2));
        t_2.getTransforms().add(new Rotate(30, t_2.getX(), t_2.getY()));
        pane.getChildren().add(t_2);
        
        Text t_1 = new Text(scene.getWidth() / 2 + 165, scene.getHeight() / 2 + 5, "1");
        t_1.getTransforms().add(new Rotate(-60, scene.getWidth() / 2, scene.getHeight() / 2));
        t_1.getTransforms().add(new Rotate(60, t_1.getX(), t_1.getY()));
        pane.getChildren().add(t_1);
        
        
    }

}
