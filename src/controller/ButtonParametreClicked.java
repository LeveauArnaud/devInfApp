package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.AppConstants;
import model.DbCon;
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
	private JTextField textFieldServerN;
	/**
	 * User
	 */
	private JTextField textFieldUser;
	/**
	 * Password
	 */
	private JTextField textFieldPassword;
	/**
	 * La fentetre des paramètres
	 */
	private JFrame frame;
	
	/**
	 * <b>Permet de récupérer les données de la DB dans les différents champs</b>
	 * 
	 * @param frame
	 * 		La fentetre des paramètre
	 * @param textFieldServerN
	 * 		L'adresse du server
	 * @param textFieldUser
	 * 		Le User de la DB
	 * @param textFieldPassword
	 * 		Le Password du user
	 */
	public ButtonParametreClicked(
			JFrame frame,
		JTextField textFieldServerN, 
		JTextField textFieldUser,
		JTextField textFieldPassword)				 
	{				
		
		super();
		this.frame = frame;
        this.textFieldServerN = textFieldServerN;
        this.textFieldUser = textFieldUser;
        this.textFieldPassword = textFieldPassword;
	}

	/**
	 * <b>Action effectuée lors du click sur le bouton "Connexion"</b>
	 * <p>Ajoute le scout dans la DB</p>
	 * 
	 * @see DbCon#executeSQLQuery(String, String)
	 */
	public void actionPerformed(ActionEvent e) {
		
		AppConstants.setServerN(textFieldServerN.getText());
		AppConstants.setUser(textFieldUser.getText());
		AppConstants.setPassword(textFieldPassword.getText());
		
		
		
			if(DbCon.getConnection()!=null) {
				JOptionPane.showMessageDialog(null,
                "Connexion effective !","Infos connexion",JOptionPane.INFORMATION_MESSAGE);
				DefaultTableModel model = (DefaultTableModel) MainView.table.getModel();
				model.setRowCount(0);
				
				MainView.table.setModel(new Model());
				frame.dispose();
			}
			
		
		
		
		
	}


	
}
