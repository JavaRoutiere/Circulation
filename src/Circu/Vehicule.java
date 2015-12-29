package Circu;
import java.util.*; 

//test

public class Vehicule extends Thread implements Data{
	//Permet de différencier les véhicules. C'est les identifiants des véhicules.
	static int noC = 1;
	//Permet de savoir sur quel voie on é.
	static Map<Integer, Vehicule> VH,VB = new HashMap<Integer,Vehicule>();
	static List ListeVehicules = new LinkedList();
	
	//On instancie feu pour recupérer le getteur de couleur
	Feu f;
	int pos;
	int no;
	String nom;
	boolean voieBasse;
	
	public Vehicule(){
		no = noC++;
		nom = new Integer(no).toString();
	}
	
	//constructeur pour changer de voie
	
	public void changerVoie(){
		if(pos>-2 && pos<2 && voieBasse &&  f.getCouleur()== "vert" ){
			voieBasse = false;
		}
	}
	
	public void run(){
		while(voieBasse && pos <= Data.R || !voieBasse && pos <= Data.R){
			if(voieBasse){				
				//TODO: Synchronized
				synchronized(new Object()){
					if(VB.get(new Integer(pos+1)) == null){
						if((pos ==-2 && f.getCouleur() == "rouge")||(pos ==2 && f.getCouleur() == "rouge")){
							pos = pos+0;
						}
						else{
						//On avance (E)
						pos = pos+1;
						}
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
				//TODO: Synchronized
				synchronized(new Object()){
					if (VH.get(new Integer(pos-1))==null){
						//On avance (E)
						pos = pos-1;
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
