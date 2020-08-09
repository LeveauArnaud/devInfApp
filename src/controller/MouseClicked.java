package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public  class MouseClicked implements MouseListener {
	
	private DefaultTableModel model;
	
	public MouseClicked(DefaultTableModel model) {
		
		super();
        this.model = model;
	}


	
	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null,
                "clicked",
                null, JOptionPane.ERROR_MESSAGE);
		
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