package Personajes;

import Visitor.Visitor;

public abstract class Torre extends Personaje{
	
	protected int precio, tamanio;
	public Torre(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}



}
