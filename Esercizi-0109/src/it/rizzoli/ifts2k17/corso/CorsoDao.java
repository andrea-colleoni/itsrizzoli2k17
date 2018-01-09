package it.rizzoli.ifts2k17.corso;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CorsoDao {
	
	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/esercizio0109",
				"root", "");
	}

	public List<Corso> tuttiICorsi() throws SQLException, ClassNotFoundException{
		List<Corso> _return = new ArrayList<Corso>();
		String sql = "select * from corso";
		Connection conn = getConnection();
		Statement st = conn.createStatement();
		
		ResultSet corsi = st.executeQuery(sql);
		while(corsi.next()) {
			Corso c = mappaCorso(corsi);
			_return.add(c);
		}
		corsi.close();
		st.close();
		conn.close();
		return _return;
	}


	public Corso corsoPerChiave(int id) throws SQLException, ClassNotFoundException{
		Corso _return = null;
		String sql = "select * from corso where id_corso = ?";
		Connection conn = getConnection();
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		
		ResultSet corsi = st.executeQuery();
		if(corsi.next()) {
			_return = mappaCorso(corsi);
		}
		corsi.close();
		st.close();
		conn.close();
		return _return;
	}
	public void inserisciCorso(Corso c) throws SQLException, ClassNotFoundException{
		String sql = "INSERT INTO corso" + 
				"(titolo," + 
				" descrizione," + 
				" data_inizio," + 
				" posti_disponibili," + 
				" ore_complessive)" + 
				" VALUES" + 
				" (?,?,?,?,?)";
			Connection conn = getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			impostaCampi(c, st);
			
			st.executeUpdate();
			st.close();
			conn.close();	
	}
	
	public void aggiornaCorso(Corso c) throws SQLException, ClassNotFoundException{
		String sql = "UPDATE corso" + 
				" SET" + 
				" titolo = ?," + 
				" descrizione = ?," + 
				" data_inizio = ?," + 
				" posti_disponibili = ?," + 
				" ore_complessive = ?" + 
				" WHERE id_corso = ?";
		Connection conn = getConnection();
		PreparedStatement st = conn.prepareStatement(sql);
		impostaCampi(c, st);
		st.setInt(6, c.getIdCorso());
		
		st.executeUpdate();
		st.close();
		conn.close();	
	}
	public void eliminaCorso(Corso c) throws SQLException, ClassNotFoundException{
		String sql = "DELETE FROM corso" + 
				" WHERE id_corso = ?";
		Connection conn = getConnection();
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, c.getIdCorso());
		
		st.executeUpdate();
		st.close();
		conn.close();
	}
	
	private Corso mappaCorso(ResultSet corsi) throws SQLException {
		Corso c = new Corso();
		c.setIdCorso(corsi.getInt("id_corso"));
		c.setTitolo(corsi.getString("titolo"));
		c.setDescrizione(corsi.getString("descrizione"));
		c.setDataInizio(corsi.getTimestamp("data_inizio"));
		c.setPostiDisponibili(corsi.getInt("posti_disponibili"));
		c.setOreComplessive(corsi.getInt("ore_complessive"));
		return c;
	}
	
	private void impostaCampi(Corso c, PreparedStatement st) throws SQLException {
		st.setString(1, c.getTitolo());
		st.setString(2, c.getDescrizione());
		st.setDate(3, new Date(c.getDataInizio().getTime()));
		st.setInt(4, c.getPostiDisponibili());
		st.setInt(5, c.getOreComplessive());
	}	
}
