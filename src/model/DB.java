package model;

import java.sql.*;

import javax.swing.JOptionPane;


public class DB {
	
	public static Connection getConnection() {
		
		
		 Connection con ;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/scoutApp?serverTimezone=UTC",
                    "root",
                    "root"
            );
			System.out.println("Connexion effective !");
			/**JOptionPane.showMessageDialog(null,
                    "Connexion effective !",
                    null, JOptionPane.ERROR_MESSAGE
                    );**/
			return con;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
                    "Erreur de connexion ! ==> "+ e,
                    null, JOptionPane.ERROR_MESSAGE);
			return null;
			
		}
		
		
	}

}
