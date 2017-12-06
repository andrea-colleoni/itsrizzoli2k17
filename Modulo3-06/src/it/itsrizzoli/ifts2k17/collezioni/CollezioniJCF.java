package it.itsrizzoli.ifts2k17.collezioni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollezioniJCF {

	public static void main(String[] args) {
		// programma che chiede un elenco di parole e le mette in ordine
		// alfabetico e poi le stampa
		Scanner sc = new Scanner(System.in);
		//String[] parole = new String[0];
		List<String> parole = new ArrayList<String>();
		
		messaggioInput();
		String parola = sc.nextLine();
		//int numParole = 0;
		while(!"esci".equals(parola)) {
			//parole = ridimensionaArray(parole, ++numParole);
			parole.add(parola);
			messaggioInput();
			parola = sc.nextLine();
		}
		parole.sort(null);
		for(String p: parole) {
			System.out.println(p);
		}

	}
	
	static void messaggioInput() {
		System.out.print("Inserisci una parola (esci per terminare): ");
	}

}
