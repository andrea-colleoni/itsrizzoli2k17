package it.rizzoli.ifts.corso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InterrogazioniDB {

	public static void main(String[] args) {
		//1. Creare un EntityManagerFactory usando Persistence
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XXXYYY");
		
		//2. Creare un EntiutyManager con cui fare query di tutti i tipi
		EntityManager em = emf.createEntityManager();
		
		Corso c = em.find(Corso.class, 1);

		System.out.println("Corso: " + c.getTitolo() + " - docente: " + c.getDocente().getNome());
		System.out.println("Il docente insegna anche queste materie:");
		for(Materia m : c.getDocente().getMaterie()) {
			System.out.println(m.getNome());
		}
	}

}
