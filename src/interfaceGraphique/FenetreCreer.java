package interfaceGraphique;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import applicationGestionStock.Alimentation;
import applicationGestionStock.Autres;
import applicationGestionStock.FruitsEtLegumes;
import applicationGestionStock.Produit;
import applicationGestionStock.Stock;

public class FenetreCreer {

private Stock stock1;

public FenetreCreer(Stock stock1) {
	this.stock1 = stock1;
	JFrame creationFrame = new JFrame("Créer un produit");
    creationFrame.setSize(400, 400);
    creationFrame.setLocationRelativeTo(null);
    creationFrame.setLayout(new GridLayout(9, 2));
    creationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField refField = new JTextField();
    JTextField nomField = new JTextField();
    JTextField stockField = new JTextField();
    JTextField stockMinField = new JTextField();
    JTextField uniteField = new JTextField();


    String[] categories = {"Alimentation", "Fruits Et Légumes", "Autres"};
    JComboBox<String> categorieBox = new JComboBox<>(categories);

    JLabel extraLabel = new JLabel("Date de péremption :");
    JTextField extraField = new JTextField();

    creationFrame.add(new JLabel("Référence:"));
    creationFrame.add(refField);
    creationFrame.add(new JLabel("Catégorie:"));
    creationFrame.add(categorieBox);
    creationFrame.add(new JLabel("Nom:"));
    creationFrame.add(nomField);
    creationFrame.add(new JLabel("Stock:"));
    creationFrame.add(stockField);
    creationFrame.add(new JLabel("Stock Min:"));
    creationFrame.add(stockMinField);
    creationFrame.add(new JLabel("Unité:"));
    creationFrame.add(uniteField);
    creationFrame.add(extraLabel);
    creationFrame.add(extraField);

    JButton enregistrerBtn = new JButton("Créer");
    JButton retourBtn = new JButton("Retour à  la page d'accueil");

    creationFrame.add(enregistrerBtn);
    creationFrame.add(retourBtn);

    categorieBox.addItemListener(e -> {
        String selected = (String) categorieBox.getSelectedItem();
        if (selected.equals("Alimentation")) {
            extraLabel.setText("Date de péremption:");
            extraLabel.setVisible(true);
            extraField.setVisible(true);
        } else if (selected.equals("Fruits Et Légumes")) {
            extraLabel.setText("Origine:");
            extraLabel.setVisible(true);
            extraField.setVisible(true);
        } else {
            extraLabel.setVisible(false);
            extraField.setVisible(false);
        }
    });

    if (categorieBox.getSelectedItem().equals("Autres")) {
        extraLabel.setVisible(false);
        extraField.setVisible(false);
    }

    enregistrerBtn.addActionListener(e -> {
        try {
            int ref = Integer.parseInt(refField.getText());
            String nom = nomField.getText();
            int stock = Integer.parseInt(stockField.getText());
            int stockMin = Integer.parseInt(stockMinField.getText());
            String unites = (String) uniteField.getText();
            String extra = extraField.getText();
            String cat = (String) categorieBox.getSelectedItem();

            Produit p = switch (cat) {
                case "Alimentation" -> new Alimentation(ref, nom, stock, stockMin, unites, extra);
                case "Fruits Et Légumes" -> new FruitsEtLegumes(ref, nom, stock, stockMin, unites, extra);
                default -> new Autres(ref, nom, stock, stockMin, unites);
            };
            new FenetreConfirmerCreation(p, stock1);
            }
        
        catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(creationFrame, "Erreur : " + ex.getMessage());
        }
    });

    retourBtn.addActionListener(e -> {
        creationFrame.dispose();
        new FenetreAccueil(stock1);
    });

    creationFrame.setVisible(true);
}
}
