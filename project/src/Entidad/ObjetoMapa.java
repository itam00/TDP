package Entidad;

import Juego.Mapa;
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.Visitor;
import Visitor.VisitorObjetoMapa;

public abstract class ObjetoMapa extends Objeto {
	
	public ObjetoMapa(int x, int y, Mapa m) {
		super(x,y,m);
		visitor= new VisitorObjetoMapa(this);
	}
	
	public abstract void afectar(Torre t);
	
	public abstract void afectar(Enemigo e);
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
