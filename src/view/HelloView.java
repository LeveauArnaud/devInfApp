package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import model.Constants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_server;
	private JTextField textField_user;
	private JTextField textField_password;
	
	
	public HelloView() throws IOException  {
		
		//frame param
		setTitle(Constants.appTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1600, 800));
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(444, 144, 609, 183);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_server = new JLabel("Serveur :");
		lbl_server.setBounds(17, 17, 98, 22);
		panel.add(lbl_server);
		lbl_server.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lbl_user = new JLabel("Utilisateur :");
		lbl_user.setBounds(17, 61, 116, 22);
		panel.add(lbl_user);
		lbl_user.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lbl_password = new JLabel("Password :");
		lbl_password.setBounds(17, 115, 116, 22);
		panel.add(lbl_password);
		lbl_password.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_server = new JTextField();
		textField_server.setBounds(25, 36, 553, 25);
		panel.add(textField_server);
		textField_server.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_server.setColumns(10);
		textField_server.setText(Constants.server);
		
		
		textField_user = new JTextField();
		textField_user.setBounds(25, 86, 553, 25);
		panel.add(textField_user);
		textField_user.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_user.setColumns(10);
		textField_user.setText(Constants.user);
		
		textField_password = new JTextField();
		textField_password.setBounds(25, 140, 555, 25);
		panel.add(textField_password);
		textField_password.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_password.setColumns(10);
		textField_password.setText(Constants.password);
		
		JButton searchButton = new JButton("Chercher un scout");
		searchButton.setBounds(693, 35, 148, 29);
		searchButton.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		getContentPane().add(searchButton);
		
		//bouton Connexion
		JButton conButton = new JButton("Connexion");
		conButton.setBackground(Color.PINK);
		conButton.setFont(new Font("HousePaint", Font.PLAIN, 15));
		conButton.setBounds(500, 420, 500, 50);
		conButton.setBackground(new Color(255, 230, 153));
		conButton.setOpaque(true);
		conButton.setBorderPainted(false);
		getContentPane().add(conButton);//ajout du JButton au content pane
		
		BufferedImage getBackgroundImage = ImageIO.read(this.getClass().getResource("/img/logoUnitee.png"));
		JLabel backgroundImage = new JLabel(new ImageIcon(getBackgroundImage));
		backgroundImage.setBounds(6, 6, 1395, 728);
		getContentPane().add(backgroundImage);
	}
}
