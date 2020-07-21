import controller.Controller;
import model.Model;
import view.MainView;


/**
*
* @author Arnaud Leveau
*/

public class App {
	
 public static void main(String[] args) {
  // Assemble all the pieces of the MVC
  Model m = new Model("Sylvain", "Saurel");
  MainView v = new MainView();
  Controller c = new Controller(m, v);
  c.initController();
 }
 
}