package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreConfirmerModification extends FenetreContextuelle {


		//Constructeur
			public FenetreConfirmerModification() {
			super();
		}



			@Override
			public void initUI() {
				panel1 = new JPanel(new BorderLayout());
				add(panel1);
				label1 = new JLabel("Le produit a été modifié. Voulez-vous enregistrer ?");
				label1.setPreferredSize(new Dimension (100,50));
				panel1.add(label1, BorderLayout.NORTH);
				panel2 = new JPanel(new FlowLayout());
				add(panel2, BorderLayout.SOUTH);
				boutonOK = new BoutonOKAvecEnregistrement(this);
				panel2.add(boutonOK);
				boutonAnnuler = new BoutonAnnuler(this);
				panel2.add(boutonAnnuler);
				

			}

		}
