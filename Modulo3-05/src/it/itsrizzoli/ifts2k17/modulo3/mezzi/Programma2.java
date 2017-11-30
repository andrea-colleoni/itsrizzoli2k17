package it.itsrizzoli.ifts2k17.modulo3.mezzi;

public class Programma2 {

	public static void main(String[] args) {
		MezzoDiTrasporto[] mezzi = new MezzoDiTrasporto[5];
		mezzi[0] = new Bicicletta();
		mezzi[1] = new Bicicletta();
		mezzi[2] = new Automobile();
		mezzi[3] = new Automobile();
		mezzi[4] = new Jet();
		
		for(MezzoDiTrasporto mdt : mezzi) {
			mdt.accelera();
			mdt.arresta();
		}
		
		MezzoAMotore auto = new Automobile();
		auto.faiRifornimento();
		
		Acquatico a = new Idrovolante();
		a.galleggia();
		if(a instanceof Volante) 
			((Volante)a).vola();

	}

}
