/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeira_interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Yuri
 */
public class PainelDentroDePainel extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane painelPrincipal = new BorderPane();
        FlowPane painelSul = new FlowPane();
        painelSul.getChildren().add(new Button("Botão 1"));
        painelSul.getChildren().add(new Button("Botão 2"));
        painelPrincipal.setBottom(painelSul);
        Scene scene = new Scene(painelPrincipal, 400, 400);
        stage.setTitle("Painel Dentro de um Painel");
        stage.setScene(scene);
        stage.show();

    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
