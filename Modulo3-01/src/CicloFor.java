
public class CicloFor {

	public static void main(String[] args) {

		// 10 iterazioni
		for(int i = 0; i < 10; i++) { // (inizializzazione; check; fine ciclo)
			System.out.println("iterazione numero " + i);
		}
		
		int j = 0;
		for(; j < 5;) {
			System.out.println("valore di j => " + j);
			j = j + 3;
		}
	}

}
