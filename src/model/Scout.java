package model;

import java.sql.Date;

public class Scout {
	
	private int id;
	private String section;
	private String fonction;
	private String totem;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String adresse;
	private String mail;
	private int camp;
	private int cotisation;
	
	
	public Scout(int ID, String Section, String Fonction, String Totem, String Nom, String Prenom, Date DateNaissance, String Adresse, String Mail, int Camp, int Cotisation) {
		this.id = ID;
		this.section = Section;
		this.fonction = Fonction;
		this.totem = Totem;
		this.nom = Nom;
		this.prenom = Prenom;
		this.dateNaissance = DateNaissance;
		this.adresse = Adresse;
		this.mail = Mail;
		this.camp = Camp;
		this.cotisation = Cotisation;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getTotem() {
		return totem;
	}
	public void setTotem(String totem) {
		this.totem = totem;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getCamp() {
		return camp;
	}
	public void setCamp(int camp) {
		this.camp = camp;
	}
	public int getCotisation() {
		return cotisation;
	}
	public void setCotisation(int cotisation) {
		this.cotisation = cotisation;
	}

}
