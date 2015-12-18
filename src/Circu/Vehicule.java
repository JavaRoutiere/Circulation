package Circu;
import java.util.*;

public class Vehicule extends Thread{
	static int noC = 1;
	static Map<Integer, Vehicule> VH,VB = new HashMap<Integer,Vehicule>();
	static List ListeVehicules = new LinkedList();
	
	int pos;
	int no;
	String nom;
	boolean voieBasse;
	
	public Vehicule(){
		no = noC++;
		nom = new Integer(no).toString();
	}
	
	public void run(){
		while(voieBasse && pos <= Data.R || !voieBasse && pos <= Data.R){
			if(voieBasse){
				
				//TODO: TROUVER UN OBJET APPROPRIE POUR SYNCHRONIZED (GK)
				synchronized(new Object()){
					if(VB.get(new Integer(pos+1)) == null){
						//On avance (E)
					}
				}
				try {
					Thread.sleep(150);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
			else{
				//TODO: TROUVER UN OBJET APPROPRIE POUR SYNCHRONIZED (GK)
				synchronized(new Object()){
					if (VH.get(new Integer(pos-1))==null){
						//On avance (E)
					}
				}
				try{
					Thread.sleep(150);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
