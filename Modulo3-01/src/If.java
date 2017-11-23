
public class If {

	public static void main(String[] args) {
		int a = 10;
		
		if ( a > 20) {  // blocco if princiaple
			System.out.println("a è minore di 20");
		} else if ( a < 5 ) {
			System.out.println("à è minore di 5");
		} else if ( a < 15 ) {
			System.out.println("a è minore di 15");
		} else if ( a < 12 ) {
			System.out.println("a è minore di 12");
		} else { // blocco else; solo se tutti gli if sono false
			System.out.println("a è compreso tra 5 e 20");
		}
	}

}
