
public class Scacchiera {

	public static void main(String[] args) {
		String[] colori = { " ", "█" };
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j< 8; j++) {
				System.out.print(colori[(i+j) % 2]);
			}
			System.out.println();
		}
			
	}

}
