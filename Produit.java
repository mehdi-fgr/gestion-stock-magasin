
public abstract class Produit {

    private String nom;
    private int  stockmin;
    private int stock;
    private String unite;
    private int reference;


  public Produit(int reference, String nom,int stock,int stockmin,String unite) {

       this.nom = nom;
       this.stock = stock;
       this.stockmin = stockmin;
       this.unite = unite;
       this.reference = reference;
   }


     public String getNom() {
        return nom;
    }


     public void setNom(String nom) {
        this.nom = nom;
    }


    public int getStock() {
        return stock;
   }


    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getStockmin() {
		return stockmin;
	}


	public void setStockmin(int stockmin) {
		this.stockmin = stockmin;
	}

     public String getUnite() {
        return unite;
    }


     public void setUnite(String unite) {
       this.unite = unite;
    }


      public int getReference() {
        return reference;
    }


     public void setReference(int reference) {
        this.reference = reference;
    }


     public abstract String getCategorieNom(); 
     
     public abstract String getDateOuOrigine();


	
    

}
