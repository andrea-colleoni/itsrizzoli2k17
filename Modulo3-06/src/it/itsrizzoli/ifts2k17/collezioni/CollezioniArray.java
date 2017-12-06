package it.itsrizzoli.ifts2k17.collezioni;

import java.util.Scanner;

public class CollezioniArray {

	public static void main(String[] args) {
		// programma che chiede un elenco di parole e le mette in ordine
		// alfabetico e poi le stampa
		Scanner sc = new Scanner(System.in);
		String[] parole = new String[0];
		
		messaggioInput();
		String parola = sc.nextLine();
		int numParole = 0;
		while(!"esci".equals(parola)) {
			parole = ridimensionaArray(parole, ++numParole);
			parole[(numParole - 1)] = parola;
			// numParole++, ++numParole
			messaggioInput();
			parola = sc.nextLine();
		}
		// ordino l'array: bubble sort
		for(int i = 0; i < parole.length - 1; i++) {
			for(int j = i + 1; j < parole.length; j++) {
				if (parole[i].compareTo(parole[j]) > 0) {
					String mem = parole[i];
					parole[i] = parole[j];
					parole[j] = mem;
				}
			}
		}
		for(String p: parole) {
			System.out.println(p);
		}

	}
	
	static void messaggioInput() {
		System.out.print("Inserisci una parola (esci per terminare): ");
	}
	
	static String[] ridimensionaArray(String[] arrDaIngrandire, 
			int numElementi) {
		String[] risultato = new String[numElementi];
		for(int i = 0; 
				i < Math.min(arrDaIngrandire.length, numElementi); 
				i++) {
			risultato[i] = arrDaIngrandire[i];
		}
		return risultato;
	}

}
