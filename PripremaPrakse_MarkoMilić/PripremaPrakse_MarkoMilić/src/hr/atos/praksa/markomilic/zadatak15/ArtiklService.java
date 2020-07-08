package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ArtiklService implements Service<Artikl>{

	@Override
	public List<Artikl> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(int role, Artikl artikl) {
		if(role == 1 || role == 2) {
			String sql = "INSERT INTO artikl(naziv, nabavnakolicina, trenutnostanje, "
					+ "nabavnacijena, prodajnacijena) VALUES(?,?,?,?,?,?)";
			
			Connection conn = Connect.getConnection();
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, artikl.getId());
				pstmt.setString(2, artikl.getNaziv());
				pstmt.setInt(3, artikl.getNabavnaKolicina());
				pstmt.setInt(4, artikl.getTrenutnoStanje());
				pstmt.setDouble(5, artikl.getNabavnaCijena());
				pstmt.setDouble(6, artikl.getProdajnaCijena());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void update(int role, Artikl artikl) {
		String sql = "UPDATE artikl SET naziv = ? WHERE id = ?";
		
		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, artikl.getNaziv());
			pstmt.setInt(2, artikl.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int role, Artikl artikl) {
		
		String sql = "DELETE FROM artikl WHERE id=?";
		
		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, artikl.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	
	
}
