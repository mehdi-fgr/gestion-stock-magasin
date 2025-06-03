package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import applicationGestionStock.Produit;
import applicationGestionStock.Stock;

public class FenetreAlerte extends JFrame {

//Attributs
private JPanel panel1;
private JLabel texteAlerte;
private JTextArea zoneProduitsBas;
private BoutonOKSansEnregistrement boutonOk;
private JPanel panelOk;
private Stock stock1;

//Constructeur
public FenetreAlerte(Stock stock1) {
	super ("Alerte !");
	this.stock1 = stock1;
	setSize(400,400);
//	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	alerteStock();
	initUI();
	setVisible(true);
}


//Méthodes

private String alerteStock() { //Génération d'une String listant les produits avec stock bas
	ArrayList<Produit> listeResultats = stock1.controleStock(); 
	String Resultats ="";
	for (Produit p : listeResultats) {
		Resultats = Resultats + "\nNom : " + p.getNom() + "\nRéférence : " + p.getReference() + "\nStock actuel : " + p.getStock() + "\nStock minimal : " + p.getStockmin() + "\n ***";
	}
	return Resultats;
	
}
private void initUI() {
	//Initialisation du JPanel et des composants
	panel1 = new JPanel(new BorderLayout());
	texteAlerte = new JLabel("Les produits suivants ont un stock bas :");
	texteAlerte.setPreferredSize(new Dimension(100,50));
	zoneProduitsBas = new JTextArea(alerteStock());
	boutonOk = new BoutonOKSansEnregistrement(this);
	panelOk = new JPanel();
	
	//Ajout des JPanel dans la JFrame, puis ajout des composants dans les JPanel 
	//(le bouton OK est ajouté dans son propre JPanel pour ne pas occuper toute la zone "South")
	add(panel1);
	panel1.add(texteAlerte, BorderLayout.NORTH);
	panel1.add(zoneProduitsBas, BorderLayout.CENTER);
	add(panelOk, BorderLayout.SOUTH);
	panelOk.add(boutonOk, BorderLayout.CENTER);
	
}


//Contrôle du stock de chaque produit

	}






