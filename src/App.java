
import javax.swing.SwingUtilities;

import view.MainView;


 
/**
 * <b>App est la classe qui permet de lancer l'application.</b>
 * 
 * @author arnaud_leveau
 * @version 1.0
 */
public class App {
	
	/**
	 * Méthode main
	 * 
	 * @param args
	 * */
 
    public static void main(String[] args) {
     
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
	 * Méthode createAndShowGUI, crée une nouvelle MainView
	 * 
	 * @throws Exception
	 * */
 
    public static void createAndShowGUI() throws Exception {
        new MainView();
    }
	
	
}