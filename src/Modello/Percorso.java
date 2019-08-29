package Modello;

import Modello.Autostrada;
import Modello.Casello;

/**
 * classe Percorso
 * rappresenta il percorso fatto da un veicolo in una determinata autostrada
 * @author joker
 */
public class Percorso {
	
	private Casello caselloPartenza;
	private Casello caselloArrivo;
	private Autostrada autostrada;
	
	/**
	 * Metodo costruttore del percorso
	 * @throws IllegalArgumentException
	 * 
	 */
	public Percorso(Casello caselloPartenza, Casello caselloArrivo, Autostrada autostrada) throws IllegalArgumentException {
		if (!(autostrada.searchCasello(caselloPartenza) && autostrada.searchCasello(caselloArrivo))) {
			throw new IllegalArgumentException();
		}
		this.caselloPartenza = caselloPartenza;
		this.caselloArrivo = caselloArrivo;
		this.autostrada = autostrada;
	}
	
	/**
	 * metodo get del casello di partenza
	 * @return casello partenza
	 */
	public Casello getCaselloPartenza() {
		return caselloPartenza;
	}
	
	/**
	 * metodo set del casello di partenza
	 * @param casello partenza nuovo
	 */
	public void setCaselloPartenza(Casello caselloPartenza) {
		this.caselloPartenza = caselloPartenza;
	}
	
	/**
	 * metodo get del casello di arrivo
	 * @return casello arrivo
	 */
	public Casello getCaselloArrivo() {
		return caselloArrivo;
	}
	
	/**
	 * metodo set del casello di arrivo
	 * @param casello arrivo nuovo
	 */
	public void setCaselloArrivo(Casello casello2) {
		this.caselloArrivo = casello2;
	}
	
	/**
	 * metodo get dell'autostrada
	 * @return autostrada
	 */
	public Autostrada getAutostrada() {
		return autostrada;
	}
	
	/**
	 * metodo set dell'autostrada
	 * @param autostrada nuova
	 */
	public void setAutostrada(Autostrada autostrada) {
		this.autostrada = autostrada;
	}
	
	/**
	 * Metodo che restituisce la distanza tra i due Caselli
	 * @return distanza tra due Caselli
	 */
	public double getDistance() {
		double p = caselloPartenza.getKilometro();
		double a = caselloArrivo.getKilometro();
		return (a - p);
	}
	
}
