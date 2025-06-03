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

public class FenetreModifier {

private Stock stock1;
private Produit p;

	public FenetreModifier(Produit p, Stock stock1) {
		this.stock1 = stock1;
		JFrame creationFrame = new JFrame("Modifier un produit");
	    creationFrame.setSize(400, 400);
	    creationFrame.setLocationRelativeTo(null);
	    creationFrame.setLayout(new GridLayout(9, 2));
	    creationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JTextField refField = new JTextField();
	    JTextField nomField = new JTextField();
	    JTextField stockField = new JTextField();
	    JTextField stockMinField = new JTextField();
	    JTextField uniteField = new JTextField();
	    JTextField categorieField = new JTextField();
	    
//	    String[] categories = {"Alimentation", "Fruits Et Légumes", "Autres"};
//	    JComboBox<String> categorieBox = new JComboBox<>(categories);

	    JLabel extraLabel = new JLabel("Date de péremption  :");
	    JTextField extraField = new JTextField();

	    creationFrame.add(new JLabel("Référence:"));
	    creationFrame.add(refField);
	    refField.setText(Integer.toString(p.getReference()));
	    
	    creationFrame.add(new JLabel("Catégorie:"));
	    creationFrame.add(categorieField);
	    categorieField.setText(p.getCategorie());
	    categorieField.setEditable(false);
	    
	    creationFrame.add(new JLabel("Nom:"));
	    creationFrame.add(nomField);
	    nomField.setText(p.getNom());
	    
	    creationFrame.add(new JLabel("Stock:"));
	    creationFrame.add(stockField);
	    stockField.setText(Integer.toString(p.getStock()));
	    
	    creationFrame.add(new JLabel("Stock Min:"));
	    creationFrame.add(stockMinField);
	    stockMinField.setText(Integer.toString(p.getStockmin()));
	    
	    creationFrame.add(new JLabel("Unité:"));
	    creationFrame.add(uniteField);
	    uniteField.setText(p.getUnite());
	    
	    creationFrame.add(extraLabel);
	    creationFrame.add(extraField);

	    JButton enregistrerBtn = new JButton("Modifier");
	    JButton retourBtn = new JButton("Retour à  la page d'accueil");

	    creationFrame.add(enregistrerBtn);
	    creationFrame.add(retourBtn);

	    	if (p.getCategorie().equals("Alimentation")) {
	            extraLabel.setText("Date de péremption:");
	            extraLabel.setVisible(true);
	            extraField.setText(((Alimentation)p).getDatePeremption());
	            extraField.setVisible(true);
	        } else if (p.getCategorie().equals("Fruits Et Légumes")) {
	            extraLabel.setText("Origine:");
	            extraLabel.setVisible(true);
	            extraField.setText(((FruitsEtLegumes)p).getOrigine());
	            extraField.setVisible(true);
	        } else if (p.getCategorie().equals("Autre")) {
	            extraLabel.setVisible(false);
	            extraField.setVisible(false);
	        }
	

	    if (p.getCategorie().equals("Autres")) {
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
	            String cat = p.getCategorie();

	            this.p = switch (cat) {
	                case "Alimentation" -> new Alimentation(ref, nom, stock, stockMin, unites, extra);
	                case "Fruits Et Légumes" -> new FruitsEtLegumes(ref, nom, stock, stockMin, unites, extra);
	                default -> new Autres(ref, nom, stock, stockMin, unites);
	            };
	            new FenetreConfirmerModification(p, stock1);
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
