package application;


import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

public class menu extends Application {
   


    @Override
    public void init() throws Exception {

        super.init();
        System.out.println("Init");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Star");
        primaryStage.setTitle("Este es mi titulo");
        
    
        AnchorPane root = new AnchorPane();
        //Agregavion de imagenes donde se puedde alterar el tamaño
        agregarImagen(root, "imagen1.jpeg", 20.0, 20.0);
        agregarImagen(root, "imagen2.jpeg", 80.0, 20.0);
        agregarImagen(root, "imagen3.jpeg", 140.0, 20.0);
        agregarImagen(root, "imagen4.jpeg", 200.0, 20.0);
        agregarImagen(root, "imagen5.jpeg", 260.0, 20.0);
        agregarImagen(root, "imagen7.jpeg", 320.0, 20.0);
        agregarImagen(root, "imagen6.jpeg", 380.0, 20.0);
       
        
        // Agregar los Label al AnchorPane usando un método
        agregarLabels(root);

        TextField textField = new TextField();
        AnchorPane.setTopAnchor(textField, 425.0);
        AnchorPane.setLeftAnchor(textField, 270.0);
        root.getChildren().add(textField);

        ListView<String> lista = new ListView<>();
        AnchorPane.setTopAnchor(lista, 20.0);
        AnchorPane.setLeftAnchor(lista, 220.0);
        root.getChildren().add(lista);

        primaryStage.setMaxHeight(560);//altura
        primaryStage.setMaxWidth(560);//ancho

     


        // Agregar los Label al AnchorPane usando un método
        agregarLabels(root);

        Scene scene = new Scene(root,500,500);
   
        primaryStage.setTitle("Inicio de sesion");
        scene.getStylesheets().add(getClass().getResource("serie.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para agregar los Label al AnchorPane
    private void agregarLabels(AnchorPane root) {
        agregarLabel(root, "Oswaldo Alvarado", 20.0, 80.0);
        agregarLabel(root, "luis Alverto Steven", 80.0, 80.0);// top esa espacio desde arriba y left desde al izuqierda
        agregarLabel(root, "Mauricio Jose Martinez", 140.0, 80.0);
        agregarLabel(root, "Mateo Jerry Athonio", 200.0, 80.0);
        agregarLabel(root, "Adrian Jesse Alvarado", 260.0, 80.0); 
        agregarLabel(root, "Tanya Triviño elizabeth", 320.0, 80.0); 
        agregarLabel(root, "Ivar Acosta Triviño", 380.0, 80.0);
        
      
    }

    private void agregarImagen(AnchorPane root, String imagenURL, double top, double left) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream(imagenURL)));
        imageView.setFitWidth(50); // Establece el ancho deseado de la imagen
        imageView.setFitHeight(50); // Establece la altura deseada de la imagen
        AnchorPane.setTopAnchor(imageView, top);
        AnchorPane.setLeftAnchor(imageView, left);
        root.getChildren().add(imageView);
    }
    

    // Método para agregar un Label específico al AnchorPane con una posición dada
    private void agregarLabel(AnchorPane root, String texto, double top, double left) {
        Label label = new Label(texto);
        AnchorPane.setTopAnchor(label, top);
        AnchorPane.setLeftAnchor(label, left);
        root.getChildren().add(label);
    }
    


    public static void main(String[] args)  {
            launch(args);
        }
    }
    
  
    

