package model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;






/**
 * @author arnaud_leveau
 *
 */
@SuppressWarnings("serial")
public class Model extends DefaultTableModel {
	

	public static ArrayList<Scout> getScoutsList(){
		ArrayList<Scout> scoutsList = new ArrayList<Scout>();
		Connection connection = DB_Con.getConnection();
		
		String query = "SELECT * FROM `scouts` ";
		Statement st;
		ResultSet rs;
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			Scout scout;
			
			while(rs.next()) {
				scout = new Scout(
						rs.getInt("id"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("totem"),
						rs.getString("section"),
						rs.getString("fonction"),
						rs.getDate("dateNaissance"),
						rs.getString("adresse"),
						rs.getString("mail"),
						rs.getInt("camp"),
						rs.getInt("cotisation")
				);
				scoutsList.add(scout);
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return scoutsList;
	}
	
	
	public static  Object[][] show_Scouts() {
		
		ArrayList<Scout> scoutList = getScoutsList();
		
		Object[][] DATA = new Object [scoutList.size()][] ;
		
		
		for(int i = 0; i< scoutList.size(); i++) {
			
			Object[] row = new Object [11];
			
			row[0] = scoutList.get(i).getId();
			row[1] = scoutList.get(i).getNom();
			row[2] = scoutList.get(i).getPrenom();
			row[3] = scoutList.get(i).getTotem();
			row[4] = scoutList.get(i).getSection();
			row[5] = scoutList.get(i).getFonction();
			row[6] = scoutList.get(i).getDateNaissance();
			row[7] = scoutList.get(i).getAdresse();
			row[8] = scoutList.get(i).getMail();
			row[9] = scoutList.get(i).getCamp();
			row[10] = scoutList.get(i).getCotisation();
			
			
			DATA[i] = row;
			
			
		}
		
		return DATA;
		
		
	}
	
	
    public Model() {
    	
        super(show_Scouts(), Constants.TABLE_HEADER);
    }
    

    
 
}