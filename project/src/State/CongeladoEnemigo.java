package State;

import Personajes.Enemigo;

public class CongeladoEnemigo extends StateEnemigo{

	long tiempoInicial;
	
	public CongeladoEnemigo(Enemigo e) {
		super(e);
		tiempoInicial= System.currentTimeMillis();
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoInicial>3500) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}	
	}
}
