package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

import model.WatermelonDessert;
import view.WatermelonDessertCreatorView;

public class WatermelonDessertController {
		
	private WatermelonDessert model;
	private WatermelonDessertCreatorView view;
	
	public WatermelonDessertController() {
		//Default constructor
		startProgram();
	}
	
	public WatermelonDessertController(WatermelonDessert model, WatermelonDessertCreatorView view) {
		super();
		this.model = model;
		this.view = view;
		startProgram();
	}
	
	public void startProgram() {
		view.setVisible(true);
		onCreateDessertButtonPressed();
		onExitMenuButtonPressed();
		onAboutMenuButtonPressed();
		onCreateNewDessertButtonPressed();
		onDoneButtonPressed();
	}
	
	/**
	 * Listener for the Exit Menu Button in the view
	 */
	public void onExitMenuButtonPressed() {
		view.getMntmExit().addActionListener((event) -> {
			int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
			if(response == JOptionPane.OK_OPTION) {
				System.exit(0);
			} else {
				JOptionPane.getRootFrame().dispose();
			}
		});
	}
	
	/**
	 * Listener for the Create Dessert Button in the view
	 */
	public void onCreateDessertButtonPressed() {
		
		view.getBtnCreateDessert().addActionListener((action) -> {
			// when Create Desert button is clicked
			model.setDesertName(view.getTxtDesertName().getText());
			
			// get serving
			if(view.getRdbtnSmallServing().isSelected()) {
				model.setSelectedServing(WatermelonDessert.serving.SMALL.toString());
			} else if (view.getRdbtnMediumServing().isSelected()){
				model.setSelectedServing(WatermelonDessert.serving.MEDIUM.toString());
			} else {
				model.setSelectedServing(WatermelonDessert.serving.LARGE.toString());
			}
			
			// get selected fruit from ComboBox 
			if(view.getCbxFruits().getSelectedIndex() == 0) {
				model.setSelectedExtraFruit("No extra fruits");
			} else {
				model.setSelectedExtraFruit(view.getCbxFruits().getSelectedItem().toString());
			}
			
			// get selected nuts from ComboBox
			if(view.getCbxNuts().getSelectedIndex() == 0) {
				model.setSelectedNuts("No extra fruits");
			} else {
				model.setSelectedNuts(view.getCbxNuts().getSelectedItem().toString());
			}
			
			//get selected add-on
			for(JCheckBox checkBox : view.getCheckBoxList()) {
				if(checkBox.isSelected()) {
					model.getAddOnList().add(checkBox.getText());
				}
			}
			
			// get typed Recipe
			if(view.getTaRecipe().getText() != null) {
				model.setRecipe(view.getTaRecipe().getText());
			} else {
				model.setRecipe("Sorry, no recipe added");
			}
			
			// create a recipe file
			writeToFile(model);
			
			// gray out the button 
			view.getBtnCreateDessert().setEnabled(false);
			view.getBtnNewDessert().setEnabled(true);
			view.getBtnDone().setEnabled(true);
		});
	}
	
	/**
	 * Listener for the About Menu button in the view
	 */
	public void onAboutMenuButtonPressed() {
		view.getMntmAbout().addActionListener((event) -> {
			new AboutDialogController();
		});
	}
	
	/**
	 * Listener for "Create New Dessert" Button
	 */
	public void onCreateNewDessertButtonPressed() {
		view.getBtnNewDessert().addActionListener((event) -> {
			view.getBtnCreateDessert().setEnabled(true);
			
			new File(System.getProperty("user.dir"), "recipe.txt").delete();
			resetFields();
			view.getBtnNewDessert().setEnabled(false);
		});
	}
	
	/**
	 * Listener for Done Button
	 */
	public void onDoneButtonPressed() {
		view.getBtnDone().addActionListener((event) -> {
			int responseID = JOptionPane.showConfirmDialog(null, "Are you sure you are done?");
			if(responseID == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		});
	}
	
	/**
	 * 
	 * @param watermelonDesert
	 * Writes the recipe to a file which the user can read
	 */
	public void writeToFile(WatermelonDessert watermelonDesert) {
		
		File file = null;
		
		file = new File(System.getProperty("user.dir"), "recipe.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try(PrintWriter printwriter = new PrintWriter(file)) {
			// Print the contents to a file
			printwriter.print(watermelonDesert);
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	/**
	 * Reset all the fields in the application
	 */
	public void resetFields() {
		view.getTxtDesertName().setText("");
		view.getRdbtnMediumServing().setSelected(true);
		view.getCbxFruits().setSelectedIndex(0);
		view.getCbxNuts().setSelectedIndex(0);
		
		for(JCheckBox checkbox : view.getCheckBoxList()) {
			checkbox.setSelected(false);
		}
		view.getTaRecipe().setText("");
	}
}
