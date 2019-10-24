package Recolectable;

import Entidad.Objeto;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import Tienda.ManejadorPowerUp;
import Tienda.Tienda;
import Visitor.Visitor;

public abstract class PowerUp extends Objeto{

	protected int duracion,precio;
	
	public PowerUp(int x, int y, Mapa m, ManejadorPowerUp maneja) {
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
	
	public abstract void afectar(Enemigo e);
	
	public abstract void afectar(Torre t);
	
	public abstract void agregar(Tienda tienda);
	
	public void actualizar() {
		muerto=(muerto || grafico.estaMuerto());
		super.actualizar();
	}
}
