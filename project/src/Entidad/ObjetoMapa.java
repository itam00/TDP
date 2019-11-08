package Entidad;

import Juego.Mapa;
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;

public abstract class ObjetoMapa extends Objeto {
	
	public ObjetoMapa(int x, int y, Mapa m) {
		super(x,y,m);
	}
	
	public abstract void afectar(Torre t);
	
	public abstract void afectar(Enemigo e);

}
