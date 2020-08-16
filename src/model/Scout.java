package model;

import java.sql.Date;
import java.util.Comparator;

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
	
	
	public Scout(int iD, String nom, String prenom,  String totem, String section, String fonction, Date dateNaissance, String adresse, String mail, int camp, int cotisation) {
		this.id = iD;
		this.section = section;
		this.fonction = fonction;
		this.totem = totem;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.mail = mail;
		this.camp = camp;
		this.cotisation = cotisation;
		
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

	 /**
	  * Trie les scouts par ordre croissant sur le nom
	  */
    public static Comparator<Scout> scoutNomC = new Comparator<Scout>() {

    	public int compare(Scout s1, Scout s2) {
    		String scoutName1 = s1.getNom().toUpperCase();
    		String scoutName2 = s2.getNom().toUpperCase();

    		//ordre croissant
    		return scoutName1.compareTo(scoutName2);

	 
    	}
    };
}
