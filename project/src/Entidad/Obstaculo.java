package Entidad;

import Juego.Mapa;
import Personajes.Enemigo;
import Visitor.Visitor;
import Visitor.VisitorObstaculo;

public abstract class Obstaculo extends Objeto {

	protected int vida;
	
	public Obstaculo (int x, int y, Mapa m) {
		super(x,y,m);
		visitor= new VisitorObstaculo(this);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void serAtacado(int n) {
		vida-=n;
		muerto = vida<=0;
	}
	
	public abstract void afectar(Enemigo e);
}
