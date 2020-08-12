package controller;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import model.Constants;
import model.DB_Con;
import model.Model;
import view.MainView;
import view.ParamView;

public class ButtonParametreClicked implements ActionListener{
	
	private JTextField textField_serverN;
	private JTextField textField_user;
	private JTextField textField_password;
	private JFrame frame;
	
	public ButtonParametreClicked(
			JFrame frame,
		JTextField textField_serverN, 
		JTextField textField_user,
		JTextField textField_password)				 
	{				
		
		super();
		this.frame = frame;
        this.textField_serverN = textField_serverN;
        this.textField_user = textField_user;
        this.textField_password = textField_password;
	}

	
	public void actionPerformed(ActionEvent e) {
		
		Constants.serverN = textField_serverN.getText();
		Constants.user = textField_user.getText();
		Constants.password = textField_password.getText();
		
		
		
			if(DB_Con.getConnection()!=null) {
				JOptionPane.showMessageDialog(null,
                "Connexion effective !","Infos connexion",JOptionPane.INFORMATION_MESSAGE);
				DefaultTableModel model = (DefaultTableModel) MainView.table.getModel();
				model.setRowCount(0);
				
				MainView.table.setModel(new Model());
				frame.dispose();
			}
			
		
		
		
		
	}


	
}
