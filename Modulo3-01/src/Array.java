
public class Array {

	public static void main(String[] args) {
		int a = 10;
		int[] arr = new int[10]; //dichiarazione di un array
		
		arr[0] = 10; // assegnazione di un valore all'indice 0 dell'array
		arr[1] = 15; // [indice] => parte sempre da 0
		arr[2] = 20;
		// ..
		arr[9] = 100;
		
		// cosa succede?
		//arr[10] = 2; //ArrayIndexOutOfBoundsExcepion
		
		char[] caratteri = { 'a', 'b', 'c', 'd', 'e' };
		
		String[] stringhe = { "ciao", "buongiorno", "buonasera", "buonanotte" };
		
	}

}
