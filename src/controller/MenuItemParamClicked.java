package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import view.ParamView;

public class MenuItemParamClicked implements ActionListener{
	
	public MenuItemParamClicked()				 
		{					
			super();
		}
	
	public void actionPerformed(ActionEvent e) {
		try {
			ParamView pv = new ParamView();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
