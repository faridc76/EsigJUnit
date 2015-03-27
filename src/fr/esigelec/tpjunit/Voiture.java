package fr.esigelec.tpjunit;

public class Voiture {
	private String immatriculation;
	private String modele;
	private int km;
	private float vitesseCourante;
	private float vitesseMaxi;
	
	public Voiture(String immatriculation, String modele, int km, float vitesseCourante, float vitesseMaxi) throws IllegalArgumentException {
		if (!immatriculation.matches("^[A-Z]{2}-[0-9]{3}-[A-Z]{2}$")) {
			this.immatriculation = "incorrecte";
		} else {
			this.immatriculation = immatriculation;
		}
		this.modele = modele;
		if (km < 0) {
			throw new IllegalArgumentException();
		}
		this.km = km;
		if (vitesseCourante != 0) {
			throw new IllegalArgumentException();
		}
		this.vitesseCourante = vitesseCourante;
		if (vitesseMaxi <= 0) {
			throw new IllegalArgumentException();
		}
		this.vitesseMaxi = vitesseMaxi;
	}
	
	public void rouler(int distance) throws IllegalArgumentException {
		if (distance < 0) {
			throw new IllegalArgumentException();
		}
		km += distance;
		
	}
	
	public void accelerer(float dVitesse) throws IllegalArgumentException {
		if (dVitesse < 0) {
			throw new IllegalArgumentException();
		}
		vitesseCourante = (vitesseCourante + dVitesse > vitesseMaxi) ?  vitesseMaxi : vitesseCourante + dVitesse;

	}
	
	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public float getVitesseCourante() {
		return vitesseCourante;
	}

	public void setVitesseCourante(float vitesseCourante) {
		this.vitesseCourante = vitesseCourante;
	}

	public float getVitesseMaxi() {
		return vitesseMaxi;
	}

	public void setVitesseMaxi(float vitesseMaxi) {
		this.vitesseMaxi = vitesseMaxi;
	}

	public void freiner(float dVitesse)  throws IllegalArgumentException {
		if (dVitesse < 0) {
			throw new IllegalArgumentException();
		}
		vitesseCourante = (vitesseCourante - dVitesse < 0) ?  0 : vitesseCourante - dVitesse;
		
	}
	
	public Object clone() {
		return this;
	}
	
	public String toString() {
		return immatriculation + ":" + modele + ":" + km + "km:" + vitesseCourante + "km/h:" + vitesseMaxi + "km/h";
		
	}
	
	public boolean equals(Object v) {
		return (this.getImmatriculation() == ((Voiture) v).getImmatriculation());
	}
}
