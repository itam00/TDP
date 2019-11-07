package PowerUps;

import Entidad.Comprable;
import Entidad.Elemento; 
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.ManejadorPowerUp;
import Visitor.Visitor;

public abstract class PowerUp extends Elemento implements Comprable{
	protected long duracion;
	protected long tiempoCreado;
	
	public PowerUp() {
		super();
		tiempoCreado=System.currentTimeMillis();
		duracion=1500;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	public int getPrecio() {
		return 0;
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
