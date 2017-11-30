package it.itsrizzoli.ifts.geometria;

public class TriangoloEquilatero extends PoligonoRegolare {

	float altezza;

	public TriangoloEquilatero() {
		super();
		this.numeroLati = 3;
	}
	
	public TriangoloEquilatero(float lunghezzaLato) {
		super();
		this.numeroLati = 3;
		this.lunghezzaLato = lunghezzaLato;
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
