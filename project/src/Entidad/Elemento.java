package Entidad;

import EntidadGrafica.ElementoGrafico;
<<<<<<< Updated upstream
=======
import GUI.Mapa;
import State.*;
import Visitor.Visitor;
>>>>>>> Stashed changes

public abstract class Elemento {
	protected ElementoGrafico grafico;
	protected int inicioRangoX, finRangoX;
	protected int inicioRangoY, finRangoY;
	protected boolean muerto;
	protected Mapa mapa;
	
<<<<<<< Updated upstream
	public Elemento(int x,int y) {
	//	this.y = (int)(y/96);
	//	this.x = (int)(x/102.4);
=======
	protected Visitor visitor;
	protected State estado;
	
	
	public Elemento(int x,int y, Mapa m) {
>>>>>>> Stashed changes
		muerto=false;
		mapa=m;
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
	
	public void setMuerto(boolean b) {
		muerto=b;
	}
	
<<<<<<< Updated upstream
=======
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
	
>>>>>>> Stashed changes

	public void actualizar() {
		grafico.actualizar();
		muerto= (muerto==true || grafico.estaMuerto());
		
	}

	
	public Visitor getVisitor() {
		return visitor;
	}
	
}
