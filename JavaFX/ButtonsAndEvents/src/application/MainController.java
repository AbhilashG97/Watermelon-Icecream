package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainController implements Initializable {
	
	@FXML
	private Label watermelonLabel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void showWatermelon(ActionEvent event) {
		watermelonLabel.setText("Watermelon Ice-cream");
	}
}
