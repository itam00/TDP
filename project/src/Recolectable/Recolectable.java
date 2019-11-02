package Recolectable;
import Juego.Mapa;
import Objetos.Objeto;

public abstract class Recolectable extends Objeto {

	public Recolectable(int x, int y, Mapa m) {
		super(x,y,m);
	}
	
	public Recolectable() {
		super();
	}

}
