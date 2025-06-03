package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoutonOKSansEnregistrement extends JButton {

	//Constructeur
	public BoutonOKSansEnregistrement(JFrame fenetreParent) {//Consulter les paramètres d'entrée de la classe parent JButton
		super("OK");
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
			fenetreParent.dispose();
			}
		});
	}
}
