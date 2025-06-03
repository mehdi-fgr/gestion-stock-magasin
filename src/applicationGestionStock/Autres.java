package applicationGestionStock;

public class Autres extends Produit {

	 private static final long serialVersionUID = 1L;


    public Autres(int reference, String nom, int stock, int stockmin, String unite) {
        super(reference, nom, stock, stockmin, unite);
    }

    @Override
    public String getCategorie() {
        return "Autres";
    }
}
