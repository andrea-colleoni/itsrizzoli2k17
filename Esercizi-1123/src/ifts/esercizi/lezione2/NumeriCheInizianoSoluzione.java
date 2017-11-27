package ifts.esercizi.lezione2;

import java.util.Scanner;

public class NumeriCheInizianoSoluzione {

	public static void main(String[] args) {
		int[] numeri = new int[5];
		int sesto = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < numeri.length; i++) {
			System.out.print("Inserisci il numero " + i + ". > ");
			numeri[i] = sc.nextInt();
		}
		System.out.print("Inserisci il sesto numero > ");
		sesto = sc.nextInt();
		/*
		 * Approccio matematico
		 * 15
		 * 156
		 * 1567
		 * 15678
		 * 
		 * 156
		 */
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i] >= sesto) {
				int divisore = (numeri[i] / sesto);
				if (Math.log10(divisore) == (int)Math.log10(divisore)) {
					System.out.println(divisore + 
							" => " + numeri[i]);
				}
			}
		}
		
		/* Approccio con le stringhe */
		System.out.println("*********************************************");
		String confronto = String.valueOf(sesto);
		for(int i = 0; i < numeri.length; i++) {
			String n = String.valueOf(numeri[i]);
			if (n.indexOf(confronto) == 0) {
				System.out.println(n);
			}
		}
	}

}
