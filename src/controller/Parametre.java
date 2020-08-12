package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import view.MainView;

public class Parametre implements ActionListener{
	
	private JTextField textField_server;
	private JTextField textField_user;
	private JTextField textField_password;
	
	public Parametre(
		JTextField textField_server, 
		JTextField textField_user,
		JTextField textField_password)				 
	{				
		
		super();
        this.textField_server = textField_server;
        this.textField_user = textField_user;
        this.textField_password = textField_password;
	}

	public static void createAndShowGUI() throws Exception {
	    new MainView();
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		
	}


	
}
