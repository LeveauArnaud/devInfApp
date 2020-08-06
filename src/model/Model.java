package model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;






/**
 * @author arnaud_leveau
 *
 */
@SuppressWarnings("serial")
public class Model extends DefaultTableModel {
	

	public static ArrayList<Scout> getScoutsList(){
		ArrayList<Scout> scoutsList = new ArrayList<Scout>();
		Connection connection = DB.getConnection();
		
		String query = "SELECT * FROM `scouts` ";
		Statement st;
		ResultSet rs;
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			Scout scout;
			while(rs.next()) {
				scout = new Scout(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getString("totem"),rs.getString("section"),rs.getString("fonction"),rs.getDate("dateNaissance"),rs.getString("adresse"),rs.getString("mail"),rs.getInt("camp"),rs.getInt("cotisation"));
				scoutsList.add(scout);
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return scoutsList;
	}
	
	
	public static  Object[][] show_Scouts() {
		
		ArrayList<Scout> list = getScoutsList();
		
		Object[][] DATA = {}  ;
		
		Object[] row = new Object[11];
		for(int i = 0; i< list.size(); i++) {
			
			row[0] = list.get(i).getNom();
			row[1] = list.get(i).getPrenom();
			row[2] = list.get(i).getTotem();
			row[3] = list.get(i).getSection();
			row[4] = list.get(i).getFonction();
			row[5] = list.get(i).getDateNaissance();
			row[6] = list.get(i).getAdresse();
			row[7] = list.get(i).getMail();
			row[8] = list.get(i).getCamp();
			row[9] = list.get(i).getCotisation();
			
			DATA[DATA.length+1] = row;
			
			
		}
		
		return DATA;
		
		
	}
	
	
    public Model() {
    	
    	
        super(show_Scouts(), Constants.TABLE_HEADER);
    }
 
}