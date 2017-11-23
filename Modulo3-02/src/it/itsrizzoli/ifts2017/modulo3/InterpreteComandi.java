package it.itsrizzoli.ifts2017.modulo3;

import java.util.Scanner;

public class InterpreteComandi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String comando = "";	
		do {
			System.out.print("Inserisci un comando > ");
			comando = sc.nextLine();
			// eco
			System.out.println("echo > " + comando);
		} while (!comando.equals("esci"));

	}

}
