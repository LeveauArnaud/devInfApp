package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import model.DbAction;


/**
 * <b>Class permetant d'Ajouter un nouveau scout dans la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public  class ButtonAddClicked extends DbAction implements ActionListener {
	
	
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
	 * <b>Permet de récupérer les données du scout dans les différents champs</b>
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
	 */
	public ButtonAddClicked(
		JTextField textFieldSection, 
		JTextField textFieldFonction,
		JTextField textFieldTotem,
		JTextField textFieldNom,
		JTextField textFieldPrenom,
		JTextField textFieldDateNaissance,
		JTextField textFieldAdresse,
		JTextField textFieldMail,
		JTextField textFieldCamp,
		JTextField textFieldCotisation)				 
	{				
		
		super();
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
	 * <b>Action effectuée lors du click sur le bouton add</b>
	 * <p>Ajoute le scout dans la DB</p>
	 * 
	 * @see DbAction#add(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 */
	public void actionPerformed(ActionEvent e) {
		
		add(
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

}