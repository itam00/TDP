package PowerUps;

import Personajes.Enemigo;
import Personajes.Torre;

public class Invencibilidad extends PowerUp {
	
	public Invencibilidad() {
		super();
		tiempoCreado=System.currentTimeMillis();
		duracion=Long.MAX_VALUE; //Este es el unico powerUp que no tiene que desaparecer hasta que colisiona con un enemigo.
	}
	
	public void actualizar() {
		
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
