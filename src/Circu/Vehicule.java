package Circu;
import java.util.*; 

//test

public class Vehicule extends Thread implements Data{
	//Permet de différencié les véhicules. C'est les identifiants des véhicules.
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
	
	public String toString() {
		   return "Véhicule " + this.nom +
			  " : est a la position " + this.pos;
		}
	
	//constructeur pour changer de voie
	
	public void changerVoie(){
		if(pos==-2 && voieBasse &&  f.getCouleur()== "vert" ){
			voieBasse = false;
			VH.put(pos, this);
			VB.remove(pos);
			
		}else{
			if(pos ==2 && !voieBasse){
			voieBasse = true;
			VB.put(pos,  this);
			VH.remove(pos);
			}	
		}
	}
	
	public void run(){
		while(voieBasse && pos <= Data.R || !voieBasse && pos <= Data.R){
<<<<<<< HEAD
			if(voieBasse){		
=======
			if(voieBasse){
				
>>>>>>> 550ee20a3971a7c06327a036d02917905c223c82
				//TODO: Synchronized
				synchronized(VB){
					if(VB.get(new Integer(pos+1)) == null){
						if(pos ==-2 && f.getCouleur() == "rouge"){
							pos = pos+0;
							
							//System.out.println(VB.put(pos, this));
						}
						else{
							if(pos < -2){
						//On avance (E)
						pos = pos++;
						VB.put(pos, this);
						VB.remove(pos--);
							}else{
								changerVoie();
							}
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
				if(!voieBasse){
				synchronized(VH){
					if (VH.get(new Integer(pos-1)) == null){
						//On avance (E)
						if(pos ==2 && f.getCouleur() == "rouge"){
							pos = pos+0;
							VH.put(pos, this);
							//System.out.println(VB.put(pos, this));
						}else{
							//On avance (E)
							pos = pos--;
							
							VH.put(pos, this);
							VB.remove(pos+1);
						}
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
}
