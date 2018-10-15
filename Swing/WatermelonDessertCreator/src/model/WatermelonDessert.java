package model;

import java.util.ArrayList;

public class WatermelonDessert {

	public static enum addOns {
		CREAM,
		HONEY,
		LIME;
	}

	public static enum serving {
		LARGE,
		MEDIUM,
		SMALL;
	}

	public static final String[] nuts = new String[] 
			{"Select nuts", "Pistachio", "Cashew Nut", "Raisins", "Almonds", "Wall Nuts"};

	public static String[] otherFruits = new String[] 
			{"Select fruits", "Apple", "PineApple", "Orange", "Kiwi", "Litchi", "Grapes"};

	private ArrayList<String> addOnList;
	private String dessertName;
	private String recipe;
	private String selectedExtraFruit;
	private String selectedNuts;

	private String selectedServing;


	// Constructors
	public WatermelonDessert() {
		super();
		addOnList = new ArrayList<>();
	}


	// Getters and Setters
	public String getDessertName() {
		return dessertName;
	}

	public String getRecipe() {
		return recipe;
	}

	public String getSelectedExtraFruit() {
		return selectedExtraFruit;
	}

	public String getSelectedNuts() {
		return selectedNuts;
	}

	public String getSelectedServing() {
		return selectedServing;
	}

	public void setDesertName(String dessertName) {
		this.dessertName = dessertName;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public void setSelectedExtraFruit(String selectedExtraFruit) {
		this.selectedExtraFruit = selectedExtraFruit;
	}

	public void setSelectedNuts(String selectedNuts) {
		this.selectedNuts = selectedNuts;
	}

	public void setSelectedServing(String selectedServing) {
		this.selectedServing = selectedServing;
	}


	public ArrayList<String> getAddOnList() {
		return addOnList;
	}


	public void setAddOnList(ArrayList<String> addOnList) {
		this.addOnList = addOnList;
	}
	
	// toString() method
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Dessert Name: "+getDessertName());
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Serving: "+getSelectedServing());
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Other ingredients:");
		stringBuilder.append("\n\n");
		stringBuilder.append("Extra fruit selected: "+getSelectedExtraFruit());
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Nuts: "+getSelectedNuts());
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Add ons': "+getAddOnList().toString());
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Recipe:\n");
		stringBuilder.append(getRecipe());
		
		return stringBuilder.toString();
	}
}
