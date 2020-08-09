package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
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
import controller.Controller;
import model.Model;

public class View extends JFrame {
	
	
	
	private JTextField textField_id;
	private JTextField textField_nom;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtRueDeLglise;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textFieldChercherUnScout;
	private JTable table;
	
	

	public ImageIcon scaleImage(JButton button, String link) {
		
		ImageIcon Myimage = new ImageIcon(View.class.getResource(link));//ajout image à myImage via le link
		Image img = Myimage.getImage() ;  // convertion ImageIcon en Image
		Image newImg = img.getScaledInstance( button.getWidth(), button.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  //Mise à l'échelle du JButton
		ImageIcon image = new ImageIcon( newImg );//Ajout de l'image au JButton
		
		return image;
	}
	
	public View() {
		
		//frame param
		setTitle("Scout app");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1600, 800));
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		pack();
        setLocationRelativeTo(null);
        setVisible(true);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(1296, 55, 27, 22);
		getContentPane().add(lblId);
		lblId.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setBounds(1217, 112, 69, 22);
		getContentPane().add(lblSection);
		lblSection.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(1402, 112, 83, 22);
		getContentPane().add(lblFonction);
		lblFonction.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblTotem = new JLabel("Totem :");
		lblTotem.setBounds(1217, 162, 59, 22);
		getContentPane().add(lblTotem);
		lblTotem.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblPrenom = new JLabel("Nom :");
		lblPrenom.setBounds(1217, 212, 44, 22);
		getContentPane().add(lblPrenom);
		lblPrenom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblNom = new JLabel("Prenom :");
		lblNom.setBounds(1217, 262, 69, 22);
		getContentPane().add(lblNom);
		lblNom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setBounds(1217, 312, 120, 22);
		getContentPane().add(lblDateNaissance);
		lblDateNaissance.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(1217, 362, 60, 22);
		getContentPane().add(lblAdresse);
		lblAdresse.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(1217, 412, 48, 22);
		getContentPane().add(lblMail);
		lblMail.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCotisation = new JLabel("Cotisation :");
		lblCotisation.setBounds(1402, 462, 98, 22);
		getContentPane().add(lblCotisation);
		lblCotisation.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCamp = new JLabel("Camp :");
		lblCamp.setBounds(1217, 462, 49, 22);
		getContentPane().add(lblCamp);
		lblCamp.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_id = new JTextField();
		textField_id.setBackground(SystemColor.window);
		textField_id.setBounds(1306, 75, 148, 25);
		getContentPane().add(textField_id);
		textField_id.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_id.setColumns(10);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(1224, 132, 148, 25);
		getContentPane().add(textField_nom);
		textField_nom.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_nom.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1409, 132, 148, 25);
		getContentPane().add(textField_3);
		textField_3.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1224, 182, 337, 25);
		getContentPane().add(textField_4);
		textField_4.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(1224, 232, 335, 25);
		getContentPane().add(textField_5);
		textField_5.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1224, 282, 335, 25);
		getContentPane().add(textField_6);
		textField_6.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(1224, 332, 335, 25);
		getContentPane().add(textField_7);
		textField_7.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_7.setColumns(10);
		
		txtRueDeLglise = new JTextField();
		txtRueDeLglise.setText("rue de l'église 22 7382 Audgrenies");
		txtRueDeLglise.setBounds(1224, 382, 333, 25);
		getContentPane().add(txtRueDeLglise);
		txtRueDeLglise.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		txtRueDeLglise.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(1224, 432, 333, 25);
		getContentPane().add(textField_9);
		textField_9.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(1224, 482, 148, 25);
		getContentPane().add(textField_10);
		textField_10.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(1409, 482, 148, 25);
		getContentPane().add(textField_11);
		textField_11.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_11.setColumns(10);
		
		textFieldChercherUnScout = new JTextField(26);
		textFieldChercherUnScout.setBounds(290, 35, 322, 26);
		textFieldChercherUnScout.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		getContentPane().add(textFieldChercherUnScout);
		
		JButton btnChercherUnScout = new JButton("Chercher un scout");
		btnChercherUnScout.setBounds(693, 35, 148, 29);
		btnChercherUnScout.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		getContentPane().add(btnChercherUnScout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 97, 1144, 683);
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
		scrollPane.setViewportView(table);
		
		//bouton ajouter
		JButton addButton = new JButton();//init du JButton
		addButton.setBounds(1217, 561, 50, 50);//taille 50X50
		addButton.setIcon(scaleImage(addButton,"/img/add.png"));
		addButton.setFocusPainted(false);
		addButton.setContentAreaFilled(false);
		addButton.setOpaque(false);
		getContentPane().add(addButton);//ajout du JButton au content pane
				
		//bouton update
		 JButton updateButton = new JButton();
		 updateButton.setBounds(1364, 561, 50, 50);
		        updateButton.setBackground(new Color(0,0,0,0));
		        updateButton.setIcon(scaleImage(updateButton,"/img/update.png"));
		        updateButton.setFocusPainted(false);
		        updateButton.setContentAreaFilled(false);
		        getContentPane().add(updateButton);
		        
		        //bouton delete
		        JButton deleteButton = new JButton();
		        deleteButton.setBounds(1511, 561, 50, 50);
		        deleteButton.setIcon(scaleImage(deleteButton,"/img/delete.png"));
		        deleteButton.setFocusPainted(false);
		        updateButton.setContentAreaFilled(false);
		        getContentPane().add(deleteButton);
		
		// Create table model
        Model model = new Model();
        table.setModel(model);
        
        // Create controller
        Controller controller = new Controller(textFieldChercherUnScout, model);
		
       
        
        btnChercherUnScout.addActionListener(controller);
        
        
        
        
    
        
    }
}