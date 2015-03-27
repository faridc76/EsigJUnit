package fr.esigelec.tpjunit;

import java.util.*;
public class DateGSI {
	int jour;
	int mois;
	int annee;
	
	public DateGSI(int jour, int mois, int annee) throws IllegalArgumentException {
		if (jour < 1) {
			throw new IllegalArgumentException();
		}
		if (mois < 1) {
			throw new IllegalArgumentException();
		}
		if (annee < 1) {
			throw new IllegalArgumentException();
		}
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	/**
	 * 
	 * @return La date du lendemain prennant en compte tous les parametres
	 */
	public DateGSI getDateLendemain() {
		//On crée on crée une variable de type GregorianCalendar au jour souhaité 
		GregorianCalendar calendar = new GregorianCalendar(annee, mois - 1, jour); //mois - 1 parceque janvier c'est 0
		//On ajoute un jour à cette date
		calendar.add(Calendar.DATE, 1);
		//on retourne la date du lendemain au format DatGSI
		return new DateGSI(calendar.get(Calendar.DATE),calendar.get(Calendar.MONTH) + 1,calendar.get(Calendar.YEAR)) ;
	}
	public boolean equals(Object o) {
		return (this.toString() == ((DateGSI) o).toString());
	}
	
	public String toString() {
		String j = (jour < 10) ? "0" + String.valueOf(jour) : String.valueOf(jour);
		String m = (mois < 10) ? "0" + String.valueOf(mois) : String.valueOf(mois);
		
		return j + "/" + m + "/" + String.valueOf(annee);
	}

}
