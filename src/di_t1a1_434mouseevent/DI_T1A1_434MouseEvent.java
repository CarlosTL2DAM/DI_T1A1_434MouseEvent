/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a1_434mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A1_434MouseEvent extends Application {

    Text tText;

    @Override
    public void start(Stage primaryStage) {
        //Seleccionamos el layout que vamos a tener
        Pane root = new Pane();

        //Escogemos la escena que tengamos
        Scene scene = new Scene(root, 300, 250);

        //Introducimos el Texto
        tText = new Text("Programmin is fun");
        //Introducimos la coordenada inicial X
        double InitX = (scene.getWidth() / 2) - 50;
        tText.setX(InitX);

        //Introducimos la coordenada inicial Y
        double InitY = scene.getHeight() / 2;
        tText.setY(InitY);

        //Introducimos evento SetOnMouseDragged, en formato de Lambda
        tText.setOnMouseDragged(e -> {
            //Para coordenada X
            // tText.setX(tText.getX() + e.getX() - InitX); -> ¿POR QUÉ NO FUNCIONA?
            tText.layoutXProperty().set(tText.getLayoutX() + e.getX() - InitX);
            //Para coordenada Y
            // tText.setY(tText.getY() + e.getY() - InitY); -> ¿POR QUÉ NO FUNCIONA?
            tText.layoutYProperty().set(tText.getLayoutY() + e.getY() - InitY);
        });

        //Añadimos lbText al root
        root.getChildren().add(tText);

        //Escogemos el titulo del primary Stage
        primaryStage.setTitle("Ejercicio 4.3.4 MouseEvent");

        //Escogemos la escena del primary Stage
        primaryStage.setScene(scene);

        //Mostramos el primaryStage
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
