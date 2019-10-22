package Entidad;

import Juego.Mapa;

public abstract class Objeto extends Elemento{

	public Objeto(int x,int y,Mapa m) {
		super(x,y,m);
	}
	public Objeto() {}

	
	public int getInicioRangoY() {
		return inicioRangoY;
	}
	
	
	
	public int getFinRangoY() {
		return finRangoY;
	}
	
	
}
