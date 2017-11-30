package it.itsrizzoli.ifts2k17.modulo3.mezzi;

public class Automobile extends MezzoDiTrasporto implements MezzoAMotore {

	@Override
	void accelera() {
		System.out.println("premo sull'acceleratore");

	}

	@Override
	void frena() {
		System.out.println("premo sul freno");
	}

	@Override
	public void faiRifornimento() {
		System.out.println("metto benzina nel serbatoio");
		
	}

}
