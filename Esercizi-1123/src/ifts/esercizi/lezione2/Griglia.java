package ifts.esercizi.lezione2;

public class Griglia {

	public static void main(String[] args) {
		int n = 4;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print('#');
			}
			System.out.println();
		}
	}
}
