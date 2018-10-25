package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class MainController implements Initializable {
	
	
	@FXML
	private TextArea textAreaEditor;
	
	@FXML
	private MenuItem menuItemSave;
	
	@FXML
	private MenuItem menuItemExit;
	
	@FXML
	private MenuItem menuItemAbout;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	/**
	 * 
	 * @param event 
	 * Saves the text in the TextArea to a file
	 */
	public void saveText(ActionEvent event) {
		
		File file = null;
		PrintWriter writer = null;
		
		file = new File(System.getProperty("user.dir"), "output.txt");
		
		try {
			writer = new PrintWriter(file);
			String input = textAreaEditor.getText();
			if( input != null) {
				writer.write(input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
		
	}
	
	/**
	 * 
	 * @param event 
	 * Closes the program
	 */
	public void exitProgram(ActionEvent event) {
		Platform.exit();
	}
	
	/**
	 * 
	 * @param event 
	 * Clears the TextArea in the program
	 */
	public void clearTextArea(ActionEvent event) {
		textAreaEditor.clear();
	}

	/**
	 * 
	 * @param event
	 * This method displays the About dialog
	 */
	public void showAbout(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText(null);
		alert.setContentText("Author : Abhilash G\nVersion : 1.1");
		alert.showAndWait();
	}
	
}
