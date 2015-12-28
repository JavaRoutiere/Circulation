package Circu;


import java.util.Random;

public class Generateur extends Thread{
	static boolean fini;
	private Random rnd = new Random();
	private int maxIntervalle;
	boolean voieBasse;
	
	public Generateur(){}
	public Generateur(boolean c){
		fini = false;
		maxIntervalle = 1700;
		voieBasse = c;
	}
	
	public void run(){
		while(!fini){
			Vehicule v = new Vehicule();
			if(voieBasse){
			Vehicule.VB.put(-60, v);
				try {
					sleep((int)(Math.random() * maxIntervalle));
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Impossible de générer un véhicule sur la voie basse");
				}
			}else{
				Vehicule.VH.put(60, v);
				try {
					sleep((int)(Math.random() * maxIntervalle));
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Impossible de générer un véhicule sur la voie haute");
				}
			}
			
		
			//TODO ?????????
			
			
			v.start();
		}
	}
}
