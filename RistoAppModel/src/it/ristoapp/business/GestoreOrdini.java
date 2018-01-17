package it.ristoapp.business;

import javax.persistence.EntityManager;

public class GestoreOrdini {
	
	public int nuovoOrdine() {
		Ordine o = new Ordine();
		o.setTavoli(new ArrayList<>());
		return 5;
	}
	
	public boolean mettiProdottoInOrdine(int idProdotto, int quantita, int idOrdine) {
		EntityManager em = JPAUtility.emf.createEntityManager();
		Ordine o = em.find(Ordine.class, idOrdine);
		
		if (o != null) {
			Prodotto p = em.find(Prodotto.class,  idProdotto);
			RigaOrdine ro = new RigaOrdine();
			ro.setProdotto(p);
			ro.setOrdine(o);
			ro.setQuantita(quantita);
			if (p != null) {
				o.getRigheOrdine().add(ro);
				em.getTransaction().begin();
				em.persist(ro);
				em.getTransaction().commit();
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	public boolean modificaQuantita(int idProdotto, int quantita, int idOrdine) {
		return false;
	}

	public void confermaOrdine() throws Exception {
		throw new Exception("Errore nella conferma d'ordine");
		
	}

	public void paga() {
		// TODO Auto-generated method stub
		
	}

}
