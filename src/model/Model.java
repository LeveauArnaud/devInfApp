package model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;






/**
 * <b>Model contenant la liste des scouts récupérée de la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
@SuppressWarnings("serial")

public class Model extends DefaultTableModel {
	

	/**
	 * Effectue le query et pour chaque scout trouvé dans la DB, l'ajoute dans l'arrayList
	 * 
	 * @return la l'arraylist avec les scouts
	 * 
	 */
	public static ArrayList<Scout> getScoutsList(){
		ArrayList<Scout> scoutsList = new ArrayList<Scout>();
		Connection connection = DbCon.getConnection();
		
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
	
	
	/**
	 * Utilise la liste des scouts, parcourt cette liste et pour chaque scout l'ajoute à l'objet DATA
	 * 
	 * @see Scout#scoutNomC
	 * 
	 * @return DATA, objet contenant les scouts, utilisé dans le tableau
	 * 
	 */
	public static  Object[][] showScouts() {
		
		ArrayList<Scout> scoutList = getScoutsList();
		
		Collections.sort(scoutList, Scout.scoutNomC);
		
		Object[][] data = new Object [scoutList.size()][] ;
		
		
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
			
			
			data[i] = row;
			
			
		}
		
		return data;
		
		
	}
	
	/**
	 * <b>Pour une rangée selectionnée, affiche les infos du scouts dans les différents champs</b>
	 * 
	 * @param table
	 * 		le tableau avec la liste des scouts
	 * @param textFieldId
	 * 		La section du scout
	 * @param textFieldSection
	 * 		La section du scout
	 * @param textFieldFonction
	 * 		La fonction du scout
	 * @param textFieldTotem
	 * 		Le totem du scout
	 * @param textFieldNom
	 * 		Le nom du scout
	 * @param textFieldPrenom
	 * 		Le prenom du scout
	 * @param textFieldDateNaissance
	 * 		La date de naissance du scout
	 * @param textFieldAdresse
	 * 		L'adresse du scout
	 * @param textFieldMail
	 * 		Le mail du scout
	 * @param textFieldCamp
	 * 		Le nbr de camp du scout
	 * @param textFieldCotisation
	 * 		La cotisation du scout
	 * 
	 */
	public static void showScoutFields(
			JTable table ,
			JTextField textFieldId,
			JTextField textFieldSection, 
			JTextField textFieldFonction,
			JTextField textFieldTotem,
			JTextField textFieldNom,
			JTextField textFieldPrenom,
			JTextField textFieldDateNaissance,
			JTextField textFieldAdresse,
			JTextField textFieldMail,
			JTextField textFieldCamp,
			JTextField textFieldCotisation) {
		
		int i = table.getSelectedRow();
		TableModel model = table.getModel();
		textFieldId.setText(model.getValueAt(i, 0).toString());
		textFieldSection.setText(model.getValueAt(i, 4).toString());
		textFieldFonction.setText(model.getValueAt(i, 5).toString());
		textFieldTotem.setText(model.getValueAt(i, 3).toString());
		textFieldNom.setText(model.getValueAt(i, 1).toString());
		textFieldPrenom.setText(model.getValueAt(i, 2).toString());
		textFieldDateNaissance.setText(model.getValueAt(i, 6).toString());
		textFieldAdresse.setText(model.getValueAt(i, 7).toString());
		textFieldMail.setText(model.getValueAt(i, 8).toString());
		textFieldCamp.setText(model.getValueAt(i, 9).toString());
		textFieldCotisation.setText(model.getValueAt(i, 10).toString());
		
	}
	
	
	/**
	 * Renvoie le tableau données + nom des colonnes
	 * 
	 */
    public Model() {
    	
        super(showScouts(), AppConstants.getTableHeader());
    }
    

    
 
}