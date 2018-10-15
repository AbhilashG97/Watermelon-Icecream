package main;

import java.awt.EventQueue;

import controller.WatermelonDessertController;
import model.WatermelonDessert;
import view.WatermelonDessertCreatorView;

public class Driver {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					WatermelonDessert model = new WatermelonDessert();
					WatermelonDessertCreatorView view = new WatermelonDessertCreatorView();
					
					new WatermelonDessertController(model, view);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
