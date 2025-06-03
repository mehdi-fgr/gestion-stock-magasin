package interfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoutonAnnuler extends JButton {

//Constructeur
	public BoutonAnnuler(JFrame fenetreParent) {
		super("Annuler");
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
			fenetreParent.dispose();
			}
		});
	}
	}
