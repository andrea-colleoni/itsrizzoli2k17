package model.corsi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the studente database table.
 * 
 */
@Entity
@NamedQuery(name="Studente.findAll", query="SELECT s FROM Studente s")
public class Studente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String mail;

	//bi-directional many-to-one association to Iscrizione
	@OneToMany(mappedBy="studente")
	private List<Iscrizione> iscriziones;

	public Studente() {
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Iscrizione> getIscriziones() {
		return this.iscriziones;
	}

	public void setIscriziones(List<Iscrizione> iscriziones) {
		this.iscriziones = iscriziones;
	}

	public Iscrizione addIscrizione(Iscrizione iscrizione) {
		getIscriziones().add(iscrizione);
		iscrizione.setStudente(this);

		return iscrizione;
	}

	public Iscrizione removeIscrizione(Iscrizione iscrizione) {
		getIscriziones().remove(iscrizione);
		iscrizione.setStudente(null);

		return iscrizione;
	}

}