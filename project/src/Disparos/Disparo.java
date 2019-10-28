package Disparos;

import Entidad.Elemento;

import Juego.Mapa;
import Visitor.Visitor;

public abstract class Disparo extends Elemento {
	protected int danio,velocidad;
	
	
	public Disparo(int x, int y, Mapa m,int danio) {
		super(x, y,m);
		this.danio = danio;
	}
	
	public int getDanio() {
		return danio;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	@Override
	public void actualizar() {
		x+=velocidad;
		super.actualizar();
	}
	
	
	
	
	/*public void removerDisparo() {
		controlador.remover(this);
	}*/

}
