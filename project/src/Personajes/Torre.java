package Personajes;

import Mapa.Celda;

public abstract class Torre extends Personaje{
	protected int precio, tamanio;
	
	public Torre(Celda c) {
		super(c);
	}

}
