package model;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class EmfTest {

	@Test
	public void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ered");
		EntityManager em = emf.createEntityManager();
		
		Studente s = new Studente();
		s.setNome("Test Stud");
		s.setEmail("stud@");
		
		
		Docente d = new Docente();
		d.setNome("Test Doc");
		d.setEmail("doc@");
		
		em.getTransaction().begin();
		em.persist(s);
		em.persist(d);
		em.getTransaction().commit();
		
		
	}

}
