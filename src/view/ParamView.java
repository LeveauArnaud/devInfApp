package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Constants;
import javax.swing.JTextField;
import controller.ButtonParametreClicked;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * <b>ParamView est la classe représentant la vue des paramètres de l'application.</b>
 * <p>
 * On peut ici modifier les idantifiants de la DB
 * </p>
 * 
 * @author arnaud_leveau
 * @version 1.0
 */
public class ParamView extends JFrame{
	/**
	 * Permet de connaitre la version de classe pour la serialisation
	 */
	private static final long serialVersionUID = 8216349149345277979L;
	/**
	 * Le champ pour l'adresse du server de la DB
	 */
	private JTextField textField_serverN;
	/**
	 * Le champ pour le user de la DB
	 */
	private JTextField textField_user;
	/**
	 * Le champ pour le password de la DB
	 */
	private JTextField textField_password;
	/**
	 * Le panel derrière les champs
	 */
	private JPanel backrounPanel;
	/**
	 * Le label pour l'adresse serveur
	 */
	private JLabel lblServer;
	/**
	 * Le label pour l'user
	 */
	private JLabel lblUser;
	/**
	 * Le label pour le password
	 */
	private JLabel lblPassword;
	/**
	 * Le bouton pour se connecter à la DB
	 */
	private JButton conButton;
	/**
	 * L'image buffered
	 */
	private BufferedImage getBackgroundImage;
	/**
	 * Le label pour l'image de fond
	 */
	private JLabel backgroundImage;
	/**
	 * Objet de type ButtonParametreClicked
	 */
	private ButtonParametreClicked buttonParametreClicked;
	
	/**
	 * <b>Permet d'ajuster l'image à la taille du JLabel</b>
     * @param label
     * 				Le label qui va contenir l'image
     * @param link
     * 				Le lien de l'image
     * 
     * @return retourne l'image à la bonne échelle
     */
	public ImageIcon scaleImage(JLabel label, String link) {
		
		ImageIcon Myimage = new ImageIcon(MainView.class.getResource(link));//ajout image à myImage via le link
		Image img = Myimage.getImage() ;  // convertion ImageIcon en Image
		Image newImg = img.getScaledInstance( label.getWidth(), label.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  //Mise à l'échelle du JButton
		ImageIcon image = new ImageIcon( newImg );//Ajout de l'image au JButton
		
		return image;
	}
	
	
	/**
	 * <b>Vue des paramètres de l'application</b>
     * 
     * <p>
     * Une fenètre composée d'un formulaire pour les modifier les infos de la DB
     * </p>
     * 
     * @throws IOException
     * @see ButtonParametreClicked
     * 
     */
	
	public ParamView() throws IOException  {
		
		
		
		setTitle(Constants.appTitle);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(800, 500));
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		pack();
		
		
		backrounPanel = new JPanel();
		backrounPanel.setBounds(86, 55, 609, 183);
		getContentPane().add(backrounPanel);
		backrounPanel.setLayout(null);
		
		lblServer = new JLabel("Serveur :");
		lblServer.setBounds(17, 17, 98, 22);
		backrounPanel.add(lblServer);
		lblServer.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblUser = new JLabel("Utilisateur :");
		lblUser.setBounds(17, 61, 116, 22);
		backrounPanel.add(lblUser);
		lblUser.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblPassword = new JLabel("Password :");
		lblPassword.setBounds(17, 115, 116, 22);
		backrounPanel.add(lblPassword);
		lblPassword.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_serverN = new JTextField();
		textField_serverN.setBounds(25, 36, 553, 25);
		backrounPanel.add(textField_serverN);
		textField_serverN.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_serverN.setColumns(10);
		textField_serverN.setText(Constants.serverN);
		
		
		textField_user = new JTextField();
		textField_user.setBounds(25, 86, 553, 25);
		backrounPanel.add(textField_user);
		textField_user.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_user.setColumns(10);
		textField_user.setText(Constants.user);
		
	
		textField_password = new JTextField();
		textField_password.setBounds(25, 140, 555, 25);
		backrounPanel.add(textField_password);
		textField_password.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_password.setColumns(10);
		textField_password.setText(Constants.password);
		
		
		conButton = new JButton("Connexion");
		
		conButton.setBackground(Color.PINK);
		conButton.setFont(new Font("HousePaint", Font.PLAIN, 15));
		conButton.setBounds(139, 331, 500, 50);
		conButton.setBackground(new Color(255, 230, 153));
		conButton.setOpaque(true);
		conButton.setBorderPainted(false);
		getContentPane().add(conButton);//ajout du JButton au content pane
		
		getBackgroundImage = ImageIO.read(this.getClass().getResource("/img/logoUnitee.png"));
		backgroundImage = new JLabel(new ImageIcon(getBackgroundImage));
		backgroundImage.setBounds(0, 0, 807, 478);
		getContentPane().add(backgroundImage);
		
		//nouvelle instance du controller
		buttonParametreClicked = new ButtonParametreClicked(
				this,
				textField_serverN,
				textField_user,
				textField_password);
		
		conButton.addActionListener(buttonParametreClicked);
	}
}
