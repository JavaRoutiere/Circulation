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
	
<<<<<<< HEAD

=======
	
	public Generateur(){}
>>>>>>> 550ee20a3971a7c06327a036d02917905c223c82
	public Generateur(boolean c){
		fini = false;
		maxIntervalle = 1700;
		voieBasse = c;
		rnd = new Random();
		maxIntervalle = 1700;
<<<<<<< HEAD
=======
		this.voieBasse = voieBasse;
>>>>>>> 550ee20a3971a7c06327a036d02917905c223c82
	}
	
	public void run(){
		while(!fini){
			Vehicule v = new Vehicule();
			//TODO ?????????
			if(!voieBasse){
				Vehicule.VH.put(60, v);
<<<<<<< HEAD
=======
			
			else
				Vehicule.VB.put(-60, v);
			if(voieBasse){
				Vehicule.VB.put(-60, v);
>>>>>>> 550ee20a3971a7c06327a036d02917905c223c82
				try {
					sleep((int)(Math.random() * maxIntervalle));
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Impossible de générer un véhicule sur la voie basse");
				}
			}
			else{
				Vehicule.VB.put(-60, v);
				try {
					sleep((int)(Math.random() * maxIntervalle));
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Impossible de générer un véhicule sur la voie haute");
				}
			}
			
<<<<<<< HEAD
=======
			
>>>>>>> 550ee20a3971a7c06327a036d02917905c223c82
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
