package hr.atos.praksa.markomilic.zadatak15;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestZaposlenikService {

	
	
	@Test
	public void createZaposlenik() {
		
		
		try(Connection conn = Connect.getConnection()) {
			try(Statement stCheck = conn.createStatement()) {
				
				conn.setAutoCommit(false);
				
				stCheck.executeUpdate("DELETE FROM zaposlenik");
				
				ZaposlenikService zs = new ZaposlenikService();
				int id = 6;
				String ime = "Marko";
				String prezime = "Milić";
				String radnomjesto = "Osijek";
				String oib = "12345";
				
				Zaposlenik zaposlenik = new Zaposlenik(id, ime, prezime, radnomjesto, oib);
				zs.create(zaposlenik,conn);
				assertEquals(id, zaposlenik.getId());
				assertEquals(ime, zaposlenik.getIme());
				assertEquals(prezime, zaposlenik.getPrezime());
				assertEquals(radnomjesto, zaposlenik.getRadnoMjesto());
				assertEquals(oib, zaposlenik.getOib());
				
				try(ResultSet rs = stCheck.executeQuery("SELECT * FROM zaposlenik")) {
					
					assertTrue(rs.next());
					assertEquals(id, rs.getInt("id"));
					assertEquals(ime, rs.getString("ime"));
					assertEquals(prezime, rs.getString("prezime"));
					assertEquals(radnomjesto, rs.getString("radnomjesto"));
					assertEquals(oib, rs.getString("oib"));
					assertFalse(rs.next());
						
						
				} 
				
			} finally {
				conn.rollback();
			}
		} catch (SQLException e) {
			fail(e.toString());
		}
		
	}
	
	
	
}
