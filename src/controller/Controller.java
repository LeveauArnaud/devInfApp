package controller;

import javax.swing.JOptionPane;
import model.Model;
import view.MainView;

/**
*
* @author Arnaud Leveau
*/

public class Controller {
	 private Model model;
	 private MainView mainView;
	 public Controller(Model m, MainView v) {
	  model = m;
	  mainView = v;
	  initView();
	 }
	 
	 public void initView() {
	 }
	 
	 public void initController() {
	 }
	 
	 private void saveNom() {
	  JOptionPane.showMessageDialog(null, "Nom sauvegardé : " + model.getNom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void savePrenom() {
	  JOptionPane.showMessageDialog(null, "Prénom sauvegardé : " + model.getPrenom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void sayBonjour() {
	  JOptionPane.showMessageDialog(null, "Bonjour " + model.getNom() + " " + model.getPrenom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void sayAurevoir() {
	  System.exit(0);
	 }
}