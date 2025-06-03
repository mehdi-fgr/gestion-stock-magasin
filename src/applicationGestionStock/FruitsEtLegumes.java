
package applicationGestionStock;

public class FruitsEtLegumes extends Produit {
	
	 private static final long serialVersionUID = 1L;

    private String origine;

    public FruitsEtLegumes(int reference, String nom, int stock, int stockmin, String unite, String origine) {
        super(reference, nom, stock, stockmin, unite);
        this.origine = origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String getCategorie() {
        return "Fruits Et Légumes";
    }

    public String getOrigine() {
    	return origine;
    }
}
