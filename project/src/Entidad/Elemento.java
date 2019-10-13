package Entidad;

import EntidadGrafica.ElementoGrafico; 
import GUI.Mapa;
import State.*;
import Visitor.Visitor;


public abstract class Elemento {
	protected ElementoGrafico grafico;
	protected boolean muerto;
	protected Mapa mapa;
	protected int inicioRangoY,finRangoY;
	protected Visitor visitor;
	protected State estado;
	
	
	public Elemento(int x,int y, Mapa m) {
		muerto=false;
		mapa=m;
	}
	
	public Elemento() {
		
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
	
	public abstract int getInicioRangoX();
	
	public abstract int getFinRangoX();
	public int getInicioRangoY() {
		return inicioRangoY;
	}
	
	public int getFinRangoY() {
		return inicioRangoY;
	}

	

	public void actualizar() {
		grafico.actualizar();
		muerto= (muerto==true || grafico.estaMuerto());
	}
	
	public Visitor getVisitor() {
		return visitor;
	}
	
}
