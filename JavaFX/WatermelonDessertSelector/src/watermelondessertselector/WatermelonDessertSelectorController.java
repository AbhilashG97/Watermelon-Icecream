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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abhilash G 
 */
public class WatermelonDessertSelectorController implements Initializable {
    
    // Watermelon Dessert Selector
    @FXML private RadioButton watermelonIcecubesRadioButton;
    @FXML private RadioButton thinWatermelonShredsRadioButton;
    @FXML private RadioButton watermelonBallsRadioButton;
    @FXML private TextField extraToppingsTextField;
    @FXML private Button orderButton;
    @FXML private Label orderSummaryLabel;
   
    // Add Extra Fruits
    @FXML private ChoiceBox extraFruitsChoiceBox;
    @FXML private Button addFruitButton;
    @FXML private Label extraFruitSummaryLabel;
    
    // Add Dried Fruits
    @FXML private ComboBox driedFruitsComboBox;
    @FXML private Label driedFruitSummaryLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        onOrderButtonPressed();
        initializeChoiceBoxData();
        initializeComboBoxData();
        onAddFruitButtonClicked();
    }    
    
    /**
     * Invoked when the Order button of
     * the Watermelon Dessert Selector is pressed
     */
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
    
    public void onAddFruitButtonClicked() {
        addFruitButton.setOnAction((event) -> {
            extraFruitSummaryLabel.setText(extraFruitsChoiceBox.getValue()
                    .toString());
            System.out.println(extraFruitsChoiceBox.getValue()
                    .toString());
        });
    }
    
    public void onComboBoxItemSelected() {
        driedFruitSummaryLabel.setText("Selected Dry Fruit:\n"
                +driedFruitsComboBox.getValue().toString());
        System.out.println(driedFruitsComboBox.getValue().toString());
    }
    
    private void initializeChoiceBoxData() {
        extraFruitsChoiceBox.getItems().add("Lychee");
        extraFruitsChoiceBox.getItems().addAll("Apple", "Mango", "Orange");
    }
    
    private void initializeComboBoxData() {
        driedFruitsComboBox.getItems().add("Raisin");
        driedFruitsComboBox.getItems().addAll("Nut", "Almond", "Prune");
    }
}
