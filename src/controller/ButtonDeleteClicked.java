package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import model.DB_Action;
/**
 * <b>Class permetant de Supprimer un scout dans la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class ButtonDeleteClicked implements ActionListener{
	
	private JTextField textField_id;
	
	/**
	 * <b>Permet de récupérer l'id du scout</b>
	 * 
	 * @param textField_id
	 * 		L'id du scout à supprimer
	 */
	public ButtonDeleteClicked(
						JTextField textField_id) 
	{
		
		super();
		this.textField_id = textField_id;
	}

	/**
	 * <b>Action effectuée lors du click sur le bouton delete</b>
	 * <p>Supprime le scout dans la DB</p>
	 * 
	 * @see DB_Action#delete(JTextField)
	 */
	public void actionPerformed(ActionEvent e) {
		
		DB_Action.delete(textField_id );
	}

}
