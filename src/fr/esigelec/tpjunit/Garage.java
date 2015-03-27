package fr.esigelec.tpjunit;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Voiture> voitures;
	
	public Garage() {
		voitures = new ArrayList<Voiture>();
	}
	
	public void addVoiture(Voiture v)  throws IllegalArgumentException {
		if (v == null) {
			throw new IllegalArgumentException();
		}
		voitures.add(v);
	}
	
	public void supVoiture(Voiture v)  throws IllegalArgumentException {
		if (v == null) {
			throw new IllegalArgumentException();
		}
		voitures.remove(v);
	}
	
	public void printGarage() {
		for (Voiture v : voitures) {
			System.out.println(v.toString());
		}
	}

}
