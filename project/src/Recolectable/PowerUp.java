package Recolectable;

import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import Tienda.ManejadorPowerUp;
import Tienda.Tienda;
import Visitor.Visitor;

public abstract class PowerUp extends Recolectable{

	protected int duracion,precio;
	long tiempoCreado;
	
	public PowerUp(int x, int y, Mapa m, ManejadorPowerUp maneja) {
		super(x, y, m);
		tiempoCreado=Long.MAX_VALUE;
	}
	
	public PowerUp() {
		super();
		tiempoCreado=System.currentTimeMillis();
		duracion=1000;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public abstract void afectar(Enemigo e);
	
	public abstract void afectar(Torre t);
	
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>duracion) {
			muerto=true;
		}
		muerto=(muerto || grafico.estaMuerto());
		super.actualizar();
	}
	
}
