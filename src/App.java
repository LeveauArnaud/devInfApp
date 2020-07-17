import controller.Controller;
import model.Model;
import view.View;

public class App {
	
 public static void main(String[] args) {
  // Assemble all the pieces of the MVC
  Model m = new Model("Sylvain", "Saurel");
  View v = new View("Scout App");
  Controller c = new Controller(m, v);
  c.initController();
 }
 
}