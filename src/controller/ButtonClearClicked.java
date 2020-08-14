package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import model.DB_Action;

public class ButtonClearClicked implements ActionListener{

	/**
	 * ID du scout
	 */
	private JTextField textField_id;
	/**
	 * Section du scout
	 */
	private JTextField textField_section;
	/**
	 * Fonction du scout
	 */
	private JTextField textField_fonction;
	/**
	 * Totem du scout
	 */
	private JTextField textField_totem;
	/**
	 * Nom du scout
	 */
	private JTextField textField_nom;
	/**
	 * Prenom du scout
	 */
	private JTextField textField_prenom;
	/**
	 * Date de Naissance du scout
	 */
	private JFormattedTextField textField_dateNaissance;
	/**
	 * Adresse du scout
	 */
	private JTextField textField_adresse;
	/**
	 * mail  du scout
	 */
	private JTextField textField_mail;
	/**
	 * Nbr de camp du scout
	 */
	private JTextField textField_camp;
	/**
	 * Cotisation du scout
	 */
	private JTextField textField_cotisation;
	
	

	/**
	 * <b>Permet de vider les données du scout dans les différents champs</b>
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
	 */
	public ButtonClearClicked(
		JTextField textField_id, 
		JTextField textField_section, 
		JTextField textField_fonction,
		JTextField textField_totem,
		JTextField textField_nom,
		JTextField textField_prenom,
		JFormattedTextField textField_dateNaissance,
		JTextField textField_adresse,
		JTextField textField_mail,
		JTextField textField_camp,
		JTextField textField_cotisation) 
	{
		
		super();
		this.textField_id = textField_id;
        this.textField_section = textField_section;
        this.textField_fonction = textField_fonction;
        this.textField_totem = textField_totem;
        this.textField_nom = textField_nom;
        this.textField_prenom = textField_prenom;
        this.textField_dateNaissance = textField_dateNaissance;
        this.textField_adresse = textField_adresse;
        this.textField_mail = textField_mail;
        this.textField_camp = textField_camp;
        this.textField_cotisation = textField_cotisation;
	}

	/**
	 * <b>Action effectuée lors du click sur le bouton update</b>
	 * <p>Modifie les infos du scout dans la DB</p>
	 * 
	 * @see DB_Action#update(JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField, JTextField)
	 */
	public void actionPerformed(ActionEvent e) {
		
		textField_id.setText("");
		textField_section.setText("");
		textField_fonction.setText("");
		textField_totem.setText("");
		textField_nom.setText("");
		textField_prenom.setText("");
		textField_dateNaissance.setValue(new Date());;
		textField_adresse.setText("");
		textField_mail.setText("");
		textField_camp.setText("");
		textField_cotisation.setText("");
		
	}
}
