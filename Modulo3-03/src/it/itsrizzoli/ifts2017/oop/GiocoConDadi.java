package it.itsrizzoli.ifts2017.oop;

public class GiocoConDadi {

	public static void main(String[] args) {
		Dado d1 = new Dado();
		d1.numeroFacce = 6;
		Dado d2 = new Dado();
		d2.numeroFacce = 8;
		
		//d2 = d1;
		d2.numeroFacce = 12;
		
		// stampaNumeroFacce(d1); // chiamata di metodo
		d1.stampaNumeroFacce();
		d2.stampaNumeroFacce();
		
		System.out.println("Lancio => " + d1.lancia());
		System.out.println("Lancio => " + d2.lancia());
		
	}
	
	static void stampaNumero(Dado dado) {
		System.out.println("ciao => " + dado.numeroFacce);
		dado.numeroFacce = 10;
		metodoInutile();
	}
	
	static void metodoInutile() {
		System.out.println("Sono inutile...");
	}

}
