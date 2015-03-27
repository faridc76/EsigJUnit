package fr.esigelec.tpjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VoitureTest {

	@Test
	public void testVoiture() {
		//On crée une voiture avec une plaque d'immatriculation
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On test si la plague est bien égale à celle entrér dans le contruscteur
		assertEquals("BT-099-JY", v1.getImmatriculation());
		//On crée une deuxieme voiutre sans plaque d'immatriculation
		Voiture v2 = new Voiture("", "207", 220000, 0, 220);
		//On test si la vitesse de la voiture est bien "incorrecte"
		assertEquals("incorrecte", v2.getImmatriculation());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testVoitureIllegalArgumentKm() {
		//On crée une voiture avec un km < 0
		Voiture v1 = new Voiture("BT-099-JY", "207", -10, 0, 220); //Une exception doit se déclancher
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testVoitureIllegalArgumentVitesse() {
		//On crée une voiture avec une vitesse courante != 0
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 10, 220); //Une exception doit se déclancher
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testVoitureIllegalArgumentVitesseMax() {
		//On crée une voiture avec une vitesse max < 1
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 0); //Une exception doit se déclancher
	}


	@Test
	public void testRouler() {
		//On crée une voiture
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On roule 20km
		v1.rouler(20);
		//Le nouveau km doit être égal à l'ancien +20
		assertEquals(220020, v1.getKm(), 0.001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testRoulerIllegalArgumentException() {
		//On crée une voiture
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On roule -20km
		v1.rouler(-20);//Une exception doit se lancer
	}

	@Test
	public void testAccelerer() {
		//On crée une voiture 
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On augmente la vitesse de 10 avec la méthode accelerer
		v1.accelerer(10);
		//On compare si la nouvelle vitesse est égal à l'ancienne vitesse +10
		assertEquals(10, v1.getVitesseCourante(), 0.001);
		//On augmente la vitesse de maniere à dépasser la vitesse maximum
		v1.accelerer(5000);
		//On test si finalement on se bloque à la vitesse maximum
		assertEquals(v1.getVitesseMaxi(), v1.getVitesseCourante(), 0.001);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testAccelererIllegalArgument() {
		//On crée une voiture 
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On augmente la vitesse de -10 avec la méthode accelerer
		v1.accelerer(-10);// une exception doit se déclancher
	}
	
	@Test
	public void testFreiner() {
		//On crée une voiture 
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On augmente la vitesse de 30 avec la méthode accelerer
		v1.accelerer(30);
		//On freine de 10 avec la méthode freiner
		v1.freiner(10);
		//on test si la vitesse est bien de 20
		assertEquals(20, v1.getVitesseCourante(), 0.001);
		//On freine plus que possible
		v1.freiner(5000);
		//La vitesse doit être de 0
		assertEquals(0, v1.getVitesseCourante(), 0.001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFreinerIllegalArgument() {
		//On crée une voiture 
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On freine de -10 km
		v1.freiner(-10); //La fonction doit nous retourner une exception 
	}

	@Test
	public void testClone() {
		//On crée une voiture
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On la clone
		Object v2 = v1.clone();
		//on test si la voiture d'origine et le clone sont identiques
		assertEquals(v1, v2);
	}

	@Test
	public void testToString() {
		//On crée une voiture  
		Voiture v = new Voiture("BT-099-JY", "207", 220000, 0, 220);
		//On test si la fonction to string nous affiche bien skon souhaite
		assertEquals("BT-099-JY:207:220000km:0.0km/h:220.0km/h", v.toString());
	}

	@Test
	public void testEqualsObject() {
		//On crée deux voitures
		Voiture v1 = new Voiture("BT-099-JY", "207", 220000, 0, 130);
		Voiture v2 = new Voiture("BT-099-JY", "607", 180000, 0, 220);
		//On teste si les deux voitures sont égales
		assertEquals(v1, v2);
	}

}
