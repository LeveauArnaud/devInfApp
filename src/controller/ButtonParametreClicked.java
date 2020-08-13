package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Constants;
import model.DB_Con;
import model.Model;
import view.MainView;

/**
 * <b>Class permetant de modifier les infos de connexion de la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class ButtonParametreClicked implements ActionListener{
	/**
	 * Adresse du server
	 */
	private JTextField textField_serverN;
	/**
	 * User
	 */
	private JTextField textField_user;
	/**
	 * Password
	 */
	private JTextField textField_password;
	/**
	 * La fentetre des paramètres
	 */
	private JFrame frame;
	
	/**
	 * <b>Permet de récupérer les données de la DB dans les différents champs</b>
	 * 
	 * @param frame
	 * 		La fentetre des paramètre
	 * @param textField_serverN
	 * 		L'adresse du server
	 * @param textField_user
	 * 		Le User de la DB
	 * @param textField_password
	 * 		Le Password du user
	 */
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

	/**
	 * <b>Action effectuée lors du click sur le bouton "Connexion"</b>
	 * <p>Ajoute le scout dans la DB</p>
	 * 
	 * @see DB_Con#executeSQLQuery(String, String)
	 */
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
