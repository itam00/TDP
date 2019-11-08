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
		this.rango=rango;
	}
	/**
	 * retorna el daño que realiza el disparo este depende de la torre que lo
	 * use.
	 * @return daño del disparo
	 */
	
	public int getDanio() {
		return danio;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	/**
	 * dezplaza el elemento segun la velocidad del mismo y actualiza su grafico
	 * 
	 */
	@Override
	public void actualizar() {
		x+=velocidad;
		rango-=velocidad;
		super.actualizar();
		if(rango<=0) {
			muerto=true;
		}
		
	}
	
	
	public int getAncho() {
		return 0;
	}
	
	public void disminuirVida(int v) {
	}
	
	
}
