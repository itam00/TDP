package State;

import Personajes.Personaje;

public class Default implements State{

	protected Personaje p;
	
	public Default(Personaje p) {
		this.p=p;
		p.setDefault();
	}
	
	@Override
	public void actualizar() {
	}

}
