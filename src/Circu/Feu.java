package Circu;

public class Feu extends Thread implements Data{
	String nom;
	String couleur;
	
	//Initialisation de feu TODO
	
	public Feu(String nom){
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	void changerCouleur(){
		if(couleur.equals("vert"))
			couleur="rouge";
		else
			couleur = "vert";
	}
}
