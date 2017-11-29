package it.itsrizzoli.ifts.geometria;

import java.util.Scanner;

public class Programma {

	public static void main(String[] args) {
		PoligonoRegolare poli1 = new PoligonoRegolare();
		PoligonoRegolare poli2 = new PoligonoRegolare();
		
		PoligonoRegolare tri = new TriangoloEquilatero();
		PoligonoRegolare quad = new Quadrato();

		tri.lunghezzaLato = 7;
		((TriangoloEquilatero)tri).altezza = 28;
		//((Quadrato)tri).lunghezzaLato = 30; // ClassCastException
		quad.lunghezzaLato = 16;
		
		System.out.println(tri);
		stampaPerimetro(quad);
		stampaPerimetro(tri);
		
		poli1.lunghezzaLato = 10;
		poli2.lunghezzaLato = 10;
		
		poli1.numeroLati = 4;
		poli2.numeroLati = 4;
		
		System.out.println(poli1);
		
		System.out.println("Uguaglianza tra puntatori => " + (poli1 == poli2));
		System.out.println("Uguaglianza logica => " + (poli1.equals(poli2)));
		System.out.println("Uguaglianza logica => " + (poli1.equals("pippo")));
	}
	
	public static void stampaNumeroLati(PoligonoRegolare poligono) {
		System.out.println("Io ho " + poligono.numeroLati + " lati.");
	}
	
	public static void stampaPerimetro(PoligonoRegolare poligono) {
		System.out.println("Perimetro " + poligono.getClass().getSimpleName() +  " => " + poligono.calcolaPerimetro());
	}

}
