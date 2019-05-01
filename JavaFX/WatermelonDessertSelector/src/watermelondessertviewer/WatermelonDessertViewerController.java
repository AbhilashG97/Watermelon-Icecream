/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watermelondessertviewer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abhilash G <abhilashg@am.students.amrita.edu>
 */
public class WatermelonDessertViewerController implements Initializable {
    
    @FXML private Button backToWatermelonDessertViewerButton;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        onBackToWatermelonDessertViewerButtonClicked();
    }
    
    public void onBackToWatermelonDessertViewerButtonClicked() {
        backToWatermelonDessertViewerButton.setOnAction((event) -> {
            
            URL url = null;
            
            try {
                url = Paths.get("src/watermelondessertselector"
                        + "/WatermelonDessertSelector.fxml")
                        .toUri().toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(WatermelonDessertViewerController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            
            Parent parent = null;
            
            try {
                parent = FXMLLoader.load(url);
            } catch (IOException ex) {
                Logger.getLogger(WatermelonDessertViewerController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            Scene scene = new Scene(parent);
            
            Stage stage = (Stage) ((Node)event.getSource())
                    .getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        });
    }
    
    
}
