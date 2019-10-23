package State;

import Personajes.Enemigo;

public class CongeladoEnemigo extends StateEnemigo{
	protected float velocidad;
	protected int frecuencia;
	long tiempoInicial;
	
	public CongeladoEnemigo(Enemigo e) {
		super(e);
		tiempoInicial= System.currentTimeMillis();
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoInicial>5500) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}	
	}
}
