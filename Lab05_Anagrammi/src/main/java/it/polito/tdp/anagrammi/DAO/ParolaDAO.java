package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class ParolaDAO {
	
	public boolean getParolaTrovata(String parolaPassata) {

		final String sql = "SELECT nome FROM parola WHERE nome = ?";
		boolean trovato = false;

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, parolaPassata);
			ResultSet rs = st.executeQuery();

			if(rs.next()) {
				conn.close();
				rs.close();
				st.close();
				trovato=true;
			}
			else {
				conn.close();
				rs.close();
				st.close();
				trovato=false;
			}
			
			return trovato;
			
		} catch (SQLException e) {
			throw new RuntimeException("Errore DB", e);
		}
	}
}
