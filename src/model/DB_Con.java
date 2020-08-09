package model;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import view.View;


public class DB_Con {
	
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
	
	public static void executeSQLQuery(String query, String message) {
    	Connection connection = DB_Con.getConnection();
    	
    	Statement st;
		
		try {
			
			st = connection.createStatement();
			if(st.executeUpdate(query) == 1) {
				
				DefaultTableModel model = (DefaultTableModel) View.table.getModel();
				model.setRowCount(0);
				View.table.setModel(new Model());
				
				JOptionPane.showMessageDialog(null, "Data "+message+" succesfully");
			}else {
				JOptionPane.showMessageDialog(null, "Data not "+message);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
    	
    }

}
