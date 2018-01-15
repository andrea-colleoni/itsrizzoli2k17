package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Docente extends Persona {
	
	private String corsi;

	public String getCorsi() {
		return corsi;
	}

	public void setCorsi(String corsi) {
		this.corsi = corsi;
	}
	
	

}
