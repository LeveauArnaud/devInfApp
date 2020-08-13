package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import view.ParamView;
/**
 * <b>MenuItemParamClicked est la class permetant de créer une nouvelle fenetre "Paramètre"</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class MenuItemParamClicked implements ActionListener{
	
	public MenuItemParamClicked()				 
		{					
			super();
		}
	
	/**
	 * <b>Action effectuée lors du click sur l'onglet "modifier paramètres"</b>
	 * 
	 * @see ParamView
	 */
	public void actionPerformed(ActionEvent e) {
		try {
			new ParamView();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
