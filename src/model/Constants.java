package model;



/**
 * <b>Classe contenat les consantes de l'app</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class Constants {
	
	/**
	 *  adrese du server DB
	 */
	public static String serverN = "//localhost:3306/scoutApp";
	/**
	 *  adrese complète server DB,JDBC,...
	 */
	public static String server = "jdbc:mysql:"+serverN+"?serverTimezone=UTC";
	/**
	 *  user de la DB
	 */
	public static String user = "root";
	/**
	 *  user de la DB
	 */
	public static String password = "root";
	/**
	 *  password de la DB
	 */
	public static String appTitle = "23HD app manager";
	/**
	 *  Objet conetnat la liste des noms des colonnes pour le tableau
	 */
    public static final Object[] TABLE_HEADER = { "Id", "Nom", "Prénom","Totem", "Section", "Fonction", "Age", "Adresse" ,"Mail" ,"Camp", "Cotisation"};
    
 
    public static final Object[][] DATA = {
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", true },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", true },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", true },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", true },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", true },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", true }};
    
 
     
}