package Circu;


import java.util.Random;

public class Generateur extends Thread{
	static boolean fini;
	private Random rnd;
	private int maxIntervalle;
	
	public Generateur(){
		fini = false;
		rnd = new Random();
		maxIntervalle = 1700;
	}
	
	public void run(){
		while(!fini){
			Vehicule v = new Vehicule();
			//TODO ?????????
			//ALL YOUR BASE ARE BELONG TO US     (GK)
			//PROFIT!!!
			
			v.start();
		}
	}
}
