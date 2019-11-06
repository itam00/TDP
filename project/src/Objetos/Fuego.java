package Objetos; 

import Graficos.FuegoGrafico;

import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Visitor.VisitorPowerUp;

public class Fuego extends PowerUp{

	protected long tiempoCreado,ultimoAfectar;
	protected int frecuencia;
	
	public Fuego() {
		grafico = new FuegoGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=7500;
		ultimoAfectar=0;
		frecuencia=200;
	}

	public void afectar(Torre p) {
		boolean puede=System.currentTimeMillis()-ultimoAfectar>frecuencia;
		if(puede) {
			ultimoAfectar = System.currentTimeMillis();
			p.disminuirVida(2);
		}
	}
	
	public void afectar(Enemigo p) {
		boolean puede=System.currentTimeMillis()-ultimoAfectar>frecuencia;
		if(puede) {
			ultimoAfectar = System.currentTimeMillis();
			p.disminuirVida(2);
		}
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
