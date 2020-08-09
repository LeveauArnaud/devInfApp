package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.Constants;

 
/**
 * @author arnaud_leveau
 *
 */

public class Controller implements ActionListener {
     
    private JTextField searchTermTextField = new JTextField(26);
    private DefaultTableModel model;
	private JTable table;
 
    public Controller(JTextField searchTermTextField, DefaultTableModel model) {
        super();
        this.searchTermTextField = searchTermTextField;
        this.model = model;
    }
 
    
    /**
     * @param searchTerm string
     *
     */
    public void chercher(String searchTerm) {
    	Object[][] newData = new Object[Constants.DATA.length][];
        int idx = 0;
        for (Object[] o: Constants.DATA) {
            if ("*".equals(searchTerm.trim())) {
                newData[idx++] = o;
            } else {
                if(String.valueOf(o[0]).startsWith(searchTerm.toUpperCase().trim())){
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
