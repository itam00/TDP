package Entidad;

import EntidadGrafica.ElementoGrafico; 
import GUI.Mapa;
import State.*;
import Visitor.Visitor;

public abstract class Elemento {
	protected ElementoGrafico grafico;
	protected int inicioRangoX, finRangoX;
	protected int inicioRangoY, finRangoY;
	protected boolean muerto;
	protected Mapa mapa;

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
	
	
	public Elemento(int x,int y, Mapa m) {
		muerto=false;
		mapa=m;
	}
	
	public void setMuerto(boolean b) {
		muerto=b;
	}

	public abstract void accept(Visitor v); // preguntar
	
	public int getInicioRangoX() {
		return inicioRangoX;
	}
	
	public int getFinRangoX() {
		return finRangoX;
	}
	
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
