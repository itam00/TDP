package PowerUps; 

import Graficos.CongeladorEfectoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import State.CongeladoEnemigo;
import State.CongeladoTorre;
import Visitor.VisitorPowerUp;
public class Congelador extends PowerUp{

	protected long tiempoCreado;
	
	
	public Congelador() {
		precio=0;
		grafico = new CongeladorEfectoGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=2000;
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
	

}
