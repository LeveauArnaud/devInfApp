package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controller.Controller;
import model.Model;
import javax.swing.UIManager;
 
/**
 * @author arnaud_leveau
 *
 */
public class View {
 
    public View() {
    	
    	
        // Create views swing UI components 
        JTextField searchTermTextField = new JTextField(26);
        JButton filterButton = new JButton("Chercher");
        JTable table = new JTable();
        table.setEnabled(false);
        table.setForeground(UIManager.getColor("Button.darkShadow"));
 
        // Create table model
        Model model = new Model();
        table.setModel(model);
 
        // Create controller
        Controller controller = new Controller(searchTermTextField, model);
        filterButton.addActionListener(controller);
 
        // Set the view layout
        JPanel ctrlPane = new JPanel();
        ctrlPane.setBackground(UIManager.getColor("Button.select"));
        ctrlPane.add(searchTermTextField);
        ctrlPane.add(filterButton);
 
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(1400, 500));
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Liste des scouts",
                TitledBorder.CENTER, TitledBorder.TOP));
 
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, tableScrollPane);
        splitPane.setDividerLocation(35);
        splitPane.setEnabled(false);
 
        // Display it all in a scrolling window and make the window appear
        JFrame frame = new JFrame("Scout app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
 
}