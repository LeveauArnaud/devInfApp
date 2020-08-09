package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public  class MouseClicked implements MouseListener {
	
	private DefaultTableModel model;
	private JTable table;
	
	public MouseClicked(JTable table ,DefaultTableModel model) {
		
		super();
        this.model = model;
        this.table = table;
	}


	
	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null,
                "clicked",
                null, JOptionPane.ERROR_MESSAGE);
		
		int i = table.getSelectedRow();
		TableModel model = table.getModel();
		
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