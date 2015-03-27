package fr.esigelec.tpjunit;

import java.util.*;
public class DateGSI {
	int jour;//La valeur du jour
	int mois;//Valeur du mois
	int annee;//Valeur de l'ann��	
	
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
		//On cr�e on cr�e une variable de type GregorianCalendar au jour souhait� 
		GregorianCalendar calendar = new GregorianCalendar(annee, mois - 1, jour); //mois - 1 parceque janvier c'est 0
		//On ajoute un jour � cette date
		calendar.add(Calendar.DATE, 1);
		//on retourne la date du lendemain au format DatGSI
		return new DateGSI(calendar.get(Calendar.DATE),calendar.get(Calendar.MONTH) + 1,calendar.get(Calendar.YEAR)) ;
	}
	public boolean equals(Object o) {
		//V�rification de l'�galit� des r�f�rences
		if (o == this) {
			return true;
		}
		//On test le type du parametre
		if (o instanceof DateGSI) {
			DateGSI other = (DateGSI) o;
			
			//On test directement les valeur, si une delle est differente
			//dune classe � l'autre c'est que les classes ne sont pas identiques
			if (other.jour != this.jour) {
				return false;
			}
			if (other.mois != this.mois) {
				return false;
			}
			if (other.annee != this.annee) {
				return false;
			}
			//Si on arrive ici c'est que toute les valeurs sont �gale
			return true;
		}
		return false;
	}
	
	public String toString() {
		String j = (jour < 10) ? "0" + String.valueOf(jour) : String.valueOf(jour);
		String m = (mois < 10) ? "0" + String.valueOf(mois) : String.valueOf(mois);
		
		return j + "/" + m + "/" + String.valueOf(annee);
	}

}
