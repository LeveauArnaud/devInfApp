package controller;

import javax.swing.JOptionPane;
import model.Model;
import view.View;

public class Controller {
	 private Model model;
	 private View view;
	 public Controller(Model m, View v) {
	  model = m;
	  view = v;
	  initView();
	 }
	 
	 public void initView() {
	  view.getNomTextfield().setText(model.getNom());
	  view.getPrenomTextfield().setText(model.getPrenom());
	 }
	 
	 public void initController() {
	  view.getNomSaveButton().addActionListener(e -> saveNom());
	  view.getPrenomSaveButton().addActionListener(e -> savePrenom());
	  view.getBonjour().addActionListener(e -> sayBonjour());
	  view.getAurevoir().addActionListener(e -> sayAurevoir());
	 }
	 
	 private void saveNom() {
	  model.setNom(view.getNomTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Nom sauvegardé : " + model.getNom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void savePrenom() {
	  model.setPrenom(view.getPrenomTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Prénom sauvegardé : " + model.getPrenom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void sayBonjour() {
	  JOptionPane.showMessageDialog(null, "Bonjour " + model.getNom() + " " + model.getPrenom(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void sayAurevoir() {
	  System.exit(0);
	 }
}