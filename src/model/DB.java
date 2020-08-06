package model;

import java.sql.DriverManager;
import java.sql.Connection;

public class DB {
	
	public static Connection getConnection() {
		
		Connection con;
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/scoutApp","root","");
			System.out.println("Connexion effective !");
			return con;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}
		
	}

}
