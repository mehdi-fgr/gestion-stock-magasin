package applicationGestionStock;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Alerte extends JFrame {

//Attributs
private JPanel panel1;
private JLabel texteAlerte;
private JTextArea zoneProduitsBas;
private JButton boutonOk;
private JPanel panelOk;

//Constructeur
public Alerte() {
	super ("Alerte !");
	setSize(400,400);
	setLayout(new BorderLayout());
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	initUI();
	setVisible(true);
}
//Méthodes
private void initUI() {
	//Initialisation du JPanel et des composants
	panel1 = new JPanel(new BorderLayout());
	texteAlerte = new JLabel("Les produits suivants ont un stock bas :");
	texteAlerte.setPreferredSize(new Dimension(100,50));
	zoneProduitsBas = new JTextArea("La liste des produits s'affiche ici");
	boutonOk = new JButton("OK");
	panelOk = new JPanel();
	
	//Ajout des JPanel dans la JFrame, puis ajout des composants dans les JPanel (le bouton OK est ajouté dans son propre JPanel pour ne pas occuper toute la zone "South")
	add(panel1);
	panel1.add(texteAlerte, BorderLayout.NORTH);
	panel1.add(zoneProduitsBas, BorderLayout.CENTER);
	add(panelOk, BorderLayout.SOUTH);
	panelOk.add(boutonOk, BorderLayout.CENTER);
	
	//Comportement du bouton OK
	boutonOk.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed (ActionEvent e) {
		dispose();
		}
	});
	}
}





