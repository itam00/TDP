package PowerUps;


import Graficos.ElementoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import State.ProtegidoTorre;
import Visitor.VisitorPowerUp;

public class Escudo extends PowerUp{

	protected long tiempoCreado;
	
	public Escudo() {
		direccionGrafico= "/Sprites/escudoPowerUp.gif";
		grafico = new ElementoGrafico(direccionGrafico);
		visitor= new VisitorPowerUp(this);
		tiempoCreado= System.currentTimeMillis();
	}

	public void afectar(Torre p) {
		p.setState(new ProtegidoTorre(p));
		muerto=true;
	}
	
	public void afectar(Enemigo p) {
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-80;
	}
	@Override
	public float getFinRangoX() {
		return x+80;
	}
}
