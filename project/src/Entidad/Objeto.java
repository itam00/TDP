package Entidad;

import Juego.Mapa;

public abstract class Objeto extends Elemento{

	public Objeto(int x,int y,Mapa m) {
		super(x,y,m);
	}
	public Objeto() {}

	public int getInicioRangoX() {
		return grafico.getX();
	}
	
	public int getInicioRangoY() {
		return inicioRangoY;
	}
	
	public int getFinRangoX() {
		return grafico.getX()+50;
	}
	
	public int getFinRangoY() {
		return finRangoY;
	}
	
	
}
