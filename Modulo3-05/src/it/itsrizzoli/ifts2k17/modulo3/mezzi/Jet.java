package it.itsrizzoli.ifts2k17.modulo3.mezzi;

public class Jet extends MezzoDiTrasporto implements Volante {

	@Override
	void accelera() {
		System.out.println("tiro la cloche");

	}

	@Override
	void frena() {
		System.out.println("spingo la cloche");
	}

	@Override
	public void vola() {
		System.out.println("voloooooo!");
	}

}
