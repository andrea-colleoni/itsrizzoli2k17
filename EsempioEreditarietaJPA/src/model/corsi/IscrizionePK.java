package model.corsi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the iscrizione database table.
 * 
 */
@Embeddable
public class IscrizionePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_corso", insertable=false, updatable=false)
	private int idCorso;

	@Column(name="mail_studente", insertable=false, updatable=false)
	private String mailStudente;

	public IscrizionePK() {
	}
	public int getIdCorso() {
		return this.idCorso;
	}
	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}
	public String getMailStudente() {
		return this.mailStudente;
	}
	public void setMailStudente(String mailStudente) {
		this.mailStudente = mailStudente;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IscrizionePK)) {
			return false;
		}
		IscrizionePK castOther = (IscrizionePK)other;
		return 
			(this.idCorso == castOther.idCorso)
			&& this.mailStudente.equals(castOther.mailStudente);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCorso;
		hash = hash * prime + this.mailStudente.hashCode();
		
		return hash;
	}
}