package Circu;

import java.net.InetAddress;
import java.util.Random;

public class Generateur extends Thread{
	static boolean fini;
	private Random rnd = new Random();
	private int maxIntervalle;
	static final int port = 6050;
	InetAddress adresse;
	boolean voieBasse;
	
	
	public Generateur(){}
	public Generateur(boolean c){
		fini = false;
		maxIntervalle = 1700;
		voieBasse = c;
		rnd = new Random();
		maxIntervalle = 1700;
		this.voieBasse = voieBasse;
	}
	
	public void run(){
		while(!fini){
			Vehicule v = new Vehicule();
			//TODO ?????????
			if(!voieBasse)
				Vehicule.VH.put(60, v);
			
			else
				Vehicule.VB.put(-60, v);
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
			
			
			v.start();
			try {
				int nbre = (int)(Math.random()*maxIntervalle);
				sleep(nbre);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}
