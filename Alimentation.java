public class Alimentation extends Produit {
     
	private String date;
	
    public Alimentation(int reference, String nom, int stock, int stockmin, String unite, String date) {
        super(reference, nom, stock,stockmin, unite);
        this.date = date;
    }
    

	public void setDate(String date) {
		this.date = date;
	}



	@Override
    public String getCategorieNom() {
        return "Alimentation";
    } 
    
    public String getDateOuOrigine() {
		return "Date de peremption   : " + date;
	}



}
