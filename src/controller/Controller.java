package controller;

import javax.swing.JOptionPane;
import model.Model;
import view.MainView;
import view.View;

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
	  mainView.getNomTextfield().setText(model.getNom());
	  mainView.getPrenomTextfield().setText(model.getPrenom());
	 }
	 
	 public void initController() {
	  mainView.getNomSaveButton().addActionListener(e -> saveNom());
	  mainView.getPrenomSaveButton().addActionListener(e -> savePrenom());
	  mainView.getBonjour().addActionListener(e -> sayBonjour());
	  mainView.getAurevoir().addActionListener(e -> sayAurevoir());
	 }
	 
	 private void saveNom() {
	  model.setNom(mainView.getNomTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Nom sauvegardé : " + model.getNom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void savePrenom() {
	  model.setPrenom(mainView.getPrenomTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Prénom sauvegardé : " + model.getPrenom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void sayBonjour() {
	  JOptionPane.showMessageDialog(null, "Bonjour " + model.getNom() + " " + model.getPrenom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void sayAurevoir() {
	  System.exit(0);
	 }
}