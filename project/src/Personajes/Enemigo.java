package Personajes;


import Entidad.Elemento;
import GUI.Mapa;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa,velocidad;
	protected boolean quieto;
	protected Elemento ultimoAtacado;
	public Enemigo(int x, int y, Mapa m) {
		super(x,y,m);
		mapa = m;
		ultimoAtacado=null;
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

	
	public int getInicioRangoX() {
		return grafico.getX();
	}
	
	public int getFinRangoX() {
		return grafico.getX()-rango*50;
	}
	
	public Elemento getUltimoAtacado() {
		return ultimoAtacado;
	}
	public void setUltimoAtacado(Elemento e) {
		ultimoAtacado = e;
	}
	@Override
	public void actualizar() {	
		if (!quieto) {
			x-=velocidad;
		}
		else {
			if(ultimoAtacado.estaMuerto()) {//SI ESTOY QUIETO SE SUPONE QUE MI ULTIMO
				ultimoAtacado=null;			//ENEMIGO ES NULO
				quieto=false;
			}
		}
		super.actualizar();
	}
}
