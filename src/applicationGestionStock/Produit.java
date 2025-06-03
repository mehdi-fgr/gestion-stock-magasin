
package applicationGestionStock;

import java.io.Serializable;

public abstract class Produit implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nom;
    private int stockMin;
    private int stock;
    private String unite;
    private int reference;

    public Produit(int reference, String nom, int stock, int stockMin, String unite) {
        this.nom = nom;
        this.stock = stock;
        this.stockMin = stockMin;
        this.unite = unite;
        this.reference = reference;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public int getStockmin() { return stockMin; }
    public void setStockmin(int stockmin) { this.stockMin = stockmin; }

    public String getUnite() { return unite; }
    public void setUnite(String unite) { this.unite = unite; }

    public int getReference() { return reference; }
    public void setReference(int reference) { this.reference = reference; }

    public abstract String getCategorie();
    
    public String toString() {
    	return "\n" + nom + " - Référence : " + reference;
    }

}
