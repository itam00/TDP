package Objetos;

import Graficos.TrampaGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Visitor.VisitorPowerUp;

public class Trampa extends PowerUp{

	public Trampa() {
		grafico = new TrampaGrafico();
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
