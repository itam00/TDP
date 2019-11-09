package State;

import Personajes.Torre;

public class DefaultTorre extends StateTorre{
	
	public DefaultTorre(Torre t) {
		super(t);
		torre.setDefault();
	}
	
	@Override
	public void actualizar() {
		torre.getGrafico().actualizar(torre.getX(),torre.getY());
	}


}
