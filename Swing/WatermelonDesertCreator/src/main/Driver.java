package main;

import java.awt.EventQueue;

import controller.WatermelonDesertController;
import model.WatermelonDesert;
import view.WatermelonDesertCreatorView;

public class Driver {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					WatermelonDesert model = new WatermelonDesert();
					WatermelonDesertCreatorView view = new WatermelonDesertCreatorView();
					
					new WatermelonDesertController(model, view);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
