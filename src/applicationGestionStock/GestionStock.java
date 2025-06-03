package applicationGestionStock;

import java.io.Serializable;
import java.util.ArrayList;

public interface GestionStock extends Serializable {

//Méthodes
	
public abstract ArrayList<Produit> rechercherParNom(String nomProduit);


public abstract ArrayList<Produit> rechercherparCategorie(String categorie);


public abstract void ajouterProduit(Produit p);


public abstract void supprimerProduit(Produit p);


public abstract ArrayList<Produit> controleStock(); //Contrôle des stocks bas pour alerte

}