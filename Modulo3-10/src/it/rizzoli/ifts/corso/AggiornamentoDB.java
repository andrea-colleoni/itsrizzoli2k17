package it.rizzoli.ifts.corso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AggiornamentoDB {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XXXYYY");
		EntityManager em = emf.createEntityManager();
		
		Materia m = em.find(Materia.class, 3);
		
		Docente abcd = em.find(Docente.class, "ABCD");
		
		m.setNome("Informatica (corretto)");
		
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();

	}

}
