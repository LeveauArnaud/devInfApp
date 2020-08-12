package model;



/**
 * @author arnaud_leveau
 * 
 */
public class Constants {
	
	public static String serverN = "//localhost:3306/scoutApp";
	public static String server = "jdbc:mysql:"+serverN+"?serverTimezone=UTC";
	public static String user = "root";
	public static String password = "root";
	
	public static String appTitle = "23HD app manager";
 
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