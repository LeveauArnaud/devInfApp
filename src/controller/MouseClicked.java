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
	
	public MouseClicked(JTable table , JTextField textField_section) {
		
		super();
        this.table = table;
        this.textField_section = textField_section;
	}


	
	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null,
                "clicked",
                null, JOptionPane.ERROR_MESSAGE);
		
		int i = table.getSelectedRow();
		TableModel model = table.getModel();
		textField_section.setText(model.getValueAt(i, 3).toString());
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