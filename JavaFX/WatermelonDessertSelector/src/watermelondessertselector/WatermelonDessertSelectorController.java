/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watermelondessertselector;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abhilash G 
 */
public class WatermelonDessertSelectorController implements Initializable {
    
    @FXML private RadioButton watermelonIcecubesRadioButton;
    @FXML private RadioButton thinWatermelonShredsRadioButton;
    @FXML private RadioButton watermelonBallsRadioButton;
    @FXML private TextField extraToppingsTextField;
    @FXML private Button orderButton;
    @FXML private Label orderSummaryLabel;
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        onOrderButtonPressed();
    }    
    
    public void onOrderButtonPressed() {
        orderButton.setOnAction((event) -> {
            
            String order = "";
            
            if(watermelonIcecubesRadioButton.isSelected()) {
                order = order + " Watermelon Icecubes"; 
            }
            
            if(thinWatermelonShredsRadioButton.isSelected()) {
                order = order + " Thin Watermelon Shreds";
            }
                
            if(watermelonBallsRadioButton.isSelected()) {
                order = order + " Watermelon Balls";
            }
            
            if(!extraToppingsTextField.getText().isEmpty()) {
                order = order + " " + extraToppingsTextField.getText();
            }
            orderSummaryLabel.setText(order);
            System.out.println(order);
        });
    }
}
