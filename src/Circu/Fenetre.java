package Circu;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fenetre {
	JFrame fenetre;
	JTextField jtf1;
	JTextField jtf2;
	
	public Fenetre(String titre){
		//Création de la fenetre (E)
		fenetre = new JFrame(titre);
		fenetre.setBounds(50, 50, 1300, 200); //Coordonnées x,y et dimensions w,h en pixels (GK)
		
		//Récupération du conteneur de la fenêtre ou on peut mettre les autres elements (E)
		
		Container contenu = fenetre.getContentPane();
		
		//Création du panneau pour mettre les composants (E)
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		contenu.setLayout(new GridLayout(2,1));
		
		//Ajout de tous les elements dans le conteneur rattaché à la fenetre (E)
		contenu.add(jtf1);
		contenu.add(jtf2);
		//fenetre.pack(); //(E)
		fenetre.setVisible(true);
	}
}
