package Entidad;

import Graficos.ElementoGrafico;
import Juego.Mapa;
import State.*;
import Visitor.Visitor;


public abstract class Elemento {
	protected ElementoGrafico grafico;
	protected boolean muerto;
	protected int x,y;
	protected Mapa mapa;
	protected int inicioRangoY,finRangoY;
	protected Visitor visitor;
	protected State estado;
	
	
	public Elemento(int x,int y, Mapa m) {
		muerto=false;
		mapa=m;
		inicioRangoY=y;
		finRangoY=y+96;
		this.x=(int)(x/102)*102;
		this.y=(int)(y/96)*96;
	}
	
	public Elemento() {
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getPosY() {
		return (int)(y/96);
	}
	
	public int getPosX() {
		return (int)(x/102.4);
	}
	
	public int obtenerFila() {
		return (int)(y/96);
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
	
	public void setPos (int x, int y, Mapa m) {
		this.x=x-60;
		this.y=y-110;
		mapa=m;
	}
	
	public int getInicioRangoY() {
		return inicioRangoY;
	}
	
	public int getFinRangoY() {
		return inicioRangoY;
	}

	

	public void actualizar() {
		grafico.actualizar(x,y);
		//muerto= (muerto==true || grafico.estaMuerto());
	}
	
	public Visitor getVisitor() {
		return visitor;
	}
	
}
