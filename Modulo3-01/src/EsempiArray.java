
public class EsempiArray {

	public static void main(String[] args) {
		// cercare il numero più grande in questo array
		// stamparlo a video
		int[] numeri = {1, 5, 6, 2, 10, 18, 4, 26, 7,
				19, 82, 1, 99, 14, 55, 102, 18, 58, 69,
				170, 3, 7, 29 };
		
		int piuGrande = numeri[0];
		/*
		if (numeri[1] > piuGrande) {
			piuGrande = numeri[1];
		}
		// piuGrande qui vale 5
		if (numeri[2] > piuGrande) {
			piuGrande = numeri[2];
		}
		// piuGrande qui vale 6
		if (numeri[3] > piuGrande) {
			piuGrande = numeri[3];
		}
		// piuGrande vale 6
		*/
		/*
		for(int i = 1; i < numeri.length; i++) {
			if (numeri[i] > piuGrande) {
				piuGrande = numeri[i];
			}
		}
		*/
		// altra versione del ciclo for => for each
		for(int numero : numeri) {
			if (numero > piuGrande) {
				piuGrande = numero;
			}
		}
		
		System.out.println("Il numero più grande è " + piuGrande);
	}

}
