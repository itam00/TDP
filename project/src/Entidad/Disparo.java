package Entidad;

import GUI.Mapa;
import PersonajeGrafico.DisparoGrafico;
import Visitor.Visitor;

public abstract class Disparo extends Elemento {
	protected Visitor visitor;
	
	protected int danio;
	
	
	public Disparo(int x, int y, Mapa m) {
		super(x, y,m);
	}
	
	public int getDanio() {
		return danio;
	}
	
	/*public void removerDisparo() {
		controlador.remover(this);
	}*/

}
