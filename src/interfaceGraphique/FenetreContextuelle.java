package interfaceGraphique;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class FenetreContextuelle extends JFrame {
	
//Attributs
protected JPanel panel1;
protected JPanel panel2;
protected JLabel label1;
protected BoutonOKAvecEnregistrement boutonOK;
protected BoutonAnnuler boutonAnnuler;
protected BoutonOKSuppression boutonOKSuppression;

//Constructeur
public FenetreContextuelle() {
	setSize(350,200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
}
	
//Méthodes
public abstract void initUI();


}
