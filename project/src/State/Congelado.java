package State;

import Personajes.Personaje;

public class Congelado implements State{

	protected Personaje p;
	protected float velocidad;
	protected int frecuencia;
	long tiempoInicial;
	
	public Congelado(Personaje p) {
		this.p=p;
		tiempoInicial= System.currentTimeMillis();
		p.setVelocidad(0);
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoInicial>5500) {
			p.setState(new Default(p));
			System.out.println("volvi a default");
		}	
	}
	
}
