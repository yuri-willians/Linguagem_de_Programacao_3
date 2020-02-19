/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class Pointers {

    static public void makePointers(Stage stage, Scene scene, Pane pane) {

        Calendar calendar = new GregorianCalendar();

        int hourInt, minuteInt, secondInt;

        hourInt = calendar.get(Calendar.HOUR_OF_DAY);
        minuteInt = calendar.get(Calendar.MINUTE);
        secondInt = calendar.get(Calendar.SECOND);

        Line hour = new Line();
        hour.setStartX(pane.getWidth() / 2);
        hour.setStartY(pane.getHeight() / 2);
        hour.setEndX(pane.getWidth() / 2);
        hour.setEndY(pane.getHeight() / 2 - 80);
        hour.getTransforms().add(new Rotate((hourInt * 30 + (minuteInt / 60) * 30), pane.getWidth() / 2, pane.getWidth() / 2));
        hour.setStroke(Color.RED);
        pane.getChildren().add(hour);

        Line minute = new Line();
        minute.setStartX(pane.getWidth() / 2);
        minute.setStartY(pane.getHeight() / 2);
        minute.setEndX(pane.getWidth() / 2);
        minute.setEndY(pane.getHeight() / 2 - 120);
        minute.getTransforms().add(new Rotate(minuteInt * 6, pane.getWidth() / 2, pane.getWidth() / 2));
        minute.setStroke(Color.BLUE);
        pane.getChildren().add(minute);

        Line second = new Line();
        second.setStartX(pane.getWidth() / 2);
        second.setStartY(pane.getHeight() / 2);
        second.setEndX(pane.getWidth() / 2);
        second.setEndY(pane.getHeight() / 2 - 180);
        second.getTransforms().add(new Rotate(secondInt * 6, pane.getWidth() / 2, pane.getWidth() / 2));
        second.setStroke(Color.GREEN);
        pane.getChildren().add(second);

    }

}
