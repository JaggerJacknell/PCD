/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenêtregraphique;
import java.awt.*;
import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
/**
 *
 * @author Amiri
 */
public class View extends JFrame {
    
  private Model model; 
  private Controller controller;
  
   
    
public View (Model model) {
    
JFrame fenetre = new JFrame("Compteur");
Container contenu = fenetre.getContentPane();
contenu.setLayout(new java.awt.FlowLayout());
JLabel afficheur = new JLabel("" + model.getValeur());
afficheur.setHorizontalAlignment(JLabel.CENTER);
afficheur.setText("" +model.getValeur());
contenu.add( afficheur, BorderLayout.CENTER);

JPanel boutons = new JPanel(new FlowLayout());
contenu.add(boutons,BorderLayout.SOUTH);

JButton bINC = new JButton("INC");
contenu.add(bINC);
JButton bRAZ = new JButton("RAZ");
contenu.add(bRAZ);
JButton bQuitter = new JButton("QUITTER");
contenu.add(bQuitter);
JMenuBar menuBar = new JMenuBar();
JMenu test1 = new JMenu("Fichier");
JMenuItem Quitter = new JMenuItem("Quitter");
test1.add(Quitter);
menuBar.add(test1);
  
JMenu test2 = new JMenu("Modifier");
JMenuItem Incrémenter = new JMenuItem("Incrémenter");
test2.add(Incrémenter);
JMenuItem Décrémenter = new JMenuItem("Décrémenter");
test2.add(Décrémenter);
menuBar.add(test2);
fenetre.setJMenuBar(menuBar);
fenetre.setSize(300,200);
fenetre.setVisible (true); // la rendre visible
bQuitter.addActionListener(controller);
bRAZ.addActionListener(controller);
bINC.addActionListener(controller);
}


    }

  
    

