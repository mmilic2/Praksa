package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArtiklService implements Service<Artikl>{

	@Override
	public List<Artikl> getAll() {
		String sql = "SELECT id, naziv, nabavnakolicina, trenutnostanje,"
				+ " nabavnacijena, prodajnacijena FROM artikl";
		List<Artikl> lista = new ArrayList<Artikl>();
		Artikl artikl = new Artikl();
		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			
	            while (rs.next()) {
	            	
	            	artikl.setId(rs.getInt("id"));
	            	artikl.setNaziv(rs.getString("naziv"));
	                artikl.setNabavnaKolicina(rs.getInt("nabavnakolicina"));
	                artikl.setTrenutnoStanje(rs.getInt("trenutnostanje"));
	                artikl.setNabavnaCijena(rs.getDouble("nabavnacijena"));
	                artikl.setProdajnaCijena(rs.getDouble("prodajnacijena"));
	                lista.add(artikl);
	            }
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
        
		Connect.closeConnection(conn);
		return lista;
	}

	@Override
	public void create(int role, Artikl artikl) {
		if(role == 1 || role == 2) {
			String sql = "INSERT INTO artikl(id, naziv, nabavnakolicina, trenutnostanje, "
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
				pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			Connect.closeConnection(conn);
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
		Connect.closeConnection(conn);
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
		Connect.closeConnection(conn);
	}

	@Override
	public void createTable() {
			String sql = "create table if not exists artikl(\n" + 
					"	id int,\n" + 
					"	naziv varchar(50),\n" + 
					"	nabavnakolicina int,\n" + 
					"	trenutnostanje int,\n" + 
					"	nabavnacijena decimal(18,2),\n" + 
					"	prodajnacijena decimal(18,2)\n" +  
					");";
			
			Connection conn = Connect.getConnection();
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate(sql);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}

	
}
