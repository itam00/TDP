package Objetos;

import Entidad.Comprable;
import Juego.Mapa;
import Visitor.Visitor;
import Visitor.VisitorObstaculo;

public abstract class Obstaculo extends Objeto implements Comprable{

	public Obstaculo(int x, int y, Mapa m) {
		super(x,y, m);
		visitor= new VisitorObstaculo(this);
	}
	
	public Obstaculo() {		
		visitor= new VisitorObstaculo(this);
	}
	
	@Override
	public int getPrecio() {
		return 100;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
