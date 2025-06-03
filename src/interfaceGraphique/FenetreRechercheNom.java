package interfaceGraphique;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import applicationGestionStock.Produit;
import applicationGestionStock.Stock;

    public class FenetreRechercheNom extends JFrame {
    	private Stock stock1;
    	
        public FenetreRechercheNom(Stock stock1) {
        	this.stock1 = stock1;
            setTitle("Recherche par nom");
            setSize(400, 350);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JLabel labelNom = new JLabel("Nom");
            labelNom.setBounds(20, 20, 80, 25);
            add(labelNom);

            JTextField champNom = new JTextField();
            champNom.setBounds(110, 20, 200, 25);
            add(champNom);

            JLabel labelProduits = new JLabel("Produits");
            labelProduits.setBounds(20, 60, 80, 25);
            add(labelProduits);

        	DefaultListModel<Produit> modele = new DefaultListModel<>();
        	JList<Produit> listeCliquable = new JList<>(modele);
        	listeCliquable.setBounds(110, 60, 200, 180);
        	add(listeCliquable);
//            JTextArea zoneProduits = new JTextArea();
//            zoneProduits.setBounds(110, 60, 200, 180);
//            add(zoneProduits);
            
            JButton boutonConsulter = new JButton("Consulter");
            boutonConsulter.setBounds(15, 180, 90, 30);
            add(boutonConsulter);
            
            boutonConsulter.addActionListener(e ->  {
            	Produit p = listeCliquable.getSelectedValue();
            	System.out.println(p);
            	new FenetreFicheProduit(p, stock1);
            	dispose();
            });     
            
            JButton boutonChercher = new JButton("Rechercher");
            boutonChercher.setBounds(20, 260, 150, 30);
            add(boutonChercher);
            
            boutonChercher.addActionListener(e ->  {
            	ArrayList<Produit> listeResultats = stock1.rechercherParNom(champNom.getText()); 
            	modele.clear();
            	listeResultats.forEach(modele::addElement);          	
            });      
            
            JButton boutonRetour = new JButton("Retour à l'accueil");
            boutonRetour.setBounds(210, 260, 150, 30);
            add(boutonRetour);

            boutonRetour.addActionListener(e ->  {
                dispose();
                new FenetreAccueil(stock1);
            });

            setVisible(true);
        }

    }


