package model;

import javax.swing.JTextField;

/**
 * <b>Class rassemblant les action sur la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class DB_Action {
	
	/**
	 * String contenant le query à executer
	 * 
	 * @see DB_Action#add(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 * @see DB_Action#update(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 * @see DB_Action#delete(JTextField)
	 */
	private static String query;
	
	/**
	 * <b>Permet d'ajouter un scout dans la DB</b>
	 * 
	 * @param textField_section
	 * 		La section du scout
	 * @param textField_fonction
	 * 		La fonction du scout
	 * @param textField_totem
	 * 		Le totem du scout
	 * @param textField_nom
	 * 		Le nom du scout
	 * @param textField_prenom
	 * 		Le prenom du scout
	 * @param textField_dateNaissance
	 * 		La date de naissance du scout
	 * @param textField_adresse
	 * 		L'adresse du scout
	 * @param textField_mail
	 * 		Le mail du scout
	 * @param textField_camp
	 * 		Le nbr de camp du scout
	 * @param textField_cotisation
	 * 		La cotisation du scout
	 * 
	 */
	public static void add(
			JTextField textField_section, 
			JTextField textField_fonction,
			JTextField textField_totem,
			JTextField textField_nom,
			JTextField textField_prenom,
			JTextField textField_dateNaissance,
			JTextField textField_adresse,
			JTextField textField_mail,
			JTextField textField_camp,
			JTextField textField_cotisation) {
		
		query = "INSERT INTO `scouts`(`totem`, `nom`, `prenom`, `dateNaissance`, `adresse`, `mail`, `section`, `fonction`, `camp`, `cotisation`) "
				+ "VALUES ('"+textField_totem.getText()+"','"+textField_nom.getText()+"','"+textField_prenom.getText()+"','"+textField_dateNaissance.getText()+"','"+textField_adresse.getText()+"','"+textField_mail.getText()+"','"+textField_section.getText()+"','"+textField_fonction.getText()+"','"+textField_camp.getText()+"','"+textField_cotisation.getText()+"')";
		
		DB_Con.executeSQLQuery(query, "Ajoutées");
	}
	
	/**
	 * <b>Permet de modifier les informations d' un scout dans la DB</b>
	 * 
	 * @param textField_id
	 * 		L'ID du scout
	 * @param textField_section
	 * 		La section du scout
	 * @param textField_fonction
	 * 		La fonction du scout
	 * @param textField_totem
	 * 		Le totem du scout
	 * @param textField_nom
	 * 		Le nom du scout
	 * @param textField_prenom
	 * 		Le prenom du scout
	 * @param textField_dateNaissance
	 * 		La date de naissance du scout
	 * @param textField_adresse
	 * 		L'adresse du scout
	 * @param textField_mail
	 * 		Le mail du scout
	 * @param textField_camp
	 * 		Le nbr de camp du scout
	 * @param textField_cotisation
	 * 		La cotisation du scout
	 * 
	 */
	public static void update(
			JTextField textField_id,
			JTextField textField_section, 
			JTextField textField_fonction,
			JTextField textField_totem,
			JTextField textField_nom,
			JTextField textField_prenom,
			JTextField textField_dateNaissance,
			JTextField textField_adresse,
			JTextField textField_mail,
			JTextField textField_camp,
			JTextField textField_cotisation) {
		
		query = "UPDATE `scouts` SET `totem`='"+textField_totem.getText()+"',`nom`='"+textField_nom.getText()+"',`prenom`='"+textField_prenom.getText()+"',`dateNaissance`='"+textField_dateNaissance.getText()+"',`adresse`='"+textField_adresse.getText()+"',`mail`='"+textField_mail.getText()+"',`section`='"+textField_section.getText()+"',`fonction`='"+textField_fonction.getText()+"',`camp`='"+textField_camp.getText()+"',`cotisation`='"+textField_cotisation.getText()+"' WHERE `id`='"+textField_id.getText()+"'";
		DB_Con.executeSQLQuery(query, "Mises à jour");
	}
	
	/**
	 * <b>Permet de supprimer un scout dans la DB</b>
	 * 
	 * @param textField_id
	 * 		L'ID du scout
	 * 
	 */
	public static void delete(JTextField textField_id ) {
		
		query = "DELETE FROM `scouts` WHERE `id`='"+textField_id.getText()+"'";
		DB_Con.executeSQLQuery(query, "Supprimées");
	}
	


	
}
