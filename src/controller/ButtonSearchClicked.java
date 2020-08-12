package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.Constants;
import model.Model;

 
/**
 * @author arnaud_leveau
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
     * @param searchTerm string
     *
     */
    public void chercher(String searchTerm) {
    	Object[][] newData = new Object[Model.show_Scouts().length][];
        int idx = 0;
        Object[][] scoutsList = Model.show_Scouts();
        for (Object[] o: scoutsList) {
            if ("*".equals(searchTerm.trim())) {
                newData[idx++] = o;
            } else {
                if(String.valueOf(o[1]).startsWith(searchTerm.toUpperCase().trim())){
                    newData[idx++] = o;
                }   
            }   
        }
        model.setDataVector(newData, Constants.TABLE_HEADER);
    }
    
    @Override
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
