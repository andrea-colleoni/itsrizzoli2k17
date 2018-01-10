package it.rizzoli.ifts.corso;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programma {

	public static void main(String[] args) {
		//1. Creare un EntityManagerFactory usando Persistence
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XXXYYY");
		
		//2. Creare un EntiutyManager con cui fare query di tutti i tipi
		EntityManager em = emf.createEntityManager();
		
		//3. Creo il mio oggetto usando il bean annotato con @Entity
		Corso c = new Corso();
		c.setDataInizio(new Date());
		c.setTitolo("Corso JPA");
		c.setOreComplessive(20);
		c.setPostiDisponibili(22);
		c.setDescrizione("Imparare a usare JPA");
		
		Docente d = new Docente();
		d.setCorsi(new ArrayList<Corso>());
		d.setMaterie(new ArrayList<Materia>());
		d.setCodiceFiscale("ABCD");
		d.setNome("Mario");
		d.setCognome("Rossi");
		
		c.setDocente(d);
		d.getCorsi().add(c);
		
		Materia m = new Materia();
		m.setDocenti(new ArrayList<Docente>());
		m.setNome("Matematica");
		
		d.getMaterie().add(m);
		m.getDocenti().add(d);
		
		
		//4. salvo il mio oggetto sul DB
		// 4.1 iniziare una nuova transazione
		em.getTransaction().begin();
		//4.2 faccio le modifiche al DB
		em.persist(d);
		//4.3 concludo la transazione
		em.getTransaction().commit();

	}

}
