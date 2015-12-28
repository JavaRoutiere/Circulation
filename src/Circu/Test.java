package Circu;

interface Data{
	int R = 60;
	int F = 1;
	int VISIBILITE = 25;
}
public class Test {
	public static void main(String[] args){
		Generateur g = new Generateur();
		g.start();
		Moniteur m = new Moniteur();
		m.start();
		//System.out.println(new Integer(1).toString());
	}
}
