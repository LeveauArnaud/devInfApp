package model;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import view.MainView;


/**
 * <b>Classe permmeant de faire le lien avec la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */

public class DB_Con {
	
	/**
	 * Effectue la connection avec la DB via le driver JBDC
	 *
	 */
	public static Connection getConnection() {
		
		
		 Connection con ;
		 
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(
					Constants.server,
					Constants.user,
					Constants.password
            );
			System.out.println("Connexion effective !");
			return con;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
                    "Erreur de connexion ! ==> "+e,
                    "Infos connexion", JOptionPane.ERROR_MESSAGE);
			return null;
			
		}
		
		
	}
	
	/**
	 * Execute les query et recharge la liste des scout aprés chaque query
	 * 
	 * @param query
	 * 			Le query a effectuer
	 * @param query
	 * 			Le message à afficher
	 */
	public static void executeSQLQuery(String query, String message) {
    	Connection connection = DB_Con.getConnection();
    	
    	Statement st;
		
		try {
			
			st = connection.createStatement();
			if(st.executeUpdate(query) == 1) {
				
				DefaultTableModel model = (DefaultTableModel) MainView.table.getModel();
				model.setRowCount(0);
				MainView.table.setModel(new Model());
				
				JOptionPane.showMessageDialog(null, "Les données ont bien été "+message);
			}else {
				JOptionPane.showMessageDialog(null, "Les données n'ont bien été "+message);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
    	
    }

}
