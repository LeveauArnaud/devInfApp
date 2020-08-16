package model;



/**
 * <b>Classe contenant les consantes de l'app</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 *
 */
public class AppConstants {


	/**
	 *  adrese du server DB
	 */
	private static String serverN = "//localhost:3306/scoutApp";
	/**
	 *  adrese complète server DB,JDBC,...
	 */
	private static String server = "jdbc:mysql:"+serverN+"?serverTimezone=UTC";
	/**
	 *  user de la DB
	 */
	private static String user = "root";
	/**
	 *  user de la DB
	 */
	private static String password = "root";
	/**
	 *  password de la DB
	 */
	private static String appTitle = "23HD app manager";
	/**
	 *  Objet conetnat la liste des noms des colonnes pour le tableau
	 */
	private static final Object[] TABLE_HEADER = { "Id", "Nom", "Prénom","Totem", "Section", "Fonction", "Age", "Adresse" ,"Mail" ,"Camp", "Cotisation"};
    
	/**
	 *  Objet conetnat une liste de scout pour la phase développement
	 */
	private static final Object[][] DATA = {
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 1 },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 1 },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0  },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 1 },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 0  },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 0  },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 0  },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0  },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 1 },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 0  },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 1 },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 1 },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 0  },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 0  },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 0  },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 1 },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 1 },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 1 },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 1 },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 1 },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0  },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 0  },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 0  },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 0  },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 0  },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 0  },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0  },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 0  },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 0  },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 0  },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0  },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 1 },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 0  },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 0  },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0  },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 0  },
            { "Leveau", "ARNAUD", "JAGUARUNDI", "Pionniers", "Animateur", "19/03/1998", "RUE DE L'EGALITE 11 7080 EUGIES", 1 },
            { "LANTIER", "ANTOINE", "ARTAMI", "Pionniers", "Animateur", "19/09/1997", "RUE DE L'EGLISE 22 7382 AUDREGNIES", 1 },
            { "BACHURZ", "LIZA", "REDUNCA", "Pionniers", "Scout", "17/07/2002", "RUE D'ELOUGES 1 A 7380 BAISIEUX", 1 },
            { "BEKAERT", "THEO", "CARACAL", "Pionniers", "Scout", "22/02/2002", "RUE FERLIBRAY 2 7387 ERQUENNES", 1 },
            { "DUFRASNE", "TOM", "GOUNDI", "Pionniers", "Scout", "14/02/2002", "RUE CAUDERLOO 126 7370 DOUR", 0 },
            { "Urbain", "ELINE", "DORCAS", "Pionniers", "Scout", "01/08/2002", "RUE DE BOUSIES (G.) 7 7011 GHLIN", 0  }};
    
	/**
	 *  Méthode permettant de récupérer l'adresse du server DB
	 *  
	 *  @return l'adresse du server DB
	 */
	public static String getServerN() {
		return serverN;
	}

	/**
	 *  Méthode permettant de modifier l'adresse du server DB
	 *  
	 *  @param serverN l'adresse du server DB (ex : //localhost:3306/scoutApp )
	 */
	public static void setServerN(String serverN) {
		AppConstants.serverN = serverN;
	}

	/**
	 *  Méthode permettant de récupérer la chaine de connexion du server DB (JDBC,DB,..)
	 *  
	 *  @return la chain de connexion du server DB
	 */
	public static String getServer() {
		return server;
	}

	/**
	 *  Méthode permettant de récupérer le nom d'utilisateur pour la base de donnée
	 *  
	 *  @return le nom d'utilisateur
	 */
	public static String getUser() {
		return user;
	}

	/**
	 *  Méthode permettant de modifier le nom d'utilisateur pour la base de donnée
	 *  
	 *  @param user le nom d'utilisateur
	 */
	public static void setUser(String user) {
		AppConstants.user = user;
	}

	/**
	 *  Méthode permettant de récupérer le mot de passe de l'utilisateur pour la base de donnée
	 *  
	 *  @return le mot de passe de l'utilisateur
	 */
	public static String getPassword() {
		return password;
	}

	/**
	 *  Méthode permettant de modifier le mot de passe de l'utilisateur pour la base de donnée
	 *  
	 *  @param password le mot de passe de l'utilisateur
	 */
	public static void setPassword(String password) {
		AppConstants.password = password;
	}

	/**
	 *  Méthode permettant de récupérer le titre de l'application
	 *  
	 *  @return Un srting avec le titre de l'application
	 */
	public static String getAppTitle() {
		return appTitle;
	}

	/**
	 *  Méthode permettant de modifier le titre de l'application
	 *  
	 *  @param appTitle le titre de l'application
	 */
	public static void setAppTitle(String appTitle) {
		AppConstants.appTitle = appTitle;
	}

	/**
	 *  Méthode permettant de récupérer le titre des colonnes pour le tableau contenat la liste des scouts.
	 *  
	 *  @return un Object contenant la liste des titres.
	 */
	public static Object[] getTableHeader() {
		return TABLE_HEADER;
	}

	/**
	 *  Méthode permettant de récupérer la liste des scouts pour les tests.
	 *  
	 *  @return un Object contenant la liset des scouts.
	 */
	public static Object[][] getData() {
		return DATA;
	}
    
     
}