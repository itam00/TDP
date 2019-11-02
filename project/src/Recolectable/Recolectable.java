package Recolectable;
import Juego.Mapa;
import Objetos.Objeto;
import Tienda.ManejadorPowerUp;
import Visitor.Visitor;

public abstract class Recolectable extends Objeto {
	long tiempoCreado;
	
	public Recolectable(int x, int y, Mapa m, ManejadorPowerUp maneja) {
		super(x,y,m);
		tiempoCreado=Long.MAX_VALUE;
	}
	
	public Recolectable() {
		super();
	}
	
	public void accept(Visitor v) {

	}
	public float getInicioRangoX() {
		return x-15;
	}

	@Override
	public float getFinRangoX() {
		return x+15;
	}

}
