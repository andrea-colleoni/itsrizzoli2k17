package it.itsrizzoli.ifts2k17.collezioni;

import java.util.HashMap;
import java.util.Map;

public class GGSettimanaMap {

	public static void main(String[] args) {
		// traduttore di giorni
		Map<String, String> gg = new HashMap<String, String>();
		gg.put("luned�",  "monday");
		gg.put("marted�",  "tuesdey");
		gg.put("mercoled�",  "wednesday");
		gg.put("gioved�",  "thursday");
		gg.put("venerd�",  "friday");
		gg.put("sabato",  "saturday");
		gg.put("domenica",  "sunday");
		
		//traduciGiorno("luned�") => "monday"
		System.out.println(gg.get("lunedi"));
		
		for(String valore : gg.values()) {
			System.out.println(valore);
		}
		for(String chiave : gg.keySet()) {
			System.out.println(chiave + " => " + gg.get(chiave));
		}
	}


}
