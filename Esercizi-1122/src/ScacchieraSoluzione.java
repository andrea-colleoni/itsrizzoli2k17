
public class ScacchieraSoluzione {

	public static void main(String[] args) {
		String[] colori = { " ", "█" };
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				System.out.print(colori[(col + row) % 2]);
				// System.out.print(col % 2);
			}
			System.out.println();
		}

		String rigaPari = "white-black-";
		String rigaDispari = "black-white-";
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(rigaPari);
			}
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print(rigaDispari);
			}
			System.out.println();
		}
	}

}
