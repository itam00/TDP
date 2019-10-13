package Entidad;

import GUI.Mapa;
import PersonajeGrafico.DisparoGrafico;
import Visitor.Visitor;
import Visitor.VisitorDisparo;

public abstract class Disparo extends Elemento {
	protected int danio;
	
	
	public Disparo(int x, int y, Mapa m,int danio) {
		super(x, y,m);
		this.danio = danio;
		visitor = new VisitorDisparo(this);
	}
	
	public int getDanio() {
		return danio;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	/*public void removerDisparo() {
		controlador.remover(this);
	}*/

}
