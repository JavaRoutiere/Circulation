package Circu;

import java.net.InetAddress;
import java.util.Random;

public class Generateur extends Thread{
	static boolean fini;
	private Random rnd;
	private int maxIntervalle;
	static final int port = 6050;
	InetAddress adresse;
	boolean voieBasse;
	
	public Generateur(boolean voieBasse){
		fini = false;
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
