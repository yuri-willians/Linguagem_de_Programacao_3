/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube_control;

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
            rec.getTransforms().add(new Rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
            rotateVel -= 1;
        } else if (rotateVel > -20) {
            rec.getTransforms().add(new Rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
            rotateVel -= 0.1;
        } else {
            rec.getTransforms().add(new Rotate(-20, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
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
            rec.getTransforms().add(new Rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
            rotateVel += 1;
        } else if (rotateVel < 20) {
            rec.getTransforms().add(new Rotate(rotateVel, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
            rotateVel += 0.1;
        } else {
            rec.getTransforms().add(new Rotate(20, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
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

        System.out.println(angle);

        if (rotateVel != 0) {
            if ((angle < 5)
                    || (angle > 85 && angle < 95)
                    || (angle > 175 && angle < 185)) {
                rec.getTransforms().add(new Rotate(5, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
                rotateVel = 0;
            } else {
                if (Math.signum(angle) == 1.0) {
                    rec.getTransforms().add(new Rotate(1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
                } else {
                    rec.getTransforms().add(new Rotate(-1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
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
                rec.getTransforms().add(new Rotate(5, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
                rotateVel = 0;
            } else {
                if (Math.signum(angle) == 1.0) {
                    rec.getTransforms().add(new Rotate(1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
                } else {
                    rec.getTransforms().add(new Rotate(-1, rec.getX() + rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2));
                }
            }
        }

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
}
