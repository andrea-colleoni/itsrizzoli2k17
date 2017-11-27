package ifts.esercizi.lezione2;

import java.util.Scanner;

public class RettangoloSoluzione {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la base b > ");
		int b = sc.nextInt();
		System.out.print("Inserisci l'altezza h > ");
		int h = sc.nextInt();
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < b; j++) {
				if (i == 0 || i == (h -1) || j == 0 || j == (b - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
