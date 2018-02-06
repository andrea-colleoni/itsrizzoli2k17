package model.corsi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the iscrizione database table.
 * 
 */
@Entity
@NamedQuery(name="Iscrizione.findAll", query="SELECT i FROM Iscrizione i")
public class Iscrizione implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IscrizionePK id;

	@Temporal(TemporalType.DATE)
	private Date data;

	//bi-directional many-to-one association to Corso
	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="id_corso")
	private Corso corso;

	//bi-directional many-to-one association to Studente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mail_studente")
	private Studente studente;

	public Iscrizione() {
	}

	public IscrizionePK getId() {
		return this.id;
	}

	public void setId(IscrizionePK id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Corso getCorso() {
		return this.corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}

	public Studente getStudente() {
		return this.studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

}