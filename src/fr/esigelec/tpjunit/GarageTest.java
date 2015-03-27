package fr.esigelec.tpjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest {


	@Test(expected=IllegalArgumentException.class)
	public void testAddVoiture() {
		//On crée une voiture = null
		Voiture v = null;
		//On crée un garage
		Garage g = new Garage();
		//ajoute la voiture à au garage
		g.addVoiture(v);//Une exception doit se produire
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSupVoiture() {
		//On crée une voiture = null
		Voiture v = null;
		//On crée un garage
		Garage g = new Garage();
		//ajoute la voiture à au garage
		g.supVoiture(v);//Une exception doit se produire
	}

}
