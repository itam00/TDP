package State;


import Personajes.Torre;

public class CongeladoTorre extends StateTorre{

	long tiempoInicial;
	
	public CongeladoTorre(Torre t) {
		super(t);
		tiempoInicial= System.currentTimeMillis();
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoInicial>5500) {
			torre.setState(new DefaultTorre(torre));
		}	
	}

	@Override
	public void disminuirVida(int n) {
		torre.aplicarDaņo(n);
		
	}
	
}
