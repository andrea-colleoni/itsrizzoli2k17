package ifts.esercizi.lezione2;

public class SommaEMediaSoluzione {

	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		int somma = 0;
		// somma = somma + x
		// somma += x
		// +=, *=, /=, -=
		// &=, |=
		for(int i = a; i <= b; i++) {
			somma += i;
		}
		System.out.println("Somma => " + somma);
		System.out.println("Media => " + ((double)somma / (b - a + 1)));
	}

}
