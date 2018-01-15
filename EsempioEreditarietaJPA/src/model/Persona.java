package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
// @Inheritance(strategy=InheritanceType.SINGLE_TABLE) //-> default
@Inheritance(strategy=InheritanceType.JOINED)
// @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
// @DiscriminatorColumn(name="TIPO_PERSONA")
public class Persona {
	
	@Id
	private String email;
	private String nome;
	private String cognome;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	

}
