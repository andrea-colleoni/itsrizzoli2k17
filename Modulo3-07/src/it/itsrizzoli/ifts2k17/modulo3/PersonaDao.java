package it.itsrizzoli.ifts2k17.modulo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonaDao {
	
	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = 
				DriverManager.getConnection(
						"jdbc:mariadb://localhost:3306/corso", 
						"root", 
						"");
		return conn;
	}
	
	private Persona mappaPersona(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNome(rs.getString("nome"));
		p.setCognome(rs.getString("cognome"));
		p.setId(rs.getInt("id"));
		p.setDataNascita(rs.getDate("data_nascita"));
		p.setAltezzaCm(rs.getInt("altezza_cm"));
		return p;
	}

	
	public List<Persona> tutte() {
		List<Persona> elenco = new ArrayList<Persona>();
		try {
			Connection conn = getConnection();
			Statement comandoSQL = conn.createStatement();
			String sql = "select * from persona";
			ResultSet persone = comandoSQL.executeQuery(sql);
			while(persone.next()) {
				elenco.add(mappaPersona(persone));
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
			Connection conn = getConnection();
			Statement comandoSQL = conn.createStatement();
			String sql = "select * from persona where altezza_cm > " + altezzaMinima;
			ResultSet persone = comandoSQL.executeQuery(sql);
			while(persone.next()) {
				elenco.add(mappaPersona(persone));
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
