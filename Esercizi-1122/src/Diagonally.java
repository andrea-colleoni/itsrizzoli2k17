
public class Diagonally {

	public static void main(String[] args) {
		String str = "Diagonally";
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(str.charAt(i));
		}
	}

}
