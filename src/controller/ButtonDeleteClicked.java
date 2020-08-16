package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.DbAction;
/**
 * <b>Class permetant de Supprimer un scout dans la DB</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class ButtonDeleteClicked extends DbAction implements ActionListener{
	
	private JTextField textFieldId;
	
	/**
	 * <b>Permet de récupérer l'id du scout</b>
	 * 
	 * @param textFieldId
	 * 		L'id du scout à supprimer
	 */
	public ButtonDeleteClicked(
						JTextField textFieldId) 
	{
		
		super();
		this.textFieldId = textFieldId;
	}

	/**
	 * <b>Action effectuée lors du click sur le bouton delete</b>
	 * <p>Supprime le scout dans la DB</p>
	 * 
	 * @see DbAction#delete(JTextField)
	 */
	public void actionPerformed(ActionEvent e) {
		
		int input = JOptionPane.showConfirmDialog(null, "Êtes vous certain de vouloir supprimer le scout ?");
		
		if(input == 0){
		delete(textFieldId );
		}
	}

}
