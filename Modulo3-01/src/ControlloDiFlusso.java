
public class ControlloDiFlusso {

	public static void main(String[] args) {
		int a = 10;
		a = a + 15;
		System.out.println(a);

		/* operatori di confronto 
		 * == : uguaglianza
		 * != : diversità
		 * >, <, >=, <= : disuguaglianze
		 */
		/* operatori logici 
		 * &&, & : AND e bitwise AND
		 * ||, | : OR e bitwise OR
		 * ! : not
		 */
		if (a == 25) {  // nelle parentesi => espressione boolean
			System.out.println("uguale a 25");
		}
	}
}
