package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Search implements KeyListener{
	
	private JTextField textFieldChercherUnScout;
	private JTable table;
	private DefaultTableModel model;
	
	public Search(
			JTextField textFieldChercherUnScout,
			JTable table,
			DefaultTableModel model
			) {
		super();
        this.textFieldChercherUnScout = textFieldChercherUnScout;
        this.table = table;
        this.model = model;
	}
	
	public void keyReleased(KeyEvent e) {
		
		String query = textFieldChercherUnScout.getText();
		
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
		table.setRowSorter(tr);
		
		tr.setRowFilter(RowFilter.regexFilter(query));
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
