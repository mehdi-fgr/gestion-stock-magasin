package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

import applicationGestionStock.Produit;
import applicationGestionStock.Stock;

public class BoutonOKSuppression extends JButton {

	private Stock stock1;
	private Produit p;
	//Constructeur
	public BoutonOKSuppression(Produit p, Stock stock1, JFrame fenetreParent) {//Consulter les paramètres d'entrée de la classe parent JButton
		super("OK");
		this.stock1 = stock1;
		this.p = p;
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
			//Enregistrement
			stock1.supprimerProduit(p);
			try {
				FileOutputStream fichierOut = new FileOutputStream("stock.txt");
				ObjectOutputStream objetOut = new ObjectOutputStream(fichierOut);
				objetOut.writeObject(stock1);
				System.out.println("Le produit a été supprimé.");
				objetOut.close();
				}
				catch (IOException ex) {
					System.out.println("Erreur !");
					ex.printStackTrace();
				}

			fenetreParent.dispose();
			new FenetreAccueil(stock1);

			}
		});
	}
}
