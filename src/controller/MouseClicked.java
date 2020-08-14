package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Model;


/**
 * <b>MouseClicked est la class permetant d'afficher les données d'un scout dans le formulaire"</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public  class MouseClicked implements MouseListener{
	
	/**
	 * Table avec la liste des scouts
	 */
	private JTable table;
	/**
	 * ID du scout
	 */
	private JTextField textFieldId;
	/**
	 * Section du scout
	 */
	private JTextField textFieldSection;
	/**
	 * Fonction du scout
	 */
	private JTextField textFieldFonction;
	/**
	 * Totem du scout
	 */
	private JTextField textFieldTotem;
	/**
	 * Nom du scout
	 */
	private JTextField textFieldNom;
	/**
	 * Prenom du scout
	 */
	private JTextField textFieldPrenom;
	/**
	 * Date de Naissance du scout
	 */
	private JTextField textFieldDateNaissance;
	/**
	 * Adresse du scout
	 */
	private JTextField textFieldAdresse;
	/**
	 * mail  du scout
	 */
	private JTextField textFieldMail;
	/**
	 * Nbr de camp du scout
	 */
	private JTextField textFieldCamp;
	/**
	 * Cotisation du scout
	 */
	private JTextField textFieldCotisation;
	
	/**
	 * <b>Permet de récupérer les données du scout dans la ligne de la table</b>
	 * 
	 * @param table
	 * 		La table avec la liste des scouts
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
	 */
	public MouseClicked(JTable table ,
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
		
		super();
        this.table = table;
        this.textFieldId = textFieldId;
        this.textFieldSection = textFieldSection;
        this.textFieldFonction = textFieldFonction;
        this.textFieldTotem = textFieldTotem;
        this.textFieldNom = textFieldNom;
        this.textFieldPrenom = textFieldPrenom;
        this.textFieldDateNaissance = textFieldDateNaissance;
        this.textFieldAdresse = textFieldAdresse;
        this.textFieldMail = textFieldMail;
        this.textFieldCamp = textFieldCamp;
        this.textFieldCotisation = textFieldCotisation;
	}


	/**
	 * <b>Action lors du click sur une ligne du tableau</b>
	 * <p>
	 *  Pour la ligne clickée, récuprère les infos du scout et les affiches dans le formulaire
	 *  pour par la suite pouvoir effectuer des opérations (add,delete,update)
	 * </p>
	 * 
	 */
	public void mouseClicked(MouseEvent e) {
		
		Model.showScoutFields(
				table ,
				textFieldId,
				textFieldSection, 
				textFieldFonction,
				textFieldTotem,
				textFieldNom,
				textFieldPrenom,
				textFieldDateNaissance,
				textFieldAdresse,
				textFieldMail,
				textFieldCamp,
				textFieldCotisation);
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}