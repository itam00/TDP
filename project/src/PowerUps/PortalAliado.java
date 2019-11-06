package PowerUps;

import Graficos.PortalDerechoEfectoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import State.DefaultEnemigo;
import Visitor.VisitorPowerUp;

public class PortalAliado extends PowerUp{
	
	public PortalAliado() {
		super();
		precio=0;
		grafico = new PortalDerechoEfectoGrafico();
		visitor= new VisitorPowerUp(this);
		duracion=5000;
	}

	@Override
	public void afectar(Enemigo e) {
		e.setPos(1024, (int)e.getY(), mapa);
		e.setState(new DefaultEnemigo(e));
	}
	

	@Override
	public void afectar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getInicioRangoX() {
		return x-10;
	}

	@Override
	public float getFinRangoX() {
		return x+10;
	}

}
