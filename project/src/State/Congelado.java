package State;

import Personajes.Personaje;

public class Congelado implements State{

	protected Personaje p;
	protected float velocidad;
	protected int frecuencia;
	float tiempoInicial;
	
	public Congelado(Personaje p) {
		this.p=p;
		tiempoInicial= System.currentTimeMillis();
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoInicial>500) {
			p.setState(new Default(p));
		}	
	}
	
}
