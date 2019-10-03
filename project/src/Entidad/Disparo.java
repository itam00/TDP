package Entidad;

import PersonajeGrafico.DisparoGrafico;

public abstract class Disparo extends Elemento {
	
	protected int danio;
	
	public Disparo(int x, int y) {
		super(x, y);
	}
	
	public int getDanio() {
		return danio;
	}
	
	/*public void removerDisparo() {
		controlador.remover(this);
	}*/

}
