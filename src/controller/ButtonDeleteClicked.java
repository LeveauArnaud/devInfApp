package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.DB_Con;

public class ButtonDeleteClicked implements ActionListener{
	
	private JTextField textField_id;
	
	public ButtonDeleteClicked(
						JTextField textField_id) 
	{
		
		super();
		this.textField_id = textField_id;
	}

	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null,
                "clicked button" ,
                null, JOptionPane.ERROR_MESSAGE);
		
		String query = "DELETE FROM `scouts` WHERE `id`='"+textField_id.getText()+"'";
		DB_Con.executeSQLQuery(query, "Deleted");
	}

}
