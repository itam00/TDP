package Objetos;

import Graficos.BarreraGrafico; 
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Visitor.VisitorPowerUp;

public class BarreraTemporal extends PowerUp{
	
	protected int vida;
	
	public BarreraTemporal(){
		super();
		grafico = new BarreraGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=7500;
	}

	@Override
	public void afectar(Enemigo e) {
		
	}

	@Override
	public void afectar(Torre t) {
		
	}

	@Override
	public float getInicioRangoX() {
		return x;
	}

	@Override
	public float getFinRangoX() {
		return x+50;
	}

}
