package it.itsrizzoli.ifts2k17.modulo3.mezzi;

public abstract class MezzoDiTrasporto {
	
	int numeroPosti;
	float velocitaMassima;
	float peso;
	
	abstract void accelera();
	
	abstract void frena();
	
	void arresta() {
		System.out.println("mi fermo... non so bene come, ma mi fermo");
	}
	
}
