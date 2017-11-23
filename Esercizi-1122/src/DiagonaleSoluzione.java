
public class DiagonaleSoluzione {

	public static void main(String[] args) {
		String parola = "diagonally";
		int numeroSpazi = 0;
		for(char c : parola.toCharArray()) {
			for(int i = 0; i < numeroSpazi; i++) {
				System.out.print(" ");
			}
			System.out.println(c);
			numeroSpazi++;
		}
	}

}
