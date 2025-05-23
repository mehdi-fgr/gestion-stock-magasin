
public class Autres extends Produit {

	 public Autres(int reference, String nom, int stock,int stockmin, String unite) {
	    	
	        super(reference, nom, stock,stockmin, unite);
	    }
	 
	 public String getCategorieNom() {
	        return "Autres";
	    }

	 
	    public String getDateOuOrigine() {
			return " ";
		}
}
