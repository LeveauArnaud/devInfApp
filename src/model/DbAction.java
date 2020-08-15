package model;

import javax.swing.JTextField;

/**
 * <b>Class rassemblant les action sur la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public abstract class DbAction {
	
	/**
	 * String contenant le query à executer
	 * 
	 * @see DbAction#add(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 * @see DbAction#update(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 * @see DbAction#delete(JTextField)
	 */
	private static String query;
	
	/**
	 * <b>Permet d'ajouter un scout dans la DB</b>
	 * 
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
	public static void add(
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
		
		query = "INSERT INTO `scouts`(`totem`, `nom`, `prenom`, `dateNaissance`, `adresse`, `mail`, `section`, `fonction`, `camp`, `cotisation`) "
				+ "VALUES ('"+textFieldTotem.getText()+"','"+textFieldNom.getText()+"','"+textFieldPrenom.getText()+"','"+textFieldDateNaissance.getText()+"','"+textFieldAdresse.getText()+"','"+textFieldMail.getText()+"','"+textFieldSection.getText()+"','"+textFieldFonction.getText()+"','"+textFieldCamp.getText()+"','"+textFieldCotisation.getText()+"')";
		
		DbCon.executeSQLQuery(query, "Ajoutées");
	}
	
	/**
	 * <b>Permet de modifier les informations d' un scout dans la DB</b>
	 * 
	 * @param textFieldId
	 * 		L'ID du scout
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
	public static void update(
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
		
		query = "UPDATE `scouts` SET `totem`='"+textFieldTotem.getText()+"',`nom`='"+textFieldNom.getText()+"',`prenom`='"+textFieldPrenom.getText()+"',`dateNaissance`='"+textFieldDateNaissance.getText()+"',`adresse`='"+textFieldAdresse.getText()+"',`mail`='"+textFieldMail.getText()+"',`section`='"+textFieldSection.getText()+"',`fonction`='"+textFieldFonction.getText()+"',`camp`='"+textFieldCamp.getText()+"',`cotisation`='"+textFieldCotisation.getText()+"' WHERE `id`='"+textFieldId.getText()+"'";
		DbCon.executeSQLQuery(query, "Mises à jour");
	}
	
	
	/**
	 * <b>Permet de supprimer un scout dans la DB</b>
	 * 
	 * @param textFieldId
	 * 		L'ID du scout
	 * 
	 */
	public static void delete(
			JTextField textFieldId) {
		
		query = "DELETE FROM `scouts` WHERE `id`='"+textFieldId.getText()+"'";
		DbCon.executeSQLQuery(query, "Supprimées");
	}
	


	
}
