package Personajes;


import GUI.Mapa;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa;
	protected boolean quieto;
	public Enemigo(int x, int y, Mapa m) {
		super(x,y,m);
		visitor= new VisitorEnemigo(this);
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

	
	public void setQuieto(boolean q) {
		quieto=q;
	}
	
	public boolean getQuieto() {
		return quieto;
	}
	
	public void actualizar() {
		if (!quieto) {
			super.actualizar();
		}
	}
	
	public int getInicioRangoX() {
		return grafico.getX();
	}
	
	public int getFinRangoX() {
		return grafico.getX()-rango*50;
	}
}
