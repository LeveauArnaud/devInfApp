package model;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import view.MainView;


/**
 * <b>Classe permmeant de faire le lien avec la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */

public abstract class DbCon {
	
	/**
	 * Effectue la connection avec la DB via le driver JBDC
	 * 
	 * @return connexion avec la DB
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
	 * @param message
	 * 			Le message à afficher
	 */
	public static void executeSQLQuery(String query, String message) {
    	//on récupère la connexion
		Connection connection = DbCon.getConnection();
    	
    	Statement st = null;
		
		try {
			
			st = connection.createStatement();
			//On execute le la requête
			if(st.executeUpdate(query) == 1) {
				
			
				DefaultTableModel model = (DefaultTableModel) MainView.table.getModel();
				model.setRowCount(0);
				JTable table = MainView.table;
				table.setModel(new Model());
				table.getColumnModel().getColumn(0).setPreferredWidth(3);
		        table.getColumnModel().getColumn(3).setPreferredWidth(50);
		        table.getColumnModel().getColumn(4).setPreferredWidth(50);
		        table.getColumnModel().getColumn(5).setPreferredWidth(50);
		        table.getColumnModel().getColumn(6).setPreferredWidth(40);
		        table.getColumnModel().getColumn(8).setPreferredWidth(100);
		        table.getColumnModel().getColumn(9).setPreferredWidth(25);
		        table.getColumnModel().getColumn(10).setPreferredWidth(80);
		        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
		        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
		        table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
		        table.getColumnModel().getColumn(9).setCellRenderer(cellRenderer);
		        table.getColumnModel().getColumn(10).setCellRenderer(cellRenderer);
		        
		        
				
				
				JOptionPane.showMessageDialog(null, "Les données ont bien été "+message);
			}else {
				JOptionPane.showMessageDialog(null, "Les données n'ont bien été "+message);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				//on libière les ressources de la mémoire
				connection.close();
				st.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
    	
    }

}
