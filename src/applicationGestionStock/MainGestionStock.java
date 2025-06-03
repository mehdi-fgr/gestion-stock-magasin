
package applicationGestionStock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import interfaceGraphique.FenetreAccueil;
import interfaceGraphique.FenetreAlerte;

public class MainGestionStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Création d'un objet Stock

Stock stock1 = new Stock();


//Lecture du fichier

		try {
		FileInputStream fichierIn = new FileInputStream("stock.txt");
		ObjectInputStream objetIn = new ObjectInputStream(fichierIn);
		stock1 = (Stock)objetIn.readObject();
		System.out.println("Lecture réussie !");
		objetIn.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Fichier introuvable !");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Erreur d'E/S !");
			e.printStackTrace();		
		}
		catch (ClassNotFoundException e) {
			System.out.println("Erreur !");
			e.printStackTrace();
		}
		

//Test fenetre Alerte
new FenetreAccueil(stock1);
new FenetreAlerte(stock1);
	}

}