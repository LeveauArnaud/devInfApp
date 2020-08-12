
import javax.swing.SwingUtilities;

import view.ParamView;
import view.MainView;


 
/**
 * @author arnaudLeveau
 * 
 */
public class App {
 
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
 
    public static void createAndShowGUI() throws Exception {
        new MainView();
    }
	
	
}