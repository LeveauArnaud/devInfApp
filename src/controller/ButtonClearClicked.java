package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import model.DbAction;

public class ButtonClearClicked implements ActionListener{

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
	private JFormattedTextField textFieldDateNaissance;
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
	 * <b>Permet de vider les données du scout dans les différents champs</b>
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
	 */
	public ButtonClearClicked(
		JTextField textFieldId, 
		JTextField textFieldSection, 
		JTextField textFieldFonction,
		JTextField textFieldTotem,
		JTextField textFieldNom,
		JTextField textFieldPrenom,
		JFormattedTextField textFieldDateNaissance,
		JTextField textFieldAdresse,
		JTextField textFieldMail,
		JTextField textFieldCamp,
		JTextField textFieldCotisation) 
	{
		
		super();
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
	 * <b>Action effectuée lors du click sur le bouton update</b>
	 * <p>Modifie les infos du scout dans la DB</p>
	 * 
	 * @see DbAction#update(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 */
	public void actionPerformed(ActionEvent e) {
		
		textFieldId.setText("");
		textFieldSection.setText("");
		textFieldFonction.setText("");
		textFieldTotem.setText("");
		textFieldNom.setText("");
		textFieldPrenom.setText("");
		textFieldDateNaissance.setValue(new Date());;
		textFieldAdresse.setText("");
		textFieldMail.setText("");
		textFieldCamp.setText("");
		textFieldCotisation.setText("");
		
	}
}
