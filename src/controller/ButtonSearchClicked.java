package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.AppConstants;
import model.Model;

 
/**
 * <b>Rechercher un/plusieurs scouts en fonction de leur nom lors du click sur le bouton cherhcerScout</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */

public class ButtonSearchClicked implements ActionListener {
     
    private JTextField searchTermTextField = new JTextField(26);
    private DefaultTableModel model;
 
    public ButtonSearchClicked(JTextField searchTermTextField, DefaultTableModel model) {
        super();
        this.searchTermTextField = searchTermTextField;
        this.model = model;
    }
 
    
    /**
     * Recherche les scouts dont le nom commence par le searchTerme
     * 
     * @param searchTerm string
     *
     * @see ButtonSearchClicked#actionPerformed
     * 
     */
    public void chercher(String searchTerm) {
    	Object[][] newData = new Object[Model.showScouts().length][];
        int idx = 0;
        Object[][] scoutsList = Model.showScouts();
        for (Object[] o: scoutsList) {
            if ("*".equals(searchTerm.trim())) {
                newData[idx++] = o;
            } else {
                if(String.valueOf(o[1]).startsWith(searchTerm.toUpperCase().trim())){
                    newData[idx++] = o;
                }   
            }   
        }
        model.setDataVector(newData, AppConstants.TABLE_HEADER);
        
    }
    
    
    /**
    * <b>Appelé lors du click sur le boutton rechercherScout</b>
    * <p>
    * Si le chaamp searchTerm est vide affiche message d'erreur sinon effectue "chercher"
    * </p>
    *
    * @see ButtonSearchClicked#chercher
    */
    public void actionPerformed(ActionEvent e) {
 
        String searchTerm = searchTermTextField.getText();
        if (searchTerm != null && !"".equals(searchTerm)) {
            
            chercher(searchTerm);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Barre de recherche vide !", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
         
            chercher(" ");
        }
    }
    
    
 
}
