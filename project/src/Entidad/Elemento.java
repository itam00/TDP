package Entidad;

import EntidadGrafica.ElementoGrafico;
import Mapa.Celda;

public abstract class Elemento {
	protected int posY,posX;
	protected ElementoGrafico grafico;
	
	public Elemento(int x,int y) {
		posY = y;
		posX = x;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public ElementoGrafico obtenerGrafico() {
		return grafico;
	}
	
	public abstract void actualizar();
	
}
