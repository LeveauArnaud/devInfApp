package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.JButton;

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
	private JTextField textField;

	public Viewb() {
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(1247, 49, 27, 22);
		getContentPane().add(lblId);
		lblId.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setBounds(1099, 130, 69, 22);
		getContentPane().add(lblSection);
		lblSection.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(1304, 130, 83, 22);
		getContentPane().add(lblFonction);
		lblFonction.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblTotem = new JLabel("Totem :");
		lblTotem.setBounds(1109, 190, 59, 22);
		getContentPane().add(lblTotem);
		lblTotem.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblPrenom = new JLabel("Nom :");
		lblPrenom.setBounds(1111, 248, 44, 22);
		getContentPane().add(lblPrenom);
		lblPrenom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblNom = new JLabel("Prenom :");
		lblNom.setBounds(1099, 295, 69, 22);
		getContentPane().add(lblNom);
		lblNom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setBounds(1109, 357, 120, 22);
		getContentPane().add(lblDateNaissance);
		lblDateNaissance.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(1109, 426, 60, 22);
		getContentPane().add(lblAdresse);
		lblAdresse.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(1119, 480, 48, 22);
		getContentPane().add(lblMail);
		lblMail.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCotisation = new JLabel("Cotisation :");
		lblCotisation.setBounds(1304, 530, 98, 22);
		getContentPane().add(lblCotisation);
		lblCotisation.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		JLabel lblCamp = new JLabel("Camp :");
		lblCamp.setBounds(1126, 530, 49, 22);
		getContentPane().add(lblCamp);
		lblCamp.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setBounds(1126, 83, 148, 25);
		getContentPane().add(textField_1);
		textField_1.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1126, 153, 148, 25);
		getContentPane().add(textField_2);
		textField_2.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1311, 164, 148, 25);
		getContentPane().add(textField_3);
		textField_3.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1126, 224, 337, 25);
		getContentPane().add(textField_4);
		textField_4.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(1126, 271, 335, 25);
		getContentPane().add(textField_5);
		textField_5.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1126, 329, 335, 25);
		getContentPane().add(textField_6);
		textField_6.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(1126, 391, 335, 25);
		getContentPane().add(textField_7);
		textField_7.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_7.setColumns(10);
		
		txtRueDeLglise = new JTextField();
		txtRueDeLglise.setText("rue de l'église 22 7382 Audgrenies");
		txtRueDeLglise.setBounds(1126, 448, 333, 25);
		getContentPane().add(txtRueDeLglise);
		txtRueDeLglise.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		txtRueDeLglise.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(1126, 500, 333, 25);
		getContentPane().add(textField_9);
		textField_9.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(1126, 550, 148, 25);
		getContentPane().add(textField_10);
		textField_10.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(1311, 550, 148, 25);
		getContentPane().add(textField_11);
		textField_11.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_11.setColumns(10);
		
		JScrollPane tableScrollPane = new JScrollPane((Component) null);
		tableScrollPane.setPreferredSize(new Dimension(1400, 500));
		tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Liste des scouts",
		                TitledBorder.CENTER, TitledBorder.TOP));
		tableScrollPane.setBounds(0, 72, 1007, 708);
		getContentPane().add(tableScrollPane);
		
		textField = new JTextField(26);
		textField.setBounds(268, 20, 322, 26);
		getContentPane().add(textField);
		
		JButton btnChercherUnScout = new JButton("Chercher un scout");
		btnChercherUnScout.setBounds(595, 19, 148, 29);
		getContentPane().add(btnChercherUnScout);
        
    }
}
