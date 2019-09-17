package Entidad;

import Mapa.Celda;

public abstract class Elemento {
	protected Celda celda;
	
	public Elemento(Celda c) {
		celda = c;
	}
	
	public Celda getCelda() {
		return celda;
	}
	
}
