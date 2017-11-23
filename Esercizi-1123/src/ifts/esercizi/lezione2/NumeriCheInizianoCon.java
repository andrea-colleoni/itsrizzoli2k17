package ifts.esercizi.lezione2;

import java.util.Scanner;

public class NumeriCheInizianoCon {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Inserisci l'intero n. " + (i + 1) + " > ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Inserisci il sesto numero > ");
		arr[5] = sc.nextInt();
		for(int i = 0; i < 5; i++) {
			if(arr[i] >= arr[5]) {
				int divisore = arr[i] / arr[5];
				if ((arr[i] / divisore) == arr[5])
					System.out.println(arr[i]);
			}
		}
	}

}
