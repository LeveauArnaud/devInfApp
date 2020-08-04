package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.Controller;
import model.Model;

public class Viewb extends JFrame {
	
	
	
	private JTextField textField_1;
	private JTextField textField_2;
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
	
	

	public Viewb() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1600, 800));
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		pack();
        setLocationRelativeTo(null);
        setVisible(true);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(1183, 20, 27, 22);
		getContentPane().add(lblId);
		lblId.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setBounds(1104, 77, 69, 22);
		getContentPane().add(lblSection);
		lblSection.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(1289, 77, 83, 22);
		getContentPane().add(lblFonction);
		lblFonction.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblTotem = new JLabel("Totem :");
		lblTotem.setBounds(1104, 127, 59, 22);
		getContentPane().add(lblTotem);
		lblTotem.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblPrenom = new JLabel("Nom :");
		lblPrenom.setBounds(1104, 177, 44, 22);
		getContentPane().add(lblPrenom);
		lblPrenom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblNom = new JLabel("Prenom :");
		lblNom.setBounds(1104, 227, 69, 22);
		getContentPane().add(lblNom);
		lblNom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setBounds(1104, 277, 120, 22);
		getContentPane().add(lblDateNaissance);
		lblDateNaissance.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(1104, 327, 60, 22);
		getContentPane().add(lblAdresse);
		lblAdresse.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(1104, 377, 48, 22);
		getContentPane().add(lblMail);
		lblMail.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCotisation = new JLabel("Cotisation :");
		lblCotisation.setBounds(1289, 427, 98, 22);
		getContentPane().add(lblCotisation);
		lblCotisation.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCamp = new JLabel("Camp :");
		lblCamp.setBounds(1104, 427, 49, 22);
		getContentPane().add(lblCamp);
		lblCamp.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.window);
		textField_1.setBounds(1193, 40, 148, 25);
		getContentPane().add(textField_1);
		textField_1.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1111, 97, 148, 25);
		getContentPane().add(textField_2);
		textField_2.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1296, 97, 148, 25);
		getContentPane().add(textField_3);
		textField_3.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1111, 147, 337, 25);
		getContentPane().add(textField_4);
		textField_4.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(1111, 197, 335, 25);
		getContentPane().add(textField_5);
		textField_5.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1111, 247, 335, 25);
		getContentPane().add(textField_6);
		textField_6.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(1111, 297, 335, 25);
		getContentPane().add(textField_7);
		textField_7.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_7.setColumns(10);
		
		txtRueDeLglise = new JTextField();
		txtRueDeLglise.setText("rue de l'église 22 7382 Audgrenies");
		txtRueDeLglise.setBounds(1111, 347, 333, 25);
		getContentPane().add(txtRueDeLglise);
		txtRueDeLglise.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		txtRueDeLglise.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(1111, 397, 333, 25);
		getContentPane().add(textField_9);
		textField_9.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(1111, 447, 148, 25);
		getContentPane().add(textField_10);
		textField_10.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(1296, 447, 148, 25);
		getContentPane().add(textField_11);
		textField_11.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_11.setColumns(10);
		
		textFieldChercherUnScout = new JTextField(26);
		textFieldChercherUnScout.setBounds(268, 20, 322, 26);
		getContentPane().add(textFieldChercherUnScout);
		
		JButton btnChercherUnScout = new JButton("Chercher un scout");
		btnChercherUnScout.setBounds(595, 19, 148, 29);
		getContentPane().add(btnChercherUnScout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 97, 1045, 683);
		scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Liste des scouts",
                TitledBorder.CENTER, TitledBorder.TOP));
		getContentPane().add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		// Create table model
        Model model = new Model();
        table.setModel(model);
        
     // Create controller
        Controller controller = new Controller(textFieldChercherUnScout, model);
		
		JButton addButton = new JButton();//init du JButton
		addButton.setBounds(1104, 526, 50, 50);//taille 50X50
		getContentPane().add(addButton);//ajout du JButton au content pane
		ImageIcon Myimage = new ImageIcon(Viewb.class.getResource("/img/add.png"));//ajout image à myImage
		Image img = Myimage.getImage() ;  // convertion ImageIcon en Image
		Image newImg = img.getScaledInstance( addButton.getWidth(), addButton.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  //Mise à l'échelle du JButton
		ImageIcon image = new ImageIcon( newImg );//Ajout de l'image au JButton
		addButton.setIcon(image);
		
		
        
        JButton addButton_1 = new JButton();
        addButton_1.setBounds(1251, 526, 50, 50);
        getContentPane().add(addButton_1);
        
        JButton addButton_2 = new JButton();
        addButton_2.setBounds(1398, 526, 50, 50);
        getContentPane().add(addButton_2);
        btnChercherUnScout.addActionListener(controller);
        
        
        
        
    
        
    }
}
