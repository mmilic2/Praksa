package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect{

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

    
	
}
