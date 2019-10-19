package Recolectable;

import Entidad.Objeto;
import Juego.Mapa;
import Personajes.Personaje;
import Visitor.Visitor;

public abstract class PowerUp extends Objeto{

	int duracion,precio;
	
	public PowerUp(int x, int y, Mapa m) {
		super(x, y, m);
	}
	public PowerUp() {}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	public int getPrecio() {
		return precio;
	}
	
	public abstract void afectar(Personaje p);
}
