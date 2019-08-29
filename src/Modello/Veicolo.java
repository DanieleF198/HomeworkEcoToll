package Modello;

/**
 * Classe Veicolo
 * classe che rappresenta il veicolo, con modello, targa, marca, peso, anno immatricolazione, numero assi, altezza
 * e classe euro 
 * @author joker
 *
 */
public class Veicolo implements InterfacciaVeicolo{
	
	private String modello, targa , marca;
	private int peso,anno,num_assi,classe_euro;
	private double altezza;
	
	/**
	 * metodo costruttore di Veicolo
	 * 
	 */
	public Veicolo(String modello, String targa, String marca, int peso, int anno, int num_assi, int classe_euro,
			double altezza) {
		super();
		this.modello = modello;
		this.targa = targa;
		this.marca = marca;
		this.peso = peso;
		this.anno = anno;
		this.num_assi = num_assi;
		this.classe_euro = classe_euro;
		this.altezza = altezza;
	}
	
	/**
	 * metodo costruttore di Veicolo senza classe euro
	 * 
	 */
	public Veicolo(String modello, String targa, String marca, int peso, int anno, int num_assi, double altezza) {
		super();
		this.modello = modello;
		this.targa = targa;
		this.marca = marca;
		this.peso = peso;
		this.anno = anno;
		this.num_assi = num_assi;
		this.altezza = altezza;
	}
	
	/**
	 * metodo get del modello
	 * @return modello
	 */
	public String getModello() {
		return modello;
	}

	/**
	 * metodo set del modello
	 * @param modello nuovo
	 */
	public void setModello(String modello) {
		this.modello = modello;
	}

	/**
	 * metodo get della targa
	 * @return targa
	 */
	public String getTarga() {
		return targa;
	}

	/**
	 * metodo set della targa
	 * @param targa nuova
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}

	/**
	 * metodo get della marca
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * metodo set della marca
	 * @param marca nuova
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * metodo get del peso
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * metodo set del peso
	 * @param peso nuovo
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * metodo get dell'anno
	 * @return anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * metodo set dell'anno
	 * @param anno nuovo
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}

	/**
	 * metodo get del numero degli assi
	 * @return numero degli assi
	 */
	public int getNum_assi() {
		return num_assi;
	}

	/**
	 * metodo set del numero degli assi
	 * @param numero degli assi nuovo
	 */
	public void setNum_assi(int num_assi) {
		this.num_assi = num_assi;
	}

	/**
	 * metodo get della classe euro
	 * @return classe euro
	 */
	public int getClasse_euro() {
		return classe_euro;
	}

	/**
	 * metodo set della classe euro
	 * @param classe euro nuova
	 */
	public void setClasse_euro(int classe_euro) {
		this.classe_euro = classe_euro;
	}

	/**
	 * metodo get dell'altezza
	 * @return altezza
	 */
	public double getAltezza() {
		return altezza;
	}

	/**
	 * metodo set dell'altezza
	 * @param altezza nuova
	 */
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}


	/**
	 * metodo che implementa il metodo della classe InterfacciaVeicolo
	 * Restituisce la classe del veicolo
	 * @return modello
	 */
	@Override
	public int getClassificazione() {
		if(num_assi <=1 ) return 1;
		if(num_assi == 2 && altezza <= 1.3) return 1;
		if(num_assi == 2 && altezza > 1.3) return 2;
		if(num_assi == 3) return 3;
		if(num_assi == 4) return 4;
		if(num_assi >= 5) return 5;
		return 0;
	}

}
