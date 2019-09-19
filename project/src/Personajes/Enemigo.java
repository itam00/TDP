package Personajes;

import Mapa.Celda;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa;
	
	public Enemigo(int x, int y) {
		super(x,y);
	}
}
