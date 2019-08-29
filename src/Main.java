import java.util.*;

import Modello.*;

public class Main {
	
	public static void main(String[] args) {
		
		//Veicoli 
		 Veicolo v1 = new Veicolo("600", "TR123AR", "FIAT", 800, 2006, 2, 1.22);	/*senza classe euro*/
		 Veicolo v2 = new Veicolo("500", "AB582BU", "FIAT", 950, 2009, 2, 3, 1.35); /*con classe euro*/
		
		//Caselli
		Casello c1 = new Casello("CA24.1", "CaselloA24.1", 0);
		Casello c2 = new Casello("CA24.2", "CaselloA24.2", 350);
		Casello c3 = new Casello("CA24.3", "CaselloA24.3", 700);
		Casello c4 = new Casello("CA51.1", "CaselloA51.1", 0);
		Casello c5 = new Casello("CA51.2", "CaselloA51.2", 400);
		Casello c6 = new Casello("CA51.3", "CaselloA51.3", 800);
		
		HashSet<Casello> listaCaselliA24 = new HashSet<Casello>();
		listaCaselliA24.add(c1);
		listaCaselliA24.add(c2);
		listaCaselliA24.add(c3);
		
		TreeMap<Integer,Double> tariffeA24 = new TreeMap<Integer,Double>();
		tariffeA24.put(1, 1.5);
		tariffeA24.put(2, 2.0);
		tariffeA24.put(3, 2.75);
		tariffeA24.put(4, 3.5);
		tariffeA24.put(5, 3.75);
		
		//Autostrade
		Autostrada a1 = new Autostrada("A14", tariffeA24, listaCaselliA24);
		Autostrada a2 = new Autostrada("A51");
		
		a2.addCasello(c4);
		a2.addCasello(c5);
		a2.addCasello(c6);
		
		a2.setTariffa(1, 1.0);
		a2.setTariffa(2, 1.5);
		a2.setTariffa(3, 2.5);
		a2.setTariffa(4, 3.5);
		a2.setTariffa(5, 4.0);
		
		//percorsi
		Percorso p1 = new Percorso(c1,c2, a1);
		Percorso p2 = new Percorso(c4,c5, a2);
		
		//prova pedaggio
		System.out.print("Pedaggio percorso 1: " + Pedaggio.calcolaPedaggio(v1,p1) + " \n");
		System.out.print("Pedaggio percorso 2: " + Pedaggio.calcolaPedaggio(v2,21,p2) + " \n");
	}
}
