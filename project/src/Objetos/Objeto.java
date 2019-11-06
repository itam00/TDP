package Objetos;
import Entidad.Elemento;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.Visitor;
import Visitor.VisitorObjeto;

public abstract class Objeto extends Elemento{
	protected int vida;

	public Objeto(int x, int y, Mapa m) {
		super(x,y, m);
		visitor= new VisitorObjeto(this);
		vida =0;
	}
	
	public Objeto() {
		super();
	}
	public abstract void afectar(Torre t);

	public abstract void afectar(Enemigo e);
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	public void disminuirVida(int n) {
		vida-=n;
		muerto = vida<=0;
	}

}