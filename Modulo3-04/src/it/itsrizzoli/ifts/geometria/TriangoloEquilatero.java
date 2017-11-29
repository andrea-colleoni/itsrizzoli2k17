package it.itsrizzoli.ifts.geometria;

public class TriangoloEquilatero extends PoligonoRegolare {

	float altezza;

	public TriangoloEquilatero() {
		super();
		this.numeroLati = 3;
	}



	@Override
	public boolean equals(Object altroPoligono) {
		return super.equals(altroPoligono);
	}

	@Override
	public String toString() {
		return "Io sono un triangolo equilatero di lato " + lunghezzaLato;
	}
	
	
}
