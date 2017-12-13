package it.itsrizzoli.ifts2k17.modulo3;

import java.util.List;

public class ProgrammaCheUsaDao {

	public static void main(String[] args) {
		PersonaDao pdao = new PersonaDao();
		
		List<Persona> persone = pdao.tutte();
		for(Persona p: persone) {
			System.out.println(p.getNome());
		}

	}

}
