package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ZaposlenikService implements Service<Zaposlenik> {

	@Override
	public List<Zaposlenik> getAll() {
		String sql = "SELECT id, ime, prezime, radnomjesto," + " oib FROM zaposlenik";
		List<Zaposlenik> lista = new ArrayList<Zaposlenik>();
		Zaposlenik zaposlenik = new Zaposlenik();
		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				zaposlenik.setId(rs.getInt("id"));
				zaposlenik.setIme(rs.getString("ime"));
				zaposlenik.setPrezime(rs.getString("prezime"));
				zaposlenik.setRadnoMjesto(rs.getString("radnomjesto"));
				zaposlenik.setOib(rs.getString("oib"));
				lista.add(zaposlenik);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void create(Zaposlenik zaposlenik) {
		String sql = "INSERT INTO zaposlenik(id, ime, prezime, radnomjesto, " + "oib) VALUES(?,?,?,?,?)";

		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, zaposlenik.getId());
			pstmt.setString(2, zaposlenik.getIme());
			pstmt.setString(3, zaposlenik.getPrezime());
			pstmt.setString(4, zaposlenik.getRadnoMjesto());
			pstmt.setString(5, zaposlenik.getOib());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void update(Zaposlenik zaposlenik) {
		String sql = "UPDATE zaposlenik SET ime = ? WHERE id = ?";

		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, zaposlenik.getIme());
			pstmt.setInt(2, zaposlenik.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {

		String sql = "DELETE FROM zaposlenik WHERE id=?";

		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
