package Entidad;

import Juego.Mapa;
import Objetos.Objeto;

public abstract class ObjetoMapa extends Objeto {
	
	public ObjetoMapa(int x, int y, Mapa m) {
		super(x,y,m);
	}

}
