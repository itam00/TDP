package PowerUps; 

import Graficos.ElementoGrafico;

import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUp;

public class Fuego extends PowerUp{

	protected long tiempoCreado,ultimoAfectar;
	protected int frecuencia,da�o;
	
	public Fuego() {
		direccionGrafico = "/Sprites/fuego.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=7500;
		ultimoAfectar=0;
		frecuencia=200;
		da�o=2;
	}

	public void afectar(Torre p) {
		boolean puede=System.currentTimeMillis()-ultimoAfectar>frecuencia;
		if(puede) {
			ultimoAfectar = System.currentTimeMillis();
			p.disminuirVida(da�o);
		}
	}
	
	public void afectar(Enemigo p) {
		boolean puede=System.currentTimeMillis()-ultimoAfectar>frecuencia;
		if(puede) {
			ultimoAfectar = System.currentTimeMillis();
			p.disminuirVida(da�o);
		}
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-70;
	}
	
	@Override
	public float getFinRangoX() {
		return x+70;
	}

}
