package Circu;

public class Moniteur extends Thread{
	
	static Fenetre f = new Fenetre("Route");
	
	public void run(){
		while(true){
			affiche();
			try{
				Thread.sleep(2000);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	void affiche(){
		Vehicule x;
		String vb = "";
		for(int i= -Data.R; i <= Data.R; i++){
			x = Vehicule.VH.get(i);
			if(x != null){
				System.out.println((x.no)%10);
			}else{
				System.out.println("_");
				}
			}
		System.out.println();
		for(int i= -Data.R; i <= Data.R; i++){
			x = Vehicule.VB.get(i);
			if(x != null){
				System.out.print((x.no)%10);
				vb+=(x.no)%10;
			}else{
				System.out.println("_");
				vb+="_";
				}
		Moniteur.f.jtf2.setText(vb);
		System.out.println();
	}
  }
}
