package PowerUps; 

import Graficos.CongeladorEfectoGrafico;
import Graficos.CongeladorGrafico;
import Graficos.GraficoVacio;
import Juego.Mapa;
import Objetos.EscudoInvencible;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import State.CongeladoEnemigo;
import State.CongeladoTorre;
import Tienda.ManejadorCongelacion;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class EscudoInvenciblePlacebo extends PowerUp{

	protected long tiempoCreado;
	
	
	public EscudoInvenciblePlacebo() {
		precio=0;
		grafico = new GraficoVacio();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=5000;
	}

	public void afectar(Torre p) {
		EscudoInvencible nuevo= new EscudoInvencible();
		nuevo.setPos((int)p.getX()+50, (int)p.getY(), p.getMapa()); // el +50 es para que quede justo arriba de la torre
		p.getMapa().agregar(nuevo);
		muerto=true;
	}
	
	public void afectar(Enemigo p) {
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-100;
	}
	
	@Override
	public float getFinRangoX() {
		return x+100;
	}
	

}
