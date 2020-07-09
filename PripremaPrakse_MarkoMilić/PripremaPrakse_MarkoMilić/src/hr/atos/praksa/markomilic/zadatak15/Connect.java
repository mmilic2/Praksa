package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:C://sqlite/db/test.db";
			conn = DriverManager.getConnection(url);
			System.out.println("Connection has been established");
		} catch (SQLException e) {
			System.out.println("message " + e.getMessage());
		}
		return conn;
	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void createTable(int number) {
		String sql = null;
		if (number == 1) {
			sql = "create table if not exists artikl(\n" + "	id int,\n" + "	naziv varchar(50),\n"
					+ "	nabavnakolicina int,\n" + "	trenutnostanje int,\n" + "	nabavnacijena decimal(18,2),\n"
					+ "	prodajnacijena decimal(18,2)\n" + ");";
		} else {
			sql = "create table if not exists zaposlenik(\n" + "	id int,\n" + "	ime varchar(50),\n"
					+ "	prezime varchar(50),\n" + "	radnomjesto varchar(50),\n" + "	oib char(5)\n" + ");";

		}

		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
