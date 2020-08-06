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
	

	public ArrayList<Scout> scoutsList(){
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
	
	
    public Model() {
        super(Constants.DATA, Constants.TABLE_HEADER);
    }
 
}