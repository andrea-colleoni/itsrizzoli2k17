package it.itsrizzoli.ifts2k17.collezioni;

import java.util.HashMap;
import java.util.Map;

public class GGSettimanaArray {
	
	static String[] ggIta = { "lunedì", "martedì", "mercoledì", "giovedì", "venerdì",
			 "sabato", "domenica"};
	static String[] ggEng= { "monday", "tuesdey", "wednesday", "thursday",
			"friday", "saturday", "sunday"};

	public static void main(String[] args) {
		// traduttore di giorni
		
		//traduciGiorno("lunedì") => "monday"
		System.out.println(traduciGiorno("venerdì"));
	}

	private static String traduciGiorno(String gg) {
		for(int i=0; i < ggIta.length; i++) {
			if(gg.equals(ggIta[i]))
				return ggEng[i];
		}
		return null;
	}

}
