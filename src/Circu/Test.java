package Circu;

interface Data{
	int R = 60;
	int F = 1;
	int VISIBILITE = 25;
}
public class Test {
	public static void main(String[] args){
		Generateur g1 = new Generateur(true);//pour alimenter la voie basse
		Generateur g2 = new Generateur(false);//pour alimenter la voie haute
		g1.start();
		g2.start();
		Moniteur m = new Moniteur();
		m.start();
		//System.out.println(new Integer(1).toString());
	}
}
