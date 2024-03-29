package State;

import Personajes.Enemigo;

public abstract class StateEnemigo {
	Enemigo enemigo;
	public StateEnemigo(Enemigo e) {
		enemigo = e;
	}
	public abstract void actualizar();
	
	public void disminuirVida(int n) {
		enemigo.aplicarDaņo(n);
	}
	
	public void ralentizar(){
		enemigo.setState(new RalentizadoEnemigo(enemigo));
	}
}
