package it.itsrizzoli.ifts2k17.modulo3.mezzi;

public class Programma {

	public static void main(String[] args) {
		MezzoDiTrasporto mdt = new Bicicletta();
		mdt.accelera();
		
		Bicicletta bici = new Bicicletta();
		bici.accelera();
		
		Automobile auto = new Automobile();
		auto.accelera();
		
		MezzoDiTrasporto auto2 = new Automobile();
		auto2.accelera();
	}

}
