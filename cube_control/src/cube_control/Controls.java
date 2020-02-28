/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube_control;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

/**
 *
 * @author Yuri
 */
public class Controls {

    static float toLeft(Rectangle rec, Scene scene, float rotateVel) {

        if (rec.getTranslateX() == -40) {
            rec.setTranslateX(scene.getWidth());
        } else {
            rec.setTranslateX(rec.getTranslateX() - 5);
        }
        if (rotateVel > 0) {
            rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
            rotateVel -= 1;
        } else if (rotateVel > -20) {
            rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
            rotateVel -= 0.1;
        } else {
            rotate(-20, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
        }
        return rotateVel;
    }

    static float toRight(Rectangle rec, Scene scene, float rotateVel) {

        if (rec.getTranslateX() > scene.getWidth()) {
            rec.setTranslateX(-40);
        } else {
            rec.setTranslateX(rec.getTranslateX() + 5);
        }
        if (rotateVel < 0) {
            rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
            rotateVel += 1;
        } else if (rotateVel < 20) {
            rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
            rotateVel += 0.1;
        } else {
            rotate(20, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
        }
        return rotateVel;
    }

    static float toUp(Rectangle rec, Scene scene, float rotateVel) {

        if (rec.getTranslateY() == -40) {
            rec.setTranslateY(scene.getHeight());
        } else {
            rec.setTranslateY(rec.getTranslateY() - 5);
        }

        double angle = getAngle(rec);

        if (rotateVel != 0) {
            if ((angle < 5)
                    || (angle > 85 && angle < 95)
                    || (angle > 175 && angle < 185)) {
                rotate(5, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
                rotateVel = 0;
            } else {
                if (Math.signum(angle) == 1.0) {
                    rotate(1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
                } else {
                    rotate(-1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
                }
            }
        }

        return rotateVel;
    }

    static float toDown(Rectangle rec, Scene scene, float rotateVel) {

        if (rec.getTranslateY() > scene.getHeight()) {
            rec.setTranslateY(-40);
        } else {
            rec.setTranslateY(rec.getTranslateY() + 5);
        }

        double angle = getAngle(rec);

        if (rotateVel != 0) {
            if ((angle < 5)
                    || (angle > 85 && angle < 95)
                    || (angle > 175 && angle < 185)) {
                rotate(5, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
                rotateVel = 0;
            } else {
                if (Math.signum(angle) == 1.0) {
                    rotate(1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
                } else {
                    rotate(-1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
                }
            }
        }

        return rotateVel;
    }

    static float pause(Rectangle rec, Scene scene, float rotateVel) {
        rotateVel = 0;

        double angle = getAngle(rec);

        if (angle > 5) {
            rotate(5, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);
        }

        rotate(-angle, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2, rec);

        return rotateVel;
    }

    public static double getAngle(Rectangle rec) {

        double xx = rec.getLocalToSceneTransform().getMxx();
        double xy = rec.getLocalToSceneTransform().getMxy();

        double angle = Math.atan2(-xy, xx);
        angle = Math.toDegrees(angle);

        angle = Math.abs(angle);

        return angle;
    }

    public static void rotate(double angle, double x, double y, Rectangle rec) {
        Platform.runLater(() -> {
            rec.getTransforms().add(new Rotate(angle, x, y));
        });
    }

}
