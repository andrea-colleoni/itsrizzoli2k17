package ifts.esercizi.lezione2;

public class SommaEMedia {

	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		
		int somma = 0;
		for (int i = a; i <= b; i++) {
			somma += i;
		}
		System.out.println("Somma: " + somma);
		System.out.println("Media: " + ((double)somma / (b - a)));
	}

}
