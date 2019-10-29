package Entidad;

import Juego.Mapa;
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;
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
	public abstract void afectar(Torre t);
	
	public abstract void afectar(Enemigo e);
	
	public void disminuirVida(int n) {
		vida-=n;
		muerto = vida<=0;
	}
}
