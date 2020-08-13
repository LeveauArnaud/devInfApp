package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;


/**
 * <b>MouseClicked est la class permetant d'afficher les données d'un scout dans le formulaire"</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public  class MouseClicked implements MouseListener{
	
	/**
	 * Table avec la liste des scouts
	 */
	private JTable table;
	/**
	 * ID du scout
	 */
	private JTextField textField_id;
	/**
	 * Section du scout
	 */
	private JTextField textField_section;
	/**
	 * Fonction du scout
	 */
	private JTextField textField_fonction;
	/**
	 * Totem du scout
	 */
	private JTextField textField_totem;
	/**
	 * Nom du scout
	 */
	private JTextField textField_nom;
	/**
	 * Prenom du scout
	 */
	private JTextField textField_prenom;
	/**
	 * Date de Naissance du scout
	 */
	private JTextField textField_dateNaissance;
	/**
	 * Adresse du scout
	 */
	private JTextField textField_adresse;
	/**
	 * mail  du scout
	 */
	private JTextField textField_mail;
	/**
	 * Nbr de camp du scout
	 */
	private JTextField textField_camp;
	/**
	 * Cotisation du scout
	 */
	private JTextField textField_cotisation;
	
	/**
	 * <b>Permet de récupérer les données du scout dans la ligne de la table</b>
	 * 
	 * @param table
	 * 		La table avec la liste des scouts
	 * @param textField_id
	 * 		L'ID du scout
	 * @param textField_section
	 * 		La section du scout
	 * @param textField_fonction
	 * 		La fonction du scout
	 * @param textField_totem
	 * 		Le totem du scout
	 * @param textField_nom
	 * 		Le nom du scout
	 * @param textField_prenom
	 * 		Le prenom du scout
	 * @param textField_dateNaissance
	 * 		La date de naissance du scout
	 * @param textField_adresse
	 * 		L'adresse du scout
	 * @param textField_mail
	 * 		Le mail du scout
	 * @param textField_camp
	 * 		Le nbr de camp du scout
	 * @param textField_cotisation
	 * 		La cotisation du scout
	 */
	public MouseClicked(JTable table ,
						JTextField textField_id,
						JTextField textField_section, 
						JTextField textField_fonction,
						JTextField textField_totem,
						JTextField textField_nom,
						JTextField textField_prenom,
						JTextField textField_dateNaissance,
						JTextField textField_adresse,
						JTextField textField_mail,
						JTextField textField_camp,
						JTextField textField_cotisation) {
		
		super();
        this.table = table;
        this.textField_id = textField_id;
        this.textField_section = textField_section;
        this.textField_fonction = textField_fonction;
        this.textField_totem = textField_totem;
        this.textField_nom = textField_nom;
        this.textField_prenom = textField_prenom;
        this.textField_dateNaissance = textField_dateNaissance;
        this.textField_adresse = textField_adresse;
        this.textField_mail = textField_mail;
        this.textField_camp = textField_camp;
        this.textField_cotisation = textField_cotisation;
	}


	/**
	 * <b>Action lors du click sur une ligne du tableau</b>
	 * <p>
	 *  Pour la ligne clickée, récuprère les infos du scout et les affiches dans le formulaire
	 *  pour par la suite pouvoir effectuer des opérations (add,delete,update)
	 * </p>
	 * 
	 */
	public void mouseClicked(MouseEvent e) {
		
		int i = table.getSelectedRow();
		TableModel model = table.getModel();
		textField_id.setText(model.getValueAt(i, 0).toString());
		textField_section.setText(model.getValueAt(i, 4).toString());
		textField_fonction.setText(model.getValueAt(i, 5).toString());
		textField_totem.setText(model.getValueAt(i, 3).toString());
		textField_nom.setText(model.getValueAt(i, 1).toString());
		textField_prenom.setText(model.getValueAt(i, 2).toString());
		textField_dateNaissance.setText(model.getValueAt(i, 6).toString());
		textField_adresse.setText(model.getValueAt(i, 7).toString());
		textField_mail.setText(model.getValueAt(i, 8).toString());
		textField_camp.setText(model.getValueAt(i, 9).toString());
		textField_cotisation.setText(model.getValueAt(i, 10).toString());
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