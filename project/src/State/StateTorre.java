package State;

import Personajes.Torre;

public abstract class StateTorre{
	Torre torre;
	
	public StateTorre(Torre t) {
		torre = t;
	}
	public abstract void actualizar();
}
