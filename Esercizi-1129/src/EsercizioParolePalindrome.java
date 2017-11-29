import java.util.Scanner;

public class EsercizioParolePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String parola = sc.nextLine();

		while (!parola.equals("esci")) {
			// String stringaInvertita = new
			// StringBuilder().append(parola).reverse().toString();
			String stringaInvertita = "";
			for (int i = parola.length() - 1; i >= 0; i--) {
				stringaInvertita += parola.charAt(i);
			}
			System.out.println(stringaInvertita);
			if (parola.equals(stringaInvertita)) {
				System.out.println("Palindroma!");
			} else {
				System.out.println("NON palindroma!");
			}
			parola = sc.nextLine();
		}
	}

}
