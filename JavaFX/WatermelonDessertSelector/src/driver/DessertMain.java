/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Abhilash G
 */
public class DessertMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        URL url = Paths.get("src/watermelondessertselector/WatermelonDessertSelector.fxml")
                .toUri().toURL();
        
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Watermelon Dessert Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
