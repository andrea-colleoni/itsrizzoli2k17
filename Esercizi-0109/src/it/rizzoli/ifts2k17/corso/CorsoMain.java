package it.rizzoli.ifts2k17.corso;

import java.sql.SQLException;
import java.util.Date;

public class CorsoMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CorsoDao cdao = new CorsoDao();
		for(Corso c : cdao.tuttiICorsi()) {
			System.out.println(c);
		}

		System.out.println(cdao.corsoPerChiave(1));

//		Corso c = new Corso();
//		c.setTitolo("Corso nuovo");
//		c.setDescrizione("Corso di ???");
//		c.setDataInizio(new Date());
//		c.setPostiDisponibili(3);
//		c.setOreComplessive(8);
//		
//		cdao.inserisciCorso(c);
		
		Corso c = cdao.corsoPerChiave(1);
		c.setTitolo("Titolo modificato");
		cdao.aggiornaCorso(c);
		
		c = cdao.corsoPerChiave(3);
		cdao.eliminaCorso(c);
	}

}
