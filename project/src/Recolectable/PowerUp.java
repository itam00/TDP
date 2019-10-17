package Recolectable;

import Entidad.Objeto;
import Juego.Mapa;
import Personajes.Personaje;
import Visitor.Visitor;

public abstract class PowerUp extends Objeto{

	int duracion;
	
	public PowerUp(int x, int y, Mapa m) {
		super(x, y, m);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	public abstract void afectar(Personaje p);
}
