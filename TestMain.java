
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit p1= new Alimentation(50,"Biscuit", 50, 10, "pieces", "25-10-2025");
        Produit p2 = new FruitEtLegume(61, "Pomme", 100, 30, "kg", "Mexique");
        Produit p3 = new Autres(36, "TV", 200, 5, "pieces");
        
        afficherProduit(p1);
        afficherProduit(p2);
        afficherProduit(p3);
        

	}
        public static void afficherProduit(Produit p) {
        	
	System.out.println("----- PRODUIT -----");
    System.out.println("Num reference   : " + p.getReference());
    System.out.println("Nom             : " + p.getNom());
    System.out.println("Quantité Stock  : " + p.getStock());
    System.out.println("Stock minimal   : " + p.getStockmin());
    System.out.println("Unité           : " + p.getUnite());
    System.out.println("Categorie       : " + p.getCategorieNom());
    System.out.println( p.getDateOuOrigine());
    System.out.println();
	
        }
   
}
