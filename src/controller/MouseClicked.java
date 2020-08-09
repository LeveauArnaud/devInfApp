package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public  class MouseClicked implements MouseListener{
	
	private DefaultTableModel model;
	private JTable table;
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
	
	public MouseClicked(JTable table ,
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
		
		super();
        this.table = table;
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


	
	public void mouseClicked(MouseEvent e) {
		/**JOptionPane.showMessageDialog(null,
                "clicked",
                null, JOptionPane.ERROR_MESSAGE);**/
		
		int i = table.getSelectedRow();
		TableModel model = table.getModel();
		textField_id.setText(model.getValueAt(i, 0).toString());
		textField_section.setText(model.getValueAt(i, 4).toString());
		textField_fonction.setText(model.getValueAt(i, 5).toString());
		textField_totem.setText(model.getValueAt(i, 3).toString());
		textField_nom.setText(model.getValueAt(i, 1).toString());
		textField_prenom.setText(model.getValueAt(i, 2).toString());
		textField_dateNaissance.setText(model.getValueAt(i, 6).toString());
		textField_adresse.setText(model.getValueAt(i, 7).toString());
		textField_mail.setText(model.getValueAt(i, 8).toString());
		textField_camp.setText(model.getValueAt(i, 9).toString());
		textField_cotisation.setText(model.getValueAt(i, 10).toString());
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