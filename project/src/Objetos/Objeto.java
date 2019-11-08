package Objetos;
import Entidad.Elemento; 
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.Visitor;

public abstract class Objeto extends Elemento{
	protected int vida;

	public Objeto(int x, int y, Mapa m) {
		super(x,y, m);
	}
	
	public Objeto() {
		super();
	}
	public abstract void afectar(Torre t);

	public abstract void afectar(Enemigo e);
	
	public void disminuirVida(int n) {
		vida-=n;
		muerto = vida<=0;
	}

}