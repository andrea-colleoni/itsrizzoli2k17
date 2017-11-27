package ifts.esercizi.lezione2;

public class CorniciSoluzione {

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		int j = 1;
		boolean cresceI = true;
		boolean cresceJ = true;
		while(i > 0) {
			while(j > 0) {
				if (i <= j) {
					System.out.print(i);
				} else {
					System.out.print(j);
				}
				if (cresceJ && j < n) { 
					j++;
				} else {
					cresceJ = false;
					j--;
				}
			}
			System.out.println();
			j = 1;
			cresceJ = true;
			if (cresceI && i < n) { 
				i++;
			} else {
				cresceI = false;
				i--;
			}
		}
	}

}
