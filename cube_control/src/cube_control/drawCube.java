/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube_control;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Yuri
 */
public class drawCube {

    static Rectangle getCube() {

        final Rectangle rec = new Rectangle(0, 0, 40, 40);
        rec.setArcWidth(10);
        rec.setArcHeight(10);
        rec.setFill(Color.ORANGE);

        return rec;
    }

}
