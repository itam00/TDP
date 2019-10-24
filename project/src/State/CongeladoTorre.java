package State;

import Personajes.Personaje;

import Personajes.Torre;

public class CongeladoTorre extends StateTorre{

	long tiempoInicial;
	
	public CongeladoTorre(Torre t) {
		super(t);
		tiempoInicial= System.currentTimeMillis();
		//torre.setVelocidad(0);
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoInicial>5500) {
			torre.setState(new DefaultTorre(torre));
		}	
	}

	@Override
	public void disminuirVida(int n) {
		torre.aplicarDaño(n);
		
	}
	
}
