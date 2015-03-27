package fr.esigelec.tpjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest {


	@Test(expected=IllegalArgumentException.class)
	public void testAddVoiture() {
		//On cr�e une voiture = null
		Voiture v = null;
		//On cr�e un garage
		Garage g = new Garage();
		//ajoute la voiture � au garage
		g.addVoiture(v);//Une exception doit se produire
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSupVoiture() {
		//On cr�e une voiture = null
		Voiture v = null;
		//On cr�e un garage
		Garage g = new Garage();
		//ajoute la voiture � au garage
		g.supVoiture(v);//Une exception doit se produire
	}

}
