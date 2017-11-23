
public class Strumenti {

	public static void main(String[] args) {
		String[] strumenti = { "cello", "guitar", "violin", "double bass" };
		for (String strumento : strumenti) {
			for (char c : strumento.toCharArray()) {
				switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					break;
				default:
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

}
