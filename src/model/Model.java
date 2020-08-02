package model;

import javax.swing.table.DefaultTableModel;

/**
 * @author arnaud_leveau
 *
 */
@SuppressWarnings("serial")
public class Model extends DefaultTableModel {
 
    public Model() {
        super(Constants.DATA, Constants.TABLE_HEADER);
    }
 
}