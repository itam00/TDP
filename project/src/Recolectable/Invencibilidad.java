package Recolectable;

import Graficos.EscudoGrafico; 
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Tienda.ManejadorEscudo;

public class Invencibilidad extends PowerUp {
	
	public Invencibilidad (int x, int y, Mapa m, ManejadorEscudo maneja) {
		super(x,y,m,maneja);
		grafico= new EscudoGrafico(maneja);
		tiempoCreado=Long.MAX_VALUE;
	}
	
	public Invencibilidad() {
		super();
		tiempoCreado=System.currentTimeMillis();
		duracion=Long.MAX_VALUE; //Este es el unico powerUp que no tiene que desaparecer hasta que colisiona con un enemigo.
	}
	
	@Override
	public void afectar(Enemigo e) {
		e.setMuerto(true);
		muerto=true;
	}

	@Override
	public void afectar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getInicioRangoX() {
		return x;
	}

	@Override
	public float getFinRangoX() {
		// TODO Auto-generated method stub
		return x+30;
	}

	
}
