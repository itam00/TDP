package State;

import Personajes.Enemigo;

public class DefaultEnemigo extends StateEnemigo{
	public DefaultEnemigo(Enemigo e) {
		super(e);
		enemigo.setDefault();
	}
	
	@Override
	public void actualizar() {
		enemigo.mover();
	}
	
	
}
