package PowerUps; 

import Graficos.CongeladorEfectoGrafico;
import Graficos.CongeladorGrafico;

import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import State.CongeladoEnemigo;
import State.CongeladoTorre;
import Tienda.ManejadorCongelacion;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Congelador extends PowerUp{

	protected long tiempoCreado;
	
	
	public Congelador() {
		precio=0;
		grafico = new CongeladorEfectoGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=1000;
	}

	public void afectar(Torre p) {
		p.setState(new CongeladoTorre(p));
	}
	
	public void afectar(Enemigo p) {
		p.setState(new CongeladoEnemigo(p));
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-100;
	}
	
	@Override
	public float getFinRangoX() {
		return x+100;
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>3000)
			muerto=true;
		super.actualizar();
	}

}
