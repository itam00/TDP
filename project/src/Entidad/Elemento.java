package Entidad;

import EntidadGrafica.ElementoGrafico;


public abstract class Elemento {
	protected ElementoGrafico grafico;
	public Elemento(int x, int y) {}
	public ElementoGrafico obtenerGrafico() {
		return grafico;
	}
	
	
}
