package State;

import Personajes.Enemigo;

public class RalentizadoEnemigo extends StateEnemigo {

	protected long tiempoInicial;
	
	public RalentizadoEnemigo(Enemigo e) {
		super(e);
		e.setVelocidad(e.getVelocidad()/2);
		tiempoInicial=System.currentTimeMillis();
	}

	@Override
	public void actualizar() {
		enemigo.mover();
		if (System.currentTimeMillis()-tiempoInicial>7500) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}	
	}
	
	public void ralentizar() {
	}

}
