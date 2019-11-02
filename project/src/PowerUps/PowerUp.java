package PowerUps;

import Entidad.Elemento;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import Recolectable.Recolectable;
import Tienda.ManejadorPowerUp;
import Tienda.Tienda;
import Visitor.Visitor;

public abstract class PowerUp extends Elemento{
	long tiempoCreado;

	protected int duracion,precio;

	
	
	
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
