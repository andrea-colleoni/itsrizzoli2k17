package it.itsrizzoli.ifts2k17.modulo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonaDao {

	
	public List<Persona> tutte() {
		List<Persona> elenco = new ArrayList<Persona>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:mariadb://localhost:3306/corso", 
							"root", 
							"");
			Statement comandoSQL = conn.createStatement();
			String sql = "select * from persona";
			ResultSet persone = comandoSQL.executeQuery(sql);
			while(persone.next()) {
				Persona p = new Persona();
				p.setNome(persone.getString("nome"));
				p.setCognome(persone.getString("cognome"));
				p.setId(persone.getInt("id"));
				p.setDataNascita(persone.getDate("data_nascita"));
				p.setAltezzaCm(persone.getInt("altezza_cm"));
				elenco.add(p);
			}
			persone.close();
			comandoSQL.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return elenco;
	}
	
	public List<Persona> personePiuAlteDi(int altezzaMinima) {
		List<Persona> elenco = new ArrayList<Persona>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:mariadb://localhost:3306/corso", 
							"root", 
							"");
			Statement comandoSQL = conn.createStatement();
			String sql = "select * from persona where altezza_cm > " + altezzaMinima;
			ResultSet persone = comandoSQL.executeQuery(sql);
			while(persone.next()) {
				Persona p = new Persona();
				p.setNome(persone.getString("nome"));
				p.setCognome(persone.getString("cognome"));
				p.setId(persone.getInt("id"));
				p.setDataNascita(persone.getDate("data_nascita"));
				p.setAltezzaCm(persone.getInt("altezza_cm"));
				elenco.add(p);
			}
			persone.close();
			comandoSQL.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return elenco;
	}
}
