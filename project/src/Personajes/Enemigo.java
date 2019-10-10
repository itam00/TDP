package Personajes;

import Visitor.Visitor;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa;
	
	public Enemigo(int x, int y) {
		super(x,y);
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public int getRecompensa() {
		return recompensa;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	public int limiteRango() {
		return getX()-rango;
	}
	
}
