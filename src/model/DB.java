package model;

import java.sql.DriverManager;
import java.sql.Connection;
import com.mysql.*;

public class DB {
	
	public static Connection getConnection() {
		
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/scoutApp?useUnicode=true\n" + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&\n" + "serverTimezone=UTC",
					"root",
					"root"
			);
			System.out.println("Connexion effective !");
			return con;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}
		
	}

}
