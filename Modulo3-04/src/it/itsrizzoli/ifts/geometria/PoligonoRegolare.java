package it.itsrizzoli.ifts.geometria;

public class PoligonoRegolare {

	int numeroLati;

	float lunghezzaLato;

	protected float calcolaPerimetro() {
		return numeroLati * lunghezzaLato;
	}
	
	protected float calcolaPerimetro(boolean stampaRisultato) {
		float p = calcolaPerimetro();
		System.out.println("Il perimetro � " + p);
		return p;
	}

	@Override
	public boolean equals(Object altroPoligono) {
		if (altroPoligono instanceof PoligonoRegolare)
			return (this.numeroLati == ((PoligonoRegolare) altroPoligono).numeroLati
					&& this.lunghezzaLato == ((PoligonoRegolare) altroPoligono).lunghezzaLato);
		else
			return false;
	}

	@Override
	public String toString() {
		return "Io sono un poligono di lato " + lunghezzaLato + " con " + numeroLati + " lati.";
	}

}
