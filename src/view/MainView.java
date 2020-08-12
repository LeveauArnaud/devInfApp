package view;


import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;

import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.SystemColor;

import controller.ButtonAddClicked;
import controller.ButtonDeleteClicked;
import controller.ButtonSearchClicked;
import controller.ButtonUpdateClicked;
import controller.MouseClicked;
import model.Constants;
import model.Model;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {
	
	
	
	private JTextField textField_id;
	private JTextField textField_section;
	private JTextField textField_fonction;
	private JTextField textField_totem;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_dateNaissance;
	private JTextField textField_adresse;
	private JTextField textField_mail;
	private JTextField textField_camp;
	private JTextField textField_cotisation;
	private JTextField textFieldChercherUnScout;
	private JMenuBar menuBar;
	private JMenu param;
	private JMenuItem updateParam;
	public static JTable table;
	
	

	public ImageIcon scaleImage(JButton button, String link) {
		
		ImageIcon Myimage = new ImageIcon(MainView.class.getResource(link));//ajout image à myImage via le link
		Image img = Myimage.getImage() ;  // convertion ImageIcon en Image
		Image newImg = img.getScaledInstance( button.getWidth(), button.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  //Mise à l'échelle du JButton
		ImageIcon image = new ImageIcon( newImg );//Ajout de l'image au JButton
		
		return image;
	}
	
	public MainView() {
		
		//frame param
		setTitle(Constants.appTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1600, 800));
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 1600, 22);
        menuBar.setBackground(new Color(255, 230, 153));
        menuBar.setFont(new Font("HousePaint", Font.PLAIN, 15));
        param = new JMenu("Paramètres");
        param.setFont(new Font("Cocon-Regular", Font.PLAIN, 15));
        updateParam = new JMenuItem("Modifier paramètres");
        updateParam.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					HelloView pv = new HelloView();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
        	}
        });
        updateParam.setFont(new Font("Cocon-Regular", Font.PLAIN, 15));
        menuBar.add(param);
        param.add(updateParam);
        getContentPane().add(menuBar);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(1296, 163, 27, 22);
		getContentPane().add(lblId);
		lblId.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setBounds(1217, 220, 69, 22);
		getContentPane().add(lblSection);
		lblSection.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(1402, 220, 83, 22);
		getContentPane().add(lblFonction);
		lblFonction.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblTotem = new JLabel("Totem :");
		lblTotem.setBounds(1217, 270, 59, 22);
		getContentPane().add(lblTotem);
		lblTotem.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblPrenom = new JLabel("Nom :");
		lblPrenom.setBounds(1217, 320, 44, 22);
		getContentPane().add(lblPrenom);
		lblPrenom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblNom = new JLabel("Prenom :");
		lblNom.setBounds(1217, 370, 69, 22);
		getContentPane().add(lblNom);
		lblNom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setBounds(1217, 420, 120, 22);
		getContentPane().add(lblDateNaissance);
		lblDateNaissance.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(1217, 470, 60, 22);
		getContentPane().add(lblAdresse);
		lblAdresse.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(1217, 520, 48, 22);
		getContentPane().add(lblMail);
		lblMail.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCotisation = new JLabel("Cotisation :");
		lblCotisation.setBounds(1402, 570, 98, 22);
		getContentPane().add(lblCotisation);
		lblCotisation.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCamp = new JLabel("Camp :");
		lblCamp.setBounds(1217, 570, 49, 22);
		getContentPane().add(lblCamp);
		lblCamp.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_id = new JTextField();
		textField_id.setBackground(SystemColor.window);
		textField_id.setBounds(1306, 183, 148, 25);
		getContentPane().add(textField_id);
		textField_id.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_id.setColumns(10);
		
		textField_section = new JTextField();
		textField_section.setBounds(1224, 240, 148, 25);
		getContentPane().add(textField_section);
		textField_section.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_section.setColumns(10);
		
		textField_fonction = new JTextField();
		textField_fonction.setBounds(1409, 240, 148, 25);
		getContentPane().add(textField_fonction);
		textField_fonction.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_fonction.setColumns(10);
		
		textField_totem = new JTextField();
		textField_totem.setBounds(1224, 290, 337, 25);
		getContentPane().add(textField_totem);
		textField_totem.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_totem.setColumns(10);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(1224, 340, 335, 25);
		getContentPane().add(textField_nom);
		textField_nom.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_nom.setColumns(10);
		
		textField_prenom = new JTextField();
		textField_prenom.setBounds(1224, 390, 335, 25);
		getContentPane().add(textField_prenom);
		textField_prenom.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_prenom.setColumns(10);
		
		textField_dateNaissance = new JTextField();
		textField_dateNaissance.setBounds(1224, 440, 335, 25);
		getContentPane().add(textField_dateNaissance);
		textField_dateNaissance.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_dateNaissance.setColumns(10);
		
		textField_adresse = new JTextField();
		textField_adresse.setBounds(1224, 490, 333, 25);
		getContentPane().add(textField_adresse);
		textField_adresse.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_adresse.setColumns(10);
		
		textField_mail = new JTextField();
		textField_mail.setBounds(1224, 540, 333, 25);
		getContentPane().add(textField_mail);
		textField_mail.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_mail.setColumns(10);
		
		textField_camp = new JTextField();
		textField_camp.setBounds(1224, 590, 148, 25);
		getContentPane().add(textField_camp);
		textField_camp.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_camp.setColumns(10);
		
		textField_cotisation = new JTextField();
		textField_cotisation.setBounds(1409, 590, 148, 25);
		getContentPane().add(textField_cotisation);
		textField_cotisation.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_cotisation.setColumns(10);
		
		textFieldChercherUnScout = new JTextField(26);
		textFieldChercherUnScout.setBounds(290, 35, 322, 26);
		textFieldChercherUnScout.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		getContentPane().add(textFieldChercherUnScout);
		
		JButton searchButton = new JButton("Chercher un scout");
		searchButton.setBounds(693, 35, 148, 29);
		searchButton.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		getContentPane().add(searchButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 97, 1144, 683);
		scrollPane.setBackground(new Color(255, 211, 75));
		scrollPane.setFont(new Font("HousePaint", Font.PLAIN, 15));
		scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Liste des scouts",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("HousePaint", Font.PLAIN, 15)) );
	
		getContentPane().add(scrollPane);
		
		
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionBackground(new Color(255, 204, 51));
		table.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("HousePaint", Font.PLAIN, 15));
		tableHeader.setBackground(new Color(255, 230, 153));
		scrollPane.setViewportView(table);
		
		//bouton ajouter
		JButton addButton = new JButton();//init du JButton
		addButton.setBounds(1217, 669, 50, 50);//taille 50X50
		addButton.setBackground(new Color(255, 204, 51));
		addButton.setIcon(scaleImage(addButton,"/img/add.png"));
		addButton.setFocusPainted(false);
		addButton.setContentAreaFilled(false);
		addButton.setOpaque(false);
		getContentPane().add(addButton);//ajout du JButton au content pane
				
		//bouton update
		 JButton updateButton = new JButton();
		 updateButton.setBounds(1364, 669, 50, 50);
		 updateButton.setBackground(new Color(0,0,0,0));
		 updateButton.setIcon(scaleImage(updateButton,"/img/update.png"));
		 updateButton.setFocusPainted(false);
		 updateButton.setContentAreaFilled(false);
		 getContentPane().add(updateButton);
		        
		//bouton delete
		 JButton deleteButton = new JButton();
		 deleteButton.setBounds(1511, 669, 50, 50);
		 deleteButton.setIcon(scaleImage(deleteButton,"/img/delete.png"));
		 deleteButton.setFocusPainted(false);
		 deleteButton.setContentAreaFilled(false);
		 getContentPane().add(deleteButton);
		 
		
		// Create table model
        Model model = new Model();
        table.setModel(model);
        
        // Create controller
        ButtonSearchClicked buttonSearchClicked = new ButtonSearchClicked(textFieldChercherUnScout, model);
        MouseClicked mouseClicked =  new MouseClicked(
        	table,
        	textField_id,
        	textField_section,
        	textField_fonction, 
        	textField_totem,
        	textField_nom,
        	textField_prenom,
        	textField_dateNaissance,
        	textField_adresse,
        	textField_mail,
        	textField_camp,
        	textField_cotisation
        												);
        ButtonAddClicked buttonAddClicked = new ButtonAddClicked(
			textField_section,
			textField_fonction, 
			textField_totem,
			textField_nom,
			textField_prenom,
			textField_dateNaissance,
			textField_adresse,
			textField_mail,
			textField_camp,
			textField_cotisation);
        
        ButtonUpdateClicked buttonUpdateClicked = new ButtonUpdateClicked(
        	textField_id,
        	textField_section,
			textField_fonction, 
			textField_totem,
			textField_nom,
			textField_prenom,
			textField_dateNaissance,
			textField_adresse,
			textField_mail,
			textField_camp,
			textField_cotisation);
        
        
        
        ButtonDeleteClicked buttonDeleteClicked = new ButtonDeleteClicked(
        												textField_id);
        
        
        
        
        searchButton.addActionListener(buttonSearchClicked);
        table.addMouseListener(mouseClicked);
        addButton.addActionListener(buttonAddClicked);
        updateButton.addActionListener(buttonUpdateClicked);
        deleteButton.addActionListener(buttonDeleteClicked);
        
        
        
        
        
    
        
    }
}