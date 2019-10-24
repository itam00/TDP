package State;

import Personajes.Personaje;
import Personajes.Torre;

public class DefaultTorre extends StateTorre{
	
	public DefaultTorre(Torre t) {
		super(t);
		torre.setDefault();
	}
	
	@Override
	public void actualizar() {
		torre.obtenerGrafico().actualizar(torre.getX(),torre.getY());
	}

	@Override
	public void disminuirVida(int n) {
		torre.aplicarDaño(n);
		
	}

}
