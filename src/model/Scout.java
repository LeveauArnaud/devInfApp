package model;

import java.sql.Date;
import java.util.Comparator;

/**
 * <b>Class représentant un scout</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class Scout {
	
	/**
	 * ID du scout
	 */
	private int id;
	/**
	 * section du scout
	 */
	private String section;
	/**
	 * fonction du scout
	 */
	private String fonction;
	/**
	 * totem du scout
	 */
	private String totem;
	/**
	 * nom du scout
	 */
	private String nom;
	/**
	 * prenom du scout
	 */
	private String prenom;
	/**
	 * dateNaissance du scout
	 */
	private  Date dateNaissance;
	/**
	 * adresse du scout
	 */
	private String adresse;
	/**
	 * mail du scout
	 */
	private String mail;
	/**
	 * camp du scout
	 */
	private int camp;
	/**
	 * cotisation du scout
	 */
	private int cotisation;
	
	/**
	 * <b>Permet de créer un scout</b>
	 * 
	 * @param iD
	 * 		L'ID du scout
	 * @param section
	 * 		La section du scout
	 * @param fonction
	 * 		La fonction du scout
	 * @param totem
	 * 		Le totem du scout
	 * @param nom
	 * 		Le nom du scout
	 * @param prenom
	 * 		Le prenom du scout
	 * @param dateNaissance
	 * 		La date de naissance du scout
	 * @param adresse
	 * 		L'adresse du scout
	 * @param mail
	 * 		Le mail du scout
	 * @param camp
	 * 		Le nbr de camp du scout
	 * @param cotisation
	 * 		La cotisation du scout
	 */
	public Scout(
			int iD, 
			String nom, 
			String prenom,  
			String totem, 
			String section, 
			String fonction, 
			Date dateNaissance, 
			String adresse, 
			String mail, 
			int camp, 
			int cotisation) 
	{
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
	
	
	/**
	 * Permet de récupérer l'id du scout
	 * 
	 * @return l'id 
	 */
	public int getId() {
		return id;
	}
	/**
	 * Permet de récupérer la section du scout
	 * 
	 * @return la section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * Permet de modifier la section du scout
	 * 
	 * @param section la section
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * Permet de récupérer la fonction du scout
	 * 
	 * @return la fonction
	 */
	public String getFonction() {
		return fonction;
	}
	/**
	 * Permet de modifier la fonction du scout
	 * 
	 * @param fonction la fonction
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	/**
	 * Permet de récupérer le totem du scout
	 * 
	 * @return le totem 
	 */
	public String getTotem() {
		return totem;
	}
	/**
	 * Permet de modifier le totem du scout
	 * 
	 * @param totem le totem 
	 */
	public void setTotem(String totem) {
		this.totem = totem;
	}
	/**
	 * Permet de récupérer le nom du scout
	 * 
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Permet de modifier le nom du scout
	 * 
	 * @param nom le nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Permet de récupérer le prenom du scout
	 * 
	 * @return le prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * Permet de modifier le prenom du scout
	 * 
	 * @param prenom le prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Permet de récupérer la date de naissance du scout
	 * 
	 * @return la date de naissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Permet de modifier la date de naissance du scout
	 * 
	 * @param dateNaissance la date de naissance
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * Permet de récupérer l'adresse du scout
	 * 
	 * @return l'adresse 
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * Permet de modifier l'adresse du scout
	 * 
	 * @param adresse l'adresse 
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * Permet de récupérer le mail du scout
	 * 
	 * @return le mail 
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * Permet de modifier le mail du scout
	 * 
	 * @param mail le mail 
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * Permet de récupérer le nbr de camp du scout
	 * 
	 * @return le nbr de camp
	 */
	public int getCamp() {
		return camp;
	}
	/**
	 * Permet de modifier le nbr de camp du scout
	 * 
	 * @param camp le nbr de camp
	 */
	public void setCamp(int camp) {
		this.camp = camp;
	}
	/**
	 * Permet de récupérer la cotisation du scout (1 ou 0 )
	 * 
	 * @return la cotisation du scout (1 ou 0 )
	 */
	public int getCotisation() {
		return cotisation;
	}
	/**
	 * Permet de modifier la cotisation du scout (1 ou 0 )
	 * 
	 * @param cotisation la cotisation du scout (1 ou 0 ) 
	 */
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
