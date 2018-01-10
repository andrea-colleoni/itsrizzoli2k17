package it.rizzoli.ifts.corso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InterrogazioniDB2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XXXYYY");
		EntityManager em = emf.createEntityManager();
		
		List<Materia> tutteLeMaterie = em.createQuery(
				"select m from Materia m", Materia.class)
				.getResultList();

		for(Materia m : tutteLeMaterie) {
			System.out.println(m.getNome());
		}
	}

}
