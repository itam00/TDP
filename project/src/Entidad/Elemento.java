package Entidad;

import EntidadGrafica.ElementoGrafico;

public abstract class Elemento {
	protected ElementoGrafico grafico;
	//protected int x;
	//protected int y;
	protected boolean muerto=false;
	
	public Elemento(int x,int y) {
	//	this.y = (int)(y/96);
	//	this.x = (int)(x/102.4);
	}
	
	public int getPosY() {
		return (int)(grafico.getY()/96);
	}
	
	public int getPosX() {
		return (int)(grafico.getX()/102.4);
	}

	
	public ElementoGrafico obtenerGrafico() {
		return grafico;
	}
	
	public boolean estaMuerto() {
		return muerto;
	}
	

	public abstract void actualizar();

	
}
