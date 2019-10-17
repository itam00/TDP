import Entidad.Elemento;
import Juego.Mapa;

public abstract class Objeto extends Elemento{

	public Objeto(int x, int y, Mapa m) {
		super(x,y, m);
	}

}