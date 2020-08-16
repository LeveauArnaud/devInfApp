package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

import model.DbAction;
import model.DbCon;
import model.Model;
import model.Scout;

class TestCrud extends DbAction {
	
	@SuppressWarnings("null")
	@Test
	public void testCrud()  throws SQLException {
		
		/**
		 * Section du scout
		 */
		JTextField textFieldSection = new JTextField("Pionniers");
		/**
		 * Fonction du scout
		 */
		JTextField textFieldFonction = new JTextField("Animateurs");
		/**
		 * Totem du scout
		 */
		JTextField textFieldTotem = new JTextField("Jaguarundi");
		/**
		 * Nom du scout
		 */
		JTextField textFieldNom = new JTextField("Leveau");
		/**
		 * Prenom du scout
		 */
		JTextField textFieldPrenom = new JTextField("Arnaud");
		/**
		 * Date de Naissance du scout
		 */
		JTextField textFieldDateNaissance = new JTextField("1998-03-19");
		/**
		 * Adresse du scout
		 */
		JTextField textFieldAdresse = new JTextField("Rue de l église 22");
		/**
		 * mail  du scout
		 */
		JTextField textFieldMail = new JTextField("a.leveau@students.ephec.be");
		/**
		 * Nbr de camp du scout
		 */
		JTextField textFieldCamp = new JTextField("5");
		/**
		 * Cotisation du scout
		 */
		JTextField textFieldCotisation = new JTextField("1");
		
		ArrayList<Scout> scoutsList = Model.getScoutsList();
		
        
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
		
		
		Scout lastScout = scoutsList.get(scoutsList.size()-1);
		
		assertEquals(textFieldSection, lastScout.getSection());
		
		/**
		 * Id du scout
		 */
		JTextField textFieldId = new JTextField(lastScout.getId());
		textFieldCotisation.setText("0");
		
		update(
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
		
		assertEquals(textFieldCotisation, lastScout.getCotisation());
		
		delete(
				textFieldId);
		
		assertNull(textFieldId);
		
	}

}
