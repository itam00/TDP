package Entidad;

import Juego.Mapa;

public interface Comprable {
	public abstract int getPrecio();
	public abstract void setPos(int x,int y,Mapa mapa);
}
