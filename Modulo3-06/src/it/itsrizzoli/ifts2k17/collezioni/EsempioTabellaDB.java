package it.itsrizzoli.ifts2k17.collezioni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EsempioTabellaDB {

	public static void main(String[] args) {
		List<HashMap<String, Object>> tabella = 
				new ArrayList<HashMap<String, Object>>();
		
		// persona=> nome: mario, cognome: rossi
		// persona=> nome: anna, cognome: bianchi

		HashMap<String, Object> p = new HashMap<String, Object>();
		p.put("nome",  "Mario");
		p.put("cognome", "Rossi");
		tabella.add(p);
		p = new HashMap<String, Object>();
		p.put("nome",  "Anna");
		p.put("cognome", "Bianchi");
		tabella.add(p);
		
		
		
	}

}
