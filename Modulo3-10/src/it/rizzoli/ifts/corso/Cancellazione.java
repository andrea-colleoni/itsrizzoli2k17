package it.rizzoli.ifts.corso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Cancellazione {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XXXYYY");
		EntityManager em = emf.createEntityManager();
		
		Materia latino = em.find(Materia.class, 5);
		
		em.getTransaction().begin();
		em.remove(latino);
		em.getTransaction().commit();

	}

}
