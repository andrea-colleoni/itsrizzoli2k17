package it.itsrizzoli.ifts2k17.collezioni;

import java.util.HashMap;
import java.util.Map;

public class EsempioMappe {

	public static void main(String[] args) {
		Map<String, Mese> mesi = new HashMap<String, Mese>();
		
		Mese m = new Mese();
		m.setNome("gennaio");
		m.setNomeInglese("january");
		m.setStagione("inverno");
		
		mesi.put("x", m);
		
		m = new Mese();
		m.setNome("febbraio");
		m.setNomeInglese("february");
		m.setStagione("inverno");
		mesi.put("y", m);
		
		System.out.println(mesi.get("z"));
		
		
	}
}
