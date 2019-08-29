package Modello;

/**
 * Classe che rappresenta il casello.
 * L'autostrada contiene un codice identificativo, un nome e il kilometro d'altezza rispetto all'autostrada.
 * @author joker
 *
 */

public class Casello {
	
	private String codice;
	private String nome;
	private double kilometro;
	
	/**
	 * Metodo costruttore di Casello
	 */
	public Casello(String c, String n, double k) {
		this.codice = c;
		this.nome = n;
		this.kilometro = k;
	}
	
	/**
	 * metodo get del codice
	 * @return codice
	 */
	
	public String getCodice() {
		return codice;
	}

	/**
	 * metodo set del codice
	 * @param codice nuovo
	 */
	
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	/**
	 * metodo get del nome
	 * @return nome
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * metodo set del nome
	 * @param nome nuovo
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * metodo get del kilometro
	 * @return kilometro
	 */
	
	public double getKilometro() {
		return kilometro;
	}
	
	/**
	 * metodo set del kilometro
	 * @param kilometro nuovo
	 */
	
	public void setKilometro(double kilometro) {
		this.kilometro = kilometro;
	}
	
}
