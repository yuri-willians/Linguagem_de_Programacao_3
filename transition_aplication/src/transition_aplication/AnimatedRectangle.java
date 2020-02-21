/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transition_aplication;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Yuri
 */
public class AnimatedRectangle extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Definindo o título da janela
        stage.setTitle("Transition Sample");
        //Painel aonde podemos desenhar
        Pane pane = new Pane();
        //Elemento principal da nossa cena e o tamanho que irá ocupar na janela
        Scene scene = new Scene(pane, 500, 375);
        //Criando um quadrilátero de 40x40 pixels
        final Rectangle rectPath = new Rectangle(0, 0, 40, 40);
        rectPath.setArcHeight(10); //bordas arredondadas
        rectPath.setArcWidth(10);  //bordas arredondadas
        rectPath.setFill(Color.ORANGE); //cor do quadrilátero
        //Caminho que deverá ser percorrido pelo quadrilátero
        Path path = new Path();
        path.getElements().add(new MoveTo(20, 20)); //posição inicial 
        path.getElements().add(new HLineTo(400));  //avança 380 pixels na horizontal
        path.getElements().add(new VLineTo(100)); //desce 80 pixels
        path.getElements().add(new HLineTo(20));  //recua 380 pixels
        path.getElements().add(new VLineTo(20));  //sobe 80 pixels
        //Objeto transition responsável pela animação
        PathTransition pathTransition = new PathTransition();
        //Todo o percurso deverá ser realizado em 4 segundos 
        pathTransition.setDuration(Duration.millis(4000));
        //Definindo o caminho da animação
        pathTransition.setPath(path);
        //Definindo qual é o objeto a ser animado
        pathTransition.setNode(rectPath);
        //Definindo quantas vezes deverá fazer o ciclo da animação
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        //Se marcado como verdadeiro, ao final da animação faz o sentido inverso
        pathTransition.setAutoReverse(true);
        pane.getChildren().add(rectPath);
        stage.setScene(scene);
        stage.show();
        pathTransition.play();
    }
}
