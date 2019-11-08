package PowerUps;

import Graficos.ElementoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;

public class Invencibilidad extends PowerUp {
	
	public Invencibilidad() {
		super();
		direccionGrafico= "/Sprites/veneno.gif";
		grafico = new ElementoGrafico(direccionGrafico);
		tiempoCreado=System.currentTimeMillis();
		duracion=Long.MAX_VALUE; //Este es el unico powerUp que no tiene que desaparecer hasta que colisiona con un enemigo.
	}
	
	public void actualizar() {
		grafico.actualizar(x,y);
		//se redefine el metodo actualizar asi no se controla el tiempo para q ese desaparezca
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
		return x+30;
	}

	
}
