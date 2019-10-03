package Entidad;

import EntidadGrafica.ElementoGrafico;
import Visitor.Visitor;

public abstract class Elemento {
	protected ElementoGrafico grafico;
	//protected int x;
	//protected int y;
	protected boolean muerto;
	
	public Elemento(int x,int y) {
	//	this.y = (int)(y/96);
	//	this.x = (int)(x/102.4);
		muerto=false;
	}
	
	public int getX() {
		return grafico.getX();
	}
	
	public int getY() {
		return grafico.getY();
	}
	
	public int getPosY() {
		return (int)(grafico.getY()/96);
	}
	
	public int getPosX() {
		return (int)(grafico.getX()/102.4);
	}
	
	public int obtenerFila() {
		return (int)(grafico.getY()/96);
	}

	
	public ElementoGrafico obtenerGrafico() {
		return grafico;
	}
	
	public boolean estaMuerto() {
		return muerto;
	}
	

	public void setMuerto(boolean b) {
		muerto=b;
	}
	
	public abstract void accept(Visitor v); // preguntar
	

	public void actualizar() {
		grafico.actualizar();
		muerto= (muerto==true || grafico.estaMuerto());
	}
	
}
