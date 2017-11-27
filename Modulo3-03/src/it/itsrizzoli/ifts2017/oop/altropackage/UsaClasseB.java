package it.itsrizzoli.ifts2017.oop.altropackage;

public class UsaClasseB {

	public static void main(String[] args) {
		ClasseB.statico = "sss";
		
		ClasseB b1 = new ClasseB();
		ClasseB b2 = new ClasseB();
		ClasseB b3 = new ClasseB();
		
		b1.pubblico = "a1";
		b1.protetto = "a2";
		b1.pachetto = "a3";
		ClasseB.statico = "a-s";
		
		b2.pubblico = "b1";
		b2.protetto = "b2";
		b2.pachetto = "b3";
		ClasseB.statico = "b-s";
		
		b3.pubblico = "c1";
		b3.protetto = "c2";
		b3.pachetto = "c3";
		ClasseB.statico = "c-s";
	}

}
