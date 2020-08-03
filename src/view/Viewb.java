package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Viewb extends JFrame {

	public Viewb() {
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id : ");
		lblId.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblId.setBounds(41, 48, 61, 16);
		getContentPane().add(lblId);
		
		JLabel lblSection = new JLabel("Section : ");
		lblSection.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblSection.setBounds(41, 76, 84, 16);
		getContentPane().add(lblSection);
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblFonction.setBounds(41, 104, 95, 16);
		getContentPane().add(lblFonction);
		
		JLabel lblTotem = new JLabel("Totem :");
		lblTotem.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblTotem.setBounds(41, 132, 61, 16);
		getContentPane().add(lblTotem);
		
		JLabel lblPrenom = new JLabel("Nom :");
		lblPrenom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblPrenom.setBounds(41, 160, 61, 16);
		getContentPane().add(lblPrenom);
		
		JLabel lblNom = new JLabel("Prenom : ");
		lblNom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblNom.setBounds(41, 188, 76, 16);
		getContentPane().add(lblNom);
		
		JLabel lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblDateNaissance.setBounds(41, 216, 127, 16);
		getContentPane().add(lblDateNaissance);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblAdresse.setBounds(41, 244, 61, 16);
		getContentPane().add(lblAdresse);
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblMail.setBounds(41, 272, 61, 16);
		getContentPane().add(lblMail);
		
		JLabel lblCotisation = new JLabel("Cotisation :");
		lblCotisation.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblCotisation.setBounds(41, 300, 114, 16);
		getContentPane().add(lblCotisation);
		
		JLabel lblCamp = new JLabel("Camp :");
		lblCamp.setFont(new Font("HousePaint", Font.PLAIN, 15));
		lblCamp.setBounds(41, 328, 61, 16);
		getContentPane().add(lblCamp);
        
    }
}
