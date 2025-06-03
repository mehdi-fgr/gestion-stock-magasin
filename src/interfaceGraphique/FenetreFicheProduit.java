package interfaceGraphique;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import applicationGestionStock.Alimentation;
import applicationGestionStock.FruitsEtLegumes;
import applicationGestionStock.Produit;
import applicationGestionStock.Stock;

public class FenetreFicheProduit {

private Stock stock1;
private Produit p;

public FenetreFicheProduit(Produit p, Stock stock1) {
	this.stock1 = stock1;
	JFrame creationFrame = new JFrame("Fiche produit");
    creationFrame.setSize(400, 400);
    creationFrame.setLocationRelativeTo(null);
    creationFrame.setLayout(new GridLayout(9, 2));
    creationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField refField = new JTextField();
    refField.setEditable(false);
    refField.setText(Integer.toString(p.getReference()));
    
    JTextField nomField = new JTextField();
    nomField.setEditable(false);
    nomField.setText(p.getNom());
    
    JTextField stockField = new JTextField();
    stockField.setEditable(false);
    stockField.setText(Integer.toString(p.getStock()));
    
    JTextField stockMinField = new JTextField();
    stockMinField.setEditable(false);
    stockMinField.setText(Integer.toString(p.getStockmin()));
    
    JTextField uniteField = new JTextField();
    uniteField.setEditable(false);
    uniteField.setText(p.getUnite());
    
    JTextField categorieField = new JTextField();
    categorieField.setEditable(false);
    categorieField.setText(p.getCategorie());

    JLabel extraLabel = new JLabel("Date:");
    JTextField extraField = new JTextField();

    creationFrame.add(new JLabel("Référence:"));
    creationFrame.add(refField);
    creationFrame.add(new JLabel("Catégorie:"));
    creationFrame.add(categorieField);
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

    JButton modifierBtn = new JButton("Modifier");
    JButton retourBtn = new JButton("Retour à  la page d'accueil");
    JButton supprimerBtn = new JButton("Supprimer");
    creationFrame.add(modifierBtn);
    creationFrame.add(retourBtn);
    creationFrame.add(supprimerBtn);

    if (categorieField.getText().equals("Alimentation")) {
      extraLabel.setText("Date de péremption :");
      extraLabel.setVisible(true);
      extraField.setText(((Alimentation)p).getDatePeremption());
      extraField.setVisible(true);
      extraField.setEditable(false);
  } else if (categorieField.getText().equals("Fruits Et Légumes")) {
      extraLabel.setText("Origine:");
      extraLabel.setVisible(true);
      extraField.setText(((FruitsEtLegumes)p).getOrigine());
      extraField.setVisible(true);
      extraField.setEditable(false);
    }
    else {
        extraLabel.setVisible(false);
        extraField.setVisible(false);
    }

    modifierBtn.addActionListener(e -> {
        creationFrame.dispose();
        new FenetreModifier(p, stock1);
    });

    retourBtn.addActionListener(e -> {
        creationFrame.dispose();
        new FenetreAccueil(stock1);
    });

    supprimerBtn.addActionListener(e -> {
        creationFrame.dispose();
        new FenetreConfirmerSuppression(p, stock1);
    });
    
    creationFrame.setVisible(true);
}

}
