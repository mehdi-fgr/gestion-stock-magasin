package interfaceGraphique;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import applicationGestionStock.Stock;

public class FenetreAccueil extends JFrame {

    private JButton creerBtn, rechercherNomBtn, rechercherCategorieBtn;
    private Stock stock1;
    
    public FenetreAccueil(Stock stock1) {
    	this.stock1 = stock1;
        setTitle("Gestion de Stock");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        creerBtn = new JButton("Créer");
        rechercherNomBtn = new JButton("Rechercher par Nom");
        rechercherCategorieBtn = new JButton("Rechercher par Catégorie");

        creerBtn.addActionListener(e -> {
        	new FenetreCreer(stock1);
            dispose();
        });

        rechercherNomBtn.addActionListener(e -> {
        	new FenetreRechercheNom(stock1);
            dispose();
        });

        rechercherCategorieBtn.addActionListener(e -> {
        	new FenetreRechercheCat(stock1);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(creerBtn);
        panel.add(rechercherNomBtn);
        panel.add(rechercherCategorieBtn);

        add(panel);
        setVisible(true);
    }
}