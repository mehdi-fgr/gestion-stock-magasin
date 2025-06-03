package applicationGestionStock;

import java.util.ArrayList;

public class Stock implements GestionStock {
	
//Attributs (liste)
private static final long serialVersionUID = 1L;
ArrayList<Produit> listeProduits = new ArrayList<>();

	@Override
	public ArrayList<Produit> rechercherParNom(String nomProduit) {
		ArrayList<Produit> listeResultats = new ArrayList<>();
		for (Produit p : listeProduits) {
			if (p.getNom().equals(nomProduit)) {
				listeResultats.add(p);
			}
		}
		return listeResultats;
	}


	@Override
	public ArrayList<Produit> rechercherparCategorie(String categorie) {
		ArrayList<Produit> listeResultats = new ArrayList<>();
		if (categorie == "Tous") {
			return listeProduits;
		}
		else {
		for (Produit p : listeProduits) {
			if (p.getCategorie().equals(categorie)) {
				listeResultats.add(p);
			}
		}
		}
		return listeResultats;
	}

	@Override
	public void ajouterProduit(Produit p) {
		listeProduits.add(p);

	}

	@Override
	public void supprimerProduit(Produit p) {
		listeProduits.remove(p);

	}
	
	@Override
	public ArrayList<Produit> controleStock() {
		ArrayList<Produit> listeResultats = new ArrayList<>();
		for (Produit p : listeProduits) {
			if (p.getStock() < p.getStockmin()) {
				listeResultats.add(p);
			}
		}
		return listeResultats;
	}

}
