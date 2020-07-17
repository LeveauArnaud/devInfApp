package view;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
	
	// View uses Swing framework to display UI to user
	private JFrame frame;
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JTextField nomTextfield;
	private JTextField prenomTextfield;
	private JButton prenomSaveButton;
	private JButton nomSaveButton;
	private JButton bonjour;
	private JButton aurevoir;
 
 	public View(String title) {
 		
	  frame = new JFrame(title);
	  frame.getContentPane().setLayout(new BorderLayout());
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(500, 120);
	  frame.setLocationRelativeTo(null);
	  frame.setVisible(true);
	  
	  // Create UI elements
	  nomLabel = new JLabel("Nom :");
	  prenomLabel = new JLabel("Prenom :");
	  nomTextfield = new JTextField();
	  prenomTextfield = new JTextField();
	  nomSaveButton = new JButton("Sauvegarder le nom");
	  prenomSaveButton = new JButton("Sauvegarder le prenom");
	  bonjour = new JButton("Bonjour!");
	  aurevoir = new JButton("Au revoir!");
	  
	  // Add UI element to frame
	  GroupLayout layout = new GroupLayout(frame.getContentPane());
	  layout.setAutoCreateGaps(true);
	  layout.setAutoCreateContainerGaps(true);
	  layout.setHorizontalGroup(layout.createSequentialGroup()
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nomLabel)
	    .addComponent(prenomLabel))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nomTextfield)
	    .addComponent(prenomTextfield))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nomSaveButton)
	    .addComponent(prenomSaveButton))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(bonjour)
	    .addComponent(aurevoir)));
	  layout.setVerticalGroup(layout.createSequentialGroup()
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(nomLabel)
	    .addComponent(nomTextfield).addComponent(nomSaveButton).addComponent(bonjour))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(prenomLabel)
	    .addComponent(prenomTextfield).addComponent(prenomSaveButton).addComponent(aurevoir)));
	  layout.linkSize(SwingConstants.HORIZONTAL, nomSaveButton, prenomSaveButton);
	  layout.linkSize(SwingConstants.HORIZONTAL, bonjour, aurevoir);
	  frame.getContentPane().setLayout(layout);
	 }
 
 	public JFrame getFrame() {
	  return frame;
	 }
 
 	public void setFrame(JFrame frame) {
	  this.frame = frame;
	 }
 
 	public JLabel getNomLabel() {
	  return nomLabel;
	 }
 
 	public void setNomLabel(JLabel nomLabel) {
	  this.nomLabel = nomLabel;
	 }
 
 	public JLabel getPrenomLabel() {
	  return prenomLabel;
	 }
 
 	public void setPrenomLabel(JLabel prenomLabel) {
	  this.prenomLabel = prenomLabel;
	 }
 
 	public JTextField getNomTextfield() {
	  return nomTextfield;
	 }
 
 	public void setNomTextfield(JTextField nomTextfield) {
	  this.nomTextfield = nomTextfield;
	 }
 
 	public JTextField getPrenomTextfield() {
	  return prenomTextfield;
	 }
 
 	public void setPrenomTextfield(JTextField prenomTextfield) {
	  this.prenomTextfield = prenomTextfield;
	 }
 
 	public JButton getNomSaveButton() {
	  return nomSaveButton;
	 }
 
 	public void setNomSaveButton(JButton nomSaveButton) {
	  this.nomSaveButton = nomSaveButton;
	 }
 
 	public JButton getPrenomSaveButton() {
	  return prenomSaveButton;
	 }
 
 	public void setPrenomSaveButton(JButton prenomSaveButton) {
	  this.prenomSaveButton = prenomSaveButton;
	 }
 
 	public JButton getBonjour() {
	  return bonjour;
	 }
 
 	public void setBonjour(JButton bonjour) {
	  this.bonjour = bonjour;
	 }
 
 	public JButton getAurevoir() {
	  return aurevoir;
	 }
 
 	public void setAurevoir(JButton aurevoir) {
	  this.aurevoir = aurevoir;
	 }
 
}
