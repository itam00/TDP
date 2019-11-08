package PowerUps;

import Graficos.ElementoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUp;

public class Trampa extends PowerUp{

	public Trampa() {
		direccionGrafico = "/Sprites/moneda.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=-Integer.MAX_VALUE;
	}
	
	@Override
	public void afectar(Enemigo e) {
		e.setMuerto(true);
		muerto=true;
		
	}

	@Override
	public void afectar(Torre t) {
		t.setMuerto(true);
		muerto=true;
	}

	@Override
	public float getInicioRangoX() {
		return x;
	}

	@Override
	public float getFinRangoX() {
		return x+50;
	}

	public void actualizar() {
	}
}
