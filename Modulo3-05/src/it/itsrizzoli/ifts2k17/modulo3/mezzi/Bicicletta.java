package it.itsrizzoli.ifts2k17.modulo3.mezzi;

public class Bicicletta extends MezzoDiTrasporto {

	@Override
	void accelera() {
		System.out.println("aumento la frequenza delle pedalate");
	}

	@Override
	void frena() {
		System.out.println("diminuisco la frequenza delle pedalate");
		
	}


}
