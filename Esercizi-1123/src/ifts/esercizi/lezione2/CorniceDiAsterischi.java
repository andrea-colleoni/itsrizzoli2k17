package ifts.esercizi.lezione2;

import java.util.Scanner;

public class CorniceDiAsterischi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la base > ");
		int b = sc.nextInt();
		System.out.print("Inserisci l'altezza > ");
		int h = sc.nextInt();
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= b; j++) {
				if (i == 1 || i == h || j == 1 || j == b)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
