package Modello;

import Modello.Percorso;
import Modello.Veicolo;

/**
 * classe pedaggio
 * classe che rappresenta il pedaggio da pagare (dato un percorso)
 * @author joker
 *
 */
public abstract class Pedaggio {
	
	/**
	 * metodo che calcola il pedaggio di un percorso
	 * @param v veicolo che ha effettuato il percorso
	 * @param iva iva in vigore
	 * @param percorso percorso fatto dal veicolo
	 * @return prezzoFinale (prezzo effettivo da pagare)
	 */
	public static double calcolaPedaggio(Veicolo v, int iva, Percorso percorso ) {				
		double distanza = percorso.getDistance();
		Autostrada a = percorso.getAutostrada();
		int classVeic = v.getClassificazione();
		double tariffa = a.getTariffa(classVeic);
		
		double PrezzoNoIva = tariffa * distanza;
		double PrezzoConIva =PrezzoNoIva + (PrezzoNoIva * iva / 100);
		double PrezzoFinale = arrotondamento(PrezzoConIva);
		return PrezzoFinale;
	}
	
	/**
	 * metodo che calcola il pedaggio di un percorso con l'iva attuale
	 * @param v veicolo che ha effettuato il percorso
	 * @param percorso percorso fatto dal veicolo
	 * @return prezzoFinale (prezzo effettivo da pagare)
	 */
	public static double calcolaPedaggio(Veicolo v, Percorso percorso) {
		
		double distanza = percorso.getDistance();
		Autostrada a = percorso.getAutostrada();
		int classVeic = v.getClassificazione();
		double tariffa = a.getTariffa(classVeic);
		int iva = 22;
		
		double PrezzoNoIva = tariffa * distanza;
		double PrezzoConIva =PrezzoNoIva + (PrezzoNoIva * iva / 100);
		double PrezzoFinale = arrotondamento(PrezzoConIva);
		return PrezzoFinale;
	}
	
	
	/**
	 * Metodo per l'arrotondamento ai 10 centesimi con taglio a due cifre decimali
	 * @param i Valore da arrotondare
	 * @return Il valore arrotondato
	 */
	
	private static double arrotondamento(double i) {
		
		i *= 100;
		i = java.lang.Math.round(i);
		double modulo = i % 10;
		if(modulo <= 5) i -= modulo;
		else i = i + 10 - modulo;
		return i / 100;
	}
}
