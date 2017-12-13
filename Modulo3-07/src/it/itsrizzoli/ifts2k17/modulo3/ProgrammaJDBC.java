package it.itsrizzoli.ifts2k17.modulo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgrammaJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			// 1. jdbc connection string (jdbc URL)
			// 2. username
			// 3. password
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:mariadb://localhost:3306/corso", 
							"root", 
							"");
			// comando SQL mi serve per mandare query al DB
			Statement comandoSQL = conn.createStatement();
			String sql = "select * from persona";
			// eseguo la query e ottengo un ResultSet (tabella di persone)
			ResultSet persone = comandoSQL.executeQuery(sql);
			// finché ci sono record (next() => true)
			while(persone.next()) {
				System.out.println(
						persone.getString("nome"));
			}
			persone.close();
			comandoSQL.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
