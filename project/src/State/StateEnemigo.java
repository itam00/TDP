package State;

import Personajes.Enemigo;

public abstract class StateEnemigo {
	Enemigo enemigo;
	public StateEnemigo(Enemigo e) {
		enemigo = e;
	}
	public abstract void actualizar();
}
