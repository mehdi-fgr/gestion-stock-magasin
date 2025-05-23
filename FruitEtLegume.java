
public class FruitEtLegume extends Produit {

	private String origine;
	
    public FruitEtLegume(int reference, String nom, int stock,int stockmin, String unite, String origine) {
    	
		        super(reference, nom, stock,stockmin, unite);
		        this.origine = origine;
		    }
    public String getOrigine() {
		return origine;
	}



	public void setOrigine(String origine) {
		this.origine = origine;
	}



    

    
    public String getCategorieNom() {
        return "Fruit et legume";
    }

    
    public String getDateOuOrigine() {
		return "Origine       : " + origine;
	}
   
}
