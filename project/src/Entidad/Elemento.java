package Entidad;

import java.util.LinkedList;
import java.util.List;

import Graficos.ElementoGrafico;
import Juego.Mapa;
import Visitor.Visitor;


public abstract class Elemento {
	protected ElementoGrafico grafico;
	protected boolean muerto;
	protected float x,y;
	protected int cantFilas;
	protected Mapa mapa;
	protected Visitor visitor;
	protected List<Integer> filas;
	protected String direccionGrafico;
	
	public Elemento(int x,int y, Mapa m) {
		muerto=false;
		mapa=m;
		this.x=(int)(x/102)*102;
		this.y=(int)(y/96)*96;
		cantFilas=1;
		
		int fila= (int)(y/96); //Es la fila donde se encuentra el y pasado por parametro
		filas= new LinkedList<Integer>();
		for (int i=fila;i<fila+cantFilas;i++) {
			filas.add(i);
		}
	}
	
	public Elemento() {
		cantFilas=1;
		filas= new LinkedList<Integer>();
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public List<Integer> getFilas() {
		return filas;
	}
	/**
	 * retorna el ancho que ocupa el grafico de un elemento en la pantalla
	 * @return ancho del elemento 
	 */
	
	public int getAncho() {
		return grafico.getAncho();
	}
	
	public int getCantFilas() {
		return cantFilas;
	}

	
	public ElementoGrafico obtenerGrafico() {
		return grafico;
	}
	
	public boolean estaMuerto() {
		return muerto;
	}
	
	public Mapa getMapa() {
		return mapa;
	}
	

	public void setMuerto(boolean b) {
		muerto=b;
	}

	public abstract void accept(Visitor v); // preguntar
	
	public abstract float getInicioRangoX();
	
	public abstract float getFinRangoX();
	
	public void setPos (int x, int y, Mapa m) {
		this.x=x-50; // por defecto es x-50 porque solo las torres tienen el formateo para que queden en "celdas" (se redefine en torre)
		this.y=(int)(y/96)*96;
		int fila= (int)(y/96); //Es la fila donde se encuentra el y pasado por parametro
		for (int i=fila;i<fila+cantFilas;i++) {
			filas.add(i);
		}
		mapa=m;
	}

	
	/**
	 * actualiza el grafico del elemento segun la posicion logica del mismo
	 */
	public void actualizar() {
		grafico.actualizar(x,y);
	}
	
	/**
	 * retorna el visitor del elemento
	 * @return visitor del elemento
	 */
	public Visitor getVisitor() {
		return visitor;
	}
	 /**
	  * disminuye la vida del elemento si es posible
	  * @param n vida a disminuir en el elemento
	  */
	public abstract void disminuirVida(int n);
	
}
