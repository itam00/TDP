package Entidad;

import EntidadGrafica.ElementoGrafico;


public abstract class Elemento {
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
