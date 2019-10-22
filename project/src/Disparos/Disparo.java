package Disparos;

import Entidad.Elemento;
import Graficos.DisparoGrafico;
import Juego.Mapa;
import Visitor.Visitor;
import Visitor.VisitorDisparo;

public abstract class Disparo extends Elemento {
	protected int danio,velocidad;
	
	
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
	@Override
	public void actualizar() {
		x+=velocidad;
		super.actualizar();
	}
	
	
	
	
	/*public void removerDisparo() {
		controlador.remover(this);
	}*/

}
