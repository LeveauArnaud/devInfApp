package view;


import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DateFormatter;
import java.util.Date;

import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import controller.ButtonAddClicked;
import controller.ButtonClearClicked;
import controller.ButtonDeleteClicked;
import controller.ButtonSearchClicked;
import controller.ButtonUpdateClicked;
import controller.MenuItemParamClicked;
import controller.MouseClicked;
import controller.Search;
import model.Constants;
import model.Model;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * <b>MainView est la classe représentant la vue principale de l'application.</b>
 * <p>
 * Cette vue est composée :
 * </p>
 * <ul>
 * <li>D'un tableau contenat la liste des scouts</li>
 * <li>D'une barre de recherche </li>
 * <li>D'un formulaire pour ajouter/editer un scout</li>
 * </ul>
 * 
 * 
 * 
 * @author arnaud_leveau
 * @version 1.0
 */
public class MainView extends JFrame {
	
	
	/**
	 * Permet de connaitre la version de classe pour la serialisation
	 */
	private static final long serialVersionUID = 3028964288792807010L;
	/**
     * Le champ du formulaire pour l'id
     * 
     */
	private JTextField textField_id;
	/**
     * Le label pour le champ id
     * 
     */
	private JLabel lblId;
	/**
     * Le champ du formulaire pour la section
     * 
     */
	private JTextField textFieldSection;
	/**
     * Le label pour le champ isection
     * 
     */
	private JLabel lblSection;
	/**
     * Le champ du formulaire pour la fonction
     * 
     */
	private JTextField textFieldFonction;
	/**
     * Le label pour le champ fonction
     * 
     */
	private JLabel lblFonction;
	/**
     * Le champ du formulaire pour le totem
     * 
     */
	private JTextField textFieldTotem;
	/**
     * Le label pour le champ totem
     * 
     */
	private JLabel lblTotem;
	/**
     * Le champ du formulaire pour le nom
     * 
     */
	private JTextField textFieldNom;
	/**
     * Le label pour le champ nom
     * 
     */
	private JLabel lblNom;
	/**
     * Le champ du formulaire pour le prenom
     * 
     */
	private JTextField textFieldPrenom;
	/**
     * Le label pour le champ prenom
     * 
     */
	private JLabel lblPrenom;
	/**
     * Le champ du formulaire pour la date de naissance
     * 
     */
	private JFormattedTextField textFieldDateNaissance;
	/**
     * Le label pour le champ date de naissance
     * 
     */
	private JLabel lblDateNaissance;
	/**
     * Le champ du formulaire pour l'adresse
     * 
     */
	private JTextField textFieldAdresse;
	/**
     * Le label pour le champ adresse
     * 
     */
	private JLabel lblAdresse;
	/**
     * Le champ du formulaire pour le mail
     * 
     */
	private JTextField textFieldMail;
	/**
     * Le label pour le champ mail
     * 
     */
	private JLabel lblMail;
	/**
     * Le champ du formulaire pour le nombre de camp
     * 
     */
	private JTextField textFieldCamp;
	/**
     * Le label pour le champ camp
     * 
     */
	private JLabel lblCamp;
	/**
     * Le champ du formulaire pour la cotisation
     * 
     */
	private JTextField textFieldCotisation;
	/**
     * Le label pour le champ cotisation
     * 
     */
	private JLabel lblCotisation;
	/**
     * Le champ pour entre le nom a rechercher
     * 
     */
	private  JTextField textFieldChercherUnScout;
	/**
     * Le Menu 
     * 
     */
	private JMenuBar menuBar;
	/**
     * L'onglet paramètre du menu
     * 
     */
	private JMenu param;
	/**
     * Le sous onglet de l'onglet paramètre
     * <p>
     * il permet de faire le lien avec la vue des paramètres
     * </p>
     * 
     */
	private JMenuItem updateParam;
	/**
     * La table contenant les scouts
     * 
     */
	public static JTable table;
	/**
     * Render d'une cellule
     * 
     */
	private DefaultTableCellRenderer cellRenderer;
	/**
     * Le bouton add
     * 
     */
	private JButton addButton;
	/**
     * Le bouton update
     * 
     */
	private JButton updateButton;
	/**
     * Le bouton delete
     * 
     */
	private JButton deleteButton;
	/**
     * Le bouton clear
     * 
     */
	private JButton clearButton;
	/**
     * La zone scrollable
     * 
     */
	private JScrollPane scrollPane;
	/**
     * Le format d'une date
     * 
     */
	private DateFormat format;
	/**
     * Le formateur de date
     * 
     */
	private DateFormatter df;
	/**
	 * Objet de type ButtonSearchClicked
	 */
	private ButtonSearchClicked buttonSearchClicked;
	/**
	 * Objet de type MouseClicked
	 */
	private MouseClicked mouseClicked;
	/**
	 * Objet de type ButtonAddClicked
	 */
	private ButtonAddClicked buttonAddClicked;
	/**
	 * Objet de type ButtonUpdateClicked
	 */
	private ButtonUpdateClicked buttonUpdateClicked;
	/**
	 * Objet de type ButtonDeleteClicked
	 */
	private ButtonDeleteClicked buttonDeleteClicked;
	/**
	 * Objet de type ButtonClearClicked
	 */
	private ButtonClearClicked buttonClearClicked;
	/**
	 * Objet de type MenuItemParamClicked
	 */
	private MenuItemParamClicked menuItemParamClicked;
	
	
	/**
	 * Permet d'ajuster l'image à la taille du bouton
     * @param button
     * 				Le bouton qui va contenir l'image
     * @param link
     * 				Le lien de l'image
     * 
     * 
     * @return retourne l'image à la bonne échelle
     * 
     */
	public ImageIcon scaleImageButton(JButton button, String link) {
		
		ImageIcon Myimage = new ImageIcon(MainView.class.getResource(link));//ajout image à myImage via le link
		Image img = Myimage.getImage() ;  // convertion ImageIcon en Image
		Image newImg = img.getScaledInstance( button.getWidth(), button.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  //Mise à l'échelle du JButton
		ImageIcon image = new ImageIcon( newImg );
		
		return image;
	}
	/**
	 * Permet d'ajuster l'image à la taille du menu
     * @param menu
     * 				Le menu qui va contenir l'image
     * @param link
     * 				Le lien de l'image
     * 
     * 
     * @return retourne l'image à la bonne échelle
     * 
     */
	public ImageIcon scaleImageMenu(JMenu menu, String link) {
		
		ImageIcon Myimage = new ImageIcon(MainView.class.getResource(link));//ajout image à myImage via le link
		Image img = Myimage.getImage() ;  // convertion ImageIcon en Image
		Image newImg = img.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;  //Mise à l'échelle du JButton
		ImageIcon image = new ImageIcon( newImg );
		
		return image;
	}
	
	
	/**
	 * Vue principale de l'application
     * 
     * <p>
     * Une fenètre composée d'un tableau, barre de recherche, formulaire
     * </p>
     * 
     * @see ButtonAddClicked
     * @see ButtonDeleteClicked
     * @see ButtonUpdateClicked
     * @see ButtonSearchClicked
     * @see MenuItemParamClicked
     * @see MouseClicked
     * 
     */
	public MainView() {
		
		
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
        param = new JMenu();
        param.setIcon(scaleImageMenu(param,"/img/settings.png"));
        param.setFont(new Font("Cocon-Regular", Font.PLAIN, 15));
        updateParam = new JMenuItem("Modifier paramètres");
        updateParam.setFont(new Font("Cocon-Regular", Font.PLAIN, 15));
        menuBar.add(param);
        param.add(updateParam);
        getContentPane().add(menuBar);
		
		lblId = new JLabel("Id :");
		lblId.setBounds(1293, 80, 27, 22);
		getContentPane().add(lblId);
		lblId.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblSection = new JLabel("Section :");
		lblSection.setBounds(1214, 137, 69, 22);
		getContentPane().add(lblSection);
		lblSection.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(1399, 137, 83, 22);
		getContentPane().add(lblFonction);
		lblFonction.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblTotem = new JLabel("Totem :");
		lblTotem.setBounds(1214, 187, 59, 22);
		getContentPane().add(lblTotem);
		lblTotem.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblPrenom = new JLabel("Nom :");
		lblPrenom.setBounds(1214, 237, 44, 22);
		getContentPane().add(lblPrenom);
		lblPrenom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblNom = new JLabel("Prenom :");
		lblNom.setBounds(1214, 287, 69, 22);
		getContentPane().add(lblNom);
		lblNom.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setBounds(1214, 337, 120, 22);
		getContentPane().add(lblDateNaissance);
		lblDateNaissance.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(1214, 387, 60, 22);
		getContentPane().add(lblAdresse);
		lblAdresse.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblMail = new JLabel("Mail :");
		lblMail.setBounds(1214, 437, 48, 22);
		getContentPane().add(lblMail);
		lblMail.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblCotisation = new JLabel("Cotisation :");
		lblCotisation.setBounds(1399, 487, 98, 22);
		getContentPane().add(lblCotisation);
		lblCotisation.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		lblCamp = new JLabel("Camp :");
		lblCamp.setBounds(1214, 487, 49, 22);
		getContentPane().add(lblCamp);
		lblCamp.setFont(new Font("HousePaint", Font.PLAIN, 15));
		
		textField_id = new JTextField();
		textField_id.setBackground(SystemColor.window);
		textField_id.setBounds(1303, 100, 148, 25);
		textField_id.setEditable(false);
		getContentPane().add(textField_id);
		textField_id.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textField_id.setColumns(10);
		
		textFieldSection = new JTextField();
		textFieldSection.setBounds(1221, 157, 148, 25);
		getContentPane().add(textFieldSection);
		textFieldSection.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldSection.setColumns(10);
		
		textFieldFonction = new JTextField();
		textFieldFonction.setBounds(1406, 157, 148, 25);
		getContentPane().add(textFieldFonction);
		textFieldFonction.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldFonction.setColumns(10);
		
		textFieldTotem = new JTextField();
		textFieldTotem.setBounds(1221, 207, 337, 25);
		getContentPane().add(textFieldTotem);
		textFieldTotem.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldTotem.setColumns(10);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(1221, 257, 335, 25);
		getContentPane().add(textFieldNom);
		textFieldNom.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldNom.setColumns(10);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(1221, 307, 335, 25);
		getContentPane().add(textFieldPrenom);
		textFieldPrenom.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldPrenom.setColumns(10);
		
		format = new SimpleDateFormat("yyyy-MM-dd");
        df = new DateFormatter(format);
        textFieldDateNaissance = new JFormattedTextField(df);
        textFieldDateNaissance.setBounds(1221, 357, 335, 25);
        textFieldDateNaissance.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
        textFieldDateNaissance.setColumns(10);
        textFieldDateNaissance.setValue(new Date());
        getContentPane().add(textFieldDateNaissance);
		
		textFieldAdresse = new JTextField();
		textFieldAdresse.setBounds(1221, 407, 333, 25);
		getContentPane().add(textFieldAdresse);
		textFieldAdresse.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldAdresse.setColumns(10);
		
		textFieldMail = new JTextField();
		textFieldMail.setBounds(1221, 457, 333, 25);
		getContentPane().add(textFieldMail);
		textFieldMail.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldMail.setColumns(10);
		
		textFieldCamp = new JTextField();
		textFieldCamp.setBounds(1221, 507, 148, 25);
		getContentPane().add(textFieldCamp);
		textFieldCamp.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldCamp.setColumns(10);
		
		textFieldCotisation = new JTextField();
		textFieldCotisation.setBounds(1406, 507, 148, 25);
		getContentPane().add(textFieldCotisation);
		textFieldCotisation.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		textFieldCotisation.setColumns(10);
		
		textFieldChercherUnScout = new JTextField(26);
		textFieldChercherUnScout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldChercherUnScout.setText("");
			}
		});
		textFieldChercherUnScout.setText("Chercher un scouts...");
		textFieldChercherUnScout.setBounds(308, 44, 502, 26);
		textFieldChercherUnScout.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		getContentPane().add(textFieldChercherUnScout);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 97, 1168, 683);
		scrollPane.setBackground(new Color(255, 211, 75));
		scrollPane.setFont(new Font("HousePaint", Font.PLAIN, 15));
		scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Liste des scouts",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("HousePaint", Font.PLAIN, 15)) );
	
		getContentPane().add(scrollPane);
		
		
		//tableau avec la liste des scouts
		table = new JTable() {

			@Override
			    public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
			        Component comp = super.prepareRenderer(renderer, row, col);
			        if (getSelectedRow() != row) {
			        	
			        		if(col==10) {
			        			Object value = getModel().getValueAt(row, col);
			        
			        			if (value.equals(0)) {
			        				comp.setBackground(Color.red);
			        			} else if (value.equals(1)) {
			        				comp.setBackground(Color.green);
			        			} 
			        		}else {
			        			comp.setBackground(Color.white);
			        		}
			        	}else {
			        		comp.setBackground(new Color(255, 204, 51));
			        	}
			        
			        return comp;
			        
			    }
		};
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionBackground(new Color(255, 204, 51));
		table.setFont(new Font("Cocon-Regular", Font.PLAIN, 13));
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("HousePaint", Font.PLAIN, 15));
		tableHeader.setBackground(new Color(255, 230, 153));
		TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();
		JLabel headerLabel = (JLabel) rendererFromHeader;
		headerLabel.setHorizontalAlignment(JLabel.CENTER);
		scrollPane.setViewportView(table);
		
		//bouton ajouter
		addButton = new JButton();//init du JButton
		addButton.setBounds(1270, 594, 50, 50);//taille 50X50
		addButton.setOpaque(false);
		addButton.setContentAreaFilled(false);
		addButton.setBorderPainted(false);
		addButton.setIcon(scaleImageButton(addButton,"/img/add.png"));
		addButton.setFocusPainted(false);
		addButton.setContentAreaFilled(false);
		addButton.setOpaque(false);
		getContentPane().add(addButton);//ajout du JButton au content pane
				
		//bouton update
		 updateButton = new JButton();
		 updateButton.setBounds(1447, 594, 50, 50);
		 updateButton.setOpaque(false);
		 updateButton.setContentAreaFilled(false);
		 updateButton.setBorderPainted(false);
		 updateButton.setIcon(scaleImageButton(updateButton,"/img/update.png"));
		 updateButton.setFocusPainted(false);
		 updateButton.setContentAreaFilled(false);
		 getContentPane().add(updateButton);
		        
		//bouton delete
		 deleteButton = new JButton();
		 deleteButton.setBounds(1270, 679, 50, 50);
		 deleteButton.setOpaque(false);
		 deleteButton.setContentAreaFilled(false);
		 deleteButton.setBorderPainted(false);
		 deleteButton.setIcon(scaleImageButton(deleteButton,"/img/delete.png"));
		 deleteButton.setFocusPainted(false);
		 deleteButton.setContentAreaFilled(false);
		 getContentPane().add(deleteButton);
		 
		//bouton clear
		 clearButton = new JButton();
		 clearButton.setBounds(1447, 679, 50, 50);
		 clearButton.setOpaque(false);
		 clearButton.setContentAreaFilled(false);
		 clearButton.setBorderPainted(false);
		 clearButton.setIcon(scaleImageButton(deleteButton,"/img/clear.png"));
		 clearButton.setFocusPainted(false);
		 clearButton.setContentAreaFilled(false);
		 getContentPane().add(clearButton);
		 
		
		// Create table model
        Model model = new Model();
        table.setModel(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(3);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(50);
        table.getColumnModel().getColumn(6).setPreferredWidth(40);
        table.getColumnModel().getColumn(8).setPreferredWidth(100);
        table.getColumnModel().getColumn(9).setPreferredWidth(25);
        table.getColumnModel().getColumn(10).setPreferredWidth(80);
        cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        table.getColumnModel().getColumn(9).setCellRenderer(cellRenderer);
        table.getColumnModel().getColumn(10).setCellRenderer(cellRenderer);
        
        
        // Create controllers
        buttonSearchClicked = new ButtonSearchClicked(
        		textFieldChercherUnScout, 
        		model);
        
        mouseClicked =  new MouseClicked(
        	table,
        	textField_id,
        	textFieldSection,
        	textFieldFonction, 
        	textFieldTotem,
        	textFieldNom,
        	textFieldPrenom,
        	textFieldDateNaissance,
        	textFieldAdresse,
        	textFieldMail,
        	textFieldCamp,
        	textFieldCotisation
        												);
        buttonAddClicked = new ButtonAddClicked(
			textFieldSection,
			textFieldFonction, 
			textFieldTotem,
			textFieldNom,
			textFieldPrenom,
			textFieldDateNaissance,
			textFieldAdresse,
			textFieldMail,
			textFieldCamp,
			textFieldCotisation);
        
        buttonUpdateClicked = new ButtonUpdateClicked(
        	textField_id,
        	textFieldSection,
			textFieldFonction, 
			textFieldTotem,
			textFieldNom,
			textFieldPrenom,
			textFieldDateNaissance,
			textFieldAdresse,
			textFieldMail,
			textFieldCamp,
			textFieldCotisation);
        
        
        
        buttonDeleteClicked = new ButtonDeleteClicked(
        												textField_id);
        
        buttonClearClicked = new ButtonClearClicked(
        		textField_id,
            	textFieldSection,
    			textFieldFonction, 
    			textFieldTotem,
    			textFieldNom,
    			textFieldPrenom,
    			textFieldDateNaissance,
    			textFieldAdresse,
    			textFieldMail,
    			textFieldCamp,
    			textFieldCotisation);
        
        
        menuItemParamClicked = new MenuItemParamClicked();
        
        Search search = new Search(
        		textFieldChercherUnScout,
    			table,
    			model
        		
        		);
        table.addMouseListener(mouseClicked);
        addButton.addActionListener(buttonAddClicked);
        updateButton.addActionListener(buttonUpdateClicked);
        deleteButton.addActionListener(buttonDeleteClicked);
        clearButton.addActionListener(buttonClearClicked);
        updateParam.addActionListener(menuItemParamClicked);
        textFieldChercherUnScout.addKeyListener(search);
        
        
        
        
    
        
    }
}