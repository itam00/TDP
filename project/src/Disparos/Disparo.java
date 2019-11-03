package Disparos;

import Entidad.Elemento;

import Juego.Mapa;
import Visitor.Visitor;

public abstract class Disparo extends Elemento {
	protected int danio;
	protected float velocidad;
	protected float rango;
	
	
	public Disparo(int x, int y, Mapa m,int danio, float rango) {
		super(x, y,m);
		this.danio = danio;
		this.rango=rango*102 ;
	}
	
	public int getDanio() {
		return danio;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	@Override
	public void actualizar() {
		x+=velocidad;
		super.actualizar();
		if(x>rango)
			muerto=true;
	}
	
	public int getAncho() {
		return 0;
	}
	
	
}
