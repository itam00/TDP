package State;

import Personajes.Torre;

public class AtacandoTorre extends StateTorre {

	public AtacandoTorre(Torre t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actualizar() {
		torre.disparar();
		torre.setState(new DefaultTorre(torre));
	}

}
