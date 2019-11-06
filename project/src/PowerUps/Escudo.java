package PowerUps;


import Graficos.EscudoEfectoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import State.ProtegidoTorre;
import Visitor.VisitorPowerUp;

public class Escudo extends PowerUp{

	protected long tiempoCreado;
	
	public Escudo() {
		precio=0;
		grafico = new EscudoEfectoGrafico();
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
