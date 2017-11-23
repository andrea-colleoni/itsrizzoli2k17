
public class While {

	public static void main(String[] args) {

		int a = 5;
		
		while(a > 0) {
			System.out.println("a è maggiore di 0");
			a--;
		}
		
		do {
			System.out.println("a è minore di 5");
			a++;
		} while (a < 5);
	}

}
