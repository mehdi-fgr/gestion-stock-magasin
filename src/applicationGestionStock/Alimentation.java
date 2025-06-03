package applicationGestionStock;

public class Alimentation extends Produit {
	
	 private static final long serialVersionUID = 1L;

    private String datePeremption;

    public Alimentation(int reference, String nom, int stock, int stockmin, String unite, String datePeremption) {
        super(reference, nom, stock, stockmin, unite);
        this.datePeremption = datePeremption;
    }

    public void setDate(String datePeremption) {
        this.datePeremption = datePeremption;
    }

    @Override
    public String getCategorie() {
        return "Alimentation";
    }

    public String getDatePeremption() {
    	return datePeremption;
    }

}
