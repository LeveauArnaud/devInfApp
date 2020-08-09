package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public  class ButtonClicked implements ActionListener{
	
	
	private JTextField textField_id;
	private JTextField textField_section;
	private JTextField textField_fonction;
	private JTextField textField_totem;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_dateNaissance;
	private JTextField textField_adresse;
	private JTextField textField_mail;
	private JTextField textField_camp;
	private JTextField textField_cotisation;
	
	public ButtonClicked(
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

	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null,
                "clicked button" ,
                null, JOptionPane.ERROR_MESSAGE);
		
	}

}