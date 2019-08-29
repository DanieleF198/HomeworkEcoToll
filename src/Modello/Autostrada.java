package Modello;

import java.util.*;
import Modello.Casello;

/**
 * Classe che rappresenta Autostrada.
 * L'autostrada contiene un nome identificativo, le tariffe per i vari tipi di veicoli ed una lista di caselli.
 * @author joker
 *
 */

public class Autostrada {
	
	private String nome;
	private TreeMap<Integer, Double> tariffa; /*Integer -> chiave (classe veicolo )Double -> valore (la tariffa)*/
	private HashSet<Casello> listacaselli;
	
	/**
	 * Metodo costruttore Autostrada
	 */
	
	public Autostrada (String n, TreeMap<Integer, Double> t, HashSet<Casello> l ) {
		this.nome = n;
		this.tariffa = t;
		this.listacaselli = l;
	}
	
	/**
	 * Metodo costruttore Autostrada in caso non si abbiamo i caselli e li si vogliano aggiungere in un secondo momento
	 */
	
	public Autostrada (String n, TreeMap<Integer, Double> t) {
		this.nome = n;
		this.tariffa = t;
		this.listacaselli = new HashSet<Casello>();
	}
	
	/**
	 * Metodo costruttore Autostrada in caso non si abbiamo i caselli e le tariffe e li si vogliano aggiungere in un secondo momento
	 */
	
	public Autostrada (String n) {
		this.nome = n;
		this.tariffa = new TreeMap<Integer, Double>();
		this.listacaselli = new HashSet<Casello>();
	}
	
	/**
	 * Metodo costruttore Autostrada in caso non si le tariffe e li si vogliano aggiungere in un secondo momento
	 */
	
	public Autostrada (String n, HashSet<Casello> l ) {
		this.nome = n;
		this.tariffa = new TreeMap<Integer, Double>();
		this.listacaselli = l;
	}
	
	/**
	 * metodo get del nome
	 * @return nome dell'autostrada
	 */
	
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * metodo set del nome
	 * @param n nuovo nome dell'autostrada
	 */
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	/**
	 * metodo che aggiunge un casello alla lista
	 * @param c Casello da aggiungere
	 * @return booleano che conferma la riuscita dell'operazione
	 */
	public boolean addCasello(Casello c) {
		return listacaselli.add(c);
	}
	
	/**
	 * metodo che rimuove un casello alla lista
	 * @param c Casello da rimuove
	 * @return booleano che conferma la riuscita dell'operazione
	 */
	public boolean removeCasello(Casello c) {
		return listacaselli.remove(c);
	}
	
	/**
	 * metodo che conferma se un casello appartiene alla lista dell'autostrada
	 * @param c Casello da ricercare
	 * @return booleano che conferma se il casello è stato trovato o meno
	 */
	public boolean searchCasello(Casello c) {
		return listacaselli.contains(c);
	}
	
	/**
	 * metodo che ti restituisce la tariffa relativo ad un tipo di veicolo
	 * @param classeVeicolo
	 * @return Double, il valore della tariffa
	 */
	public Double getTariffa(int classeVeicolo) {
		return tariffa.get(classeVeicolo);
	}
	
	/**
	 * metodo che ti restituisce la tariffa relativo ad un tipo di veicolo
	 * @param classeVeicolo
	 * @param newTariffa (nuovo valore della tariffa)
	 */
	public void setTariffa(int classeVeicolo, double newTariffa) {
		tariffa.put(classeVeicolo, newTariffa);
	}
	
	/*un metodo removeTariffa non è stato implementato perché rimuoveremme la tariffa ma non la sostituirebbe con una nuova
	 * situazione non contemplata nella realtà dei fatti, dove non può non esistere una tariffa per un veicolo in un dato momento*/
}
