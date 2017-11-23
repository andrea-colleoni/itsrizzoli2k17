package ifts.esercizi.lezione2;

public class CorniciNumeroDispari {

	public static void main(String[] args) {
		int n = 3;

		int i = 1;
		int j = 1;
		boolean incrementaEsterno = true;
		boolean incrementaInterno = true;
		while (i > 0) {
			while (j > 0) {
				if (i < j)
					System.out.print(i);
				else
					System.out.print(j);
				if (j < n && incrementaInterno) 
					j++;
				else {
					incrementaInterno = false;
					j--;
				}
			}
			j = 1;
			incrementaInterno = true;
			System.out.println();
			if (i < n && incrementaEsterno) 
				i++;
			else {
				incrementaEsterno = false;
				i--;
			}
		}
	}
}
