package PowerUps; 

import Graficos.ElementoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUp;

public class EscudoInvenciblePlacebo extends PowerUp{

	protected long tiempoCreado;
	
	
	public EscudoInvenciblePlacebo() {
		direccionGrafico= "/Sprites/transparente.gif";
		grafico = new ElementoGrafico(direccionGrafico);
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
		return x-40;
	}
	
	@Override
	public float getFinRangoX() {
		return x+40;
	}
	

}
