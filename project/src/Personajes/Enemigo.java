package Personajes;

import Entidad.Celda;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa;
	
	public Enemigo(Celda c) {
		super(c);
	}
	
	
}