package Entidad;

import GUI.Mapa;
import PersonajeGrafico.DisparoGrafico;

public abstract class Disparo extends Elemento {
<<<<<<< Updated upstream

	public Disparo(int x, int y) {
		super(x, y);
=======
	
	protected int danio;
	
	public Disparo(int x, int y, Mapa m) {
		super(x, y,m);
>>>>>>> Stashed changes
	}
	
	/*public void removerDisparo() {
		controlador.remover(this);
	}*/

}
