package it.itsrizzoli.ifts2017.oop;

public class Dado {

	int numeroFacce;
	
	int ultimoNumero;
	
	void stampaNumeroFacce() {
		System.out.println("ciao => " + numeroFacce);
	}
	
	int lancia() {
		ultimoNumero = (int)(Math.random() * numeroFacce) + 1;
		return ultimoNumero;
	}
}
