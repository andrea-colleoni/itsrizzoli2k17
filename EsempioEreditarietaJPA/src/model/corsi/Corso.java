package model.corsi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the corso database table.
 * 
 */
@Entity
@NamedQuery(name="Corso.findAll", query="SELECT c FROM Corso c")
public class Corso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idcorso;

	//bi-directional many-to-one association to Iscrizione
	@OneToMany(mappedBy="corso", cascade={CascadeType.ALL})
	private List<Iscrizione> iscriziones;

	public Corso() {
	}

	public int getIdcorso() {
		return this.idcorso;
	}

	public void setIdcorso(int idcorso) {
		this.idcorso = idcorso;
	}

	public List<Iscrizione> getIscriziones() {
		return this.iscriziones;
	}

	public void setIscriziones(List<Iscrizione> iscriziones) {
		this.iscriziones = iscriziones;
	}

	public Iscrizione addIscrizione(Iscrizione iscrizione) {
		getIscriziones().add(iscrizione);
		iscrizione.setCorso(this);

		return iscrizione;
	}

	public Iscrizione removeIscrizione(Iscrizione iscrizione) {
		getIscriziones().remove(iscrizione);
		iscrizione.setCorso(null);

		return iscrizione;
	}

}