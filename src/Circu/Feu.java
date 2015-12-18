package Circu;

public class Feu extends Thread{
	String nom;
	String couleur;
	void changerCouleur(){
		if(couleur.equals("vert"))
			couleur="rouge";
		else
			couleur = "vert";
	}
}
