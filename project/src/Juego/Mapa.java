package Juego;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import Entidad.Elemento;
import GUI.GUI;
import Tienda.Tienda;

public class Mapa{
	public final int cantFilas = 6;
	protected List<Elemento>[] entidades;
	protected ImageIcon fondo;
	protected GUI gui;
	protected List<Elemento> porAgregar;
	protected Tienda tienda;
	protected int enemigosDerrotados;
	
	@SuppressWarnings("unchecked")
	public Mapa(GUI g, Tienda t) {
		gui = g;
		tienda=t;
		enemigosDerrotados =0;

		entidades = (List<Elemento>[]) new LinkedList[cantFilas];
		porAgregar = new LinkedList<Elemento>();
		for(int i=0;i<entidades.length;i++) {
			entidades[i] = new LinkedList<Elemento>();
		}
	}
	
	public synchronized void actualizar() {
		Elemento aux;
		
		for(int i=0;i<entidades.length;i++) {
			Iterator<Elemento> it = entidades[i].iterator();
		
			while(it.hasNext()) {
				aux = it.next();
				aux.actualizar();
				if(aux.estaMuerto()) {
					it.remove();
					gui.eliminar(aux);
				}
				else {
					verificarColision(aux);
				}
			}
		}
		
		for(Elemento e: porAgregar) {
			for (int fila:e.getFilas()) {
				entidades[fila].add(e);
			}
			gui.añadirElemento(e);
		}
		porAgregar.clear();

	}
	
	/**
	 * Verifica si x e y coincide con cualquiera de las POSICIONES de los elementos en la fila
	 * @param x 
	 * @param y
	 * @return En caso de que la posicion este ocupada retorna true y falso en caso contrario
	 */
	
	public boolean coincidePosicion(int x,int fila) {
		boolean coincide = false;
		Iterator<Elemento> it = entidades[fila].iterator();
		Elemento aux;
		int ancho;
		
		
		while(it.hasNext() && !coincide) {
			aux = it.next();
			ancho= aux.getAncho();
			coincide = aux.getX()<= x && aux.getX()+ancho>=x;
		}
		
		return coincide;
	}
	
	public boolean puedoPoner(Elemento e, int x, int y) {
		int fila= y/96;
		boolean puedo=true;
		
		for(int i=fila;i<fila+e.getCantFilas() && puedo;i++) {
			puedo = i<6 && !coincidePosicion(x,i);
		}
		
		return puedo;
		
	}

	/**
	 * Verifica si el elemento e "colisiona" con otro elemento en su fila segun el rango del elemento
	 * @param e elemento a partir del cual se verica la colision
	 */
	public void verificarColision(Elemento e) {
		boolean colisiona1 = false;
		for (int fila:e.getFilas()) {
			Iterator<Elemento> it = entidades[fila].iterator();
			Elemento aux;
			while(it.hasNext() ) {
				colisiona1 = false;
				aux = it.next();
				if (e!=aux) {
					colisiona1 = estaEnRango(e,aux);
					if(colisiona1) {
						aux.accept(e.getVisitor());
					}
				}
			}
		}
	}
	/**
	 * Computa si el elmento destino esta en el rango del elemento origen
	 * @param origen elemento a partir del cual se obtendra el rango
	 * @param destino elemento al que se verifica si esta en rango o no del origen
	 * @return true en el caso de que este en rango false caso contrario
	 */
	public boolean estaEnRango(Elemento origen,Elemento destino) {
		if (origen==destino)
			return false;
		float inicioRangoX= origen.getInicioRangoX();
		float finRangoX= origen.getFinRangoX();
		return  Math.min(inicioRangoX, finRangoX)<=destino.getX() && destino.getX()<=Math.max(inicioRangoX,finRangoX); 
	}
	
	/**
	 * agrega un elemento al mapa y a la gui
	 * @param e elemento a agregar
	 */
	

	public synchronized void agregar(Elemento e) {
		porAgregar.add(e);
	}

	public List<Elemento> enRango(Elemento e){
		List<Elemento> toreturn= new LinkedList<Elemento>();
		for (int fila: e.getFilas())
			for (Elemento elem:entidades[fila])
				if (estaEnRango(e,elem))
					toreturn.add(elem);
				
		return toreturn;
	}
	
	public void soltarPowerUp(int x, int y) {
		Elemento powerup=tienda.getPowerUp(x,y,this);
		if(powerup!=null) {
			porAgregar.add(powerup);
		}
	}
	
	public void incrementarDerrotados() {
		enemigosDerrotados++;
	}
	public int getDerrotados() {
		return enemigosDerrotados;
	}
	
	public List<Elemento> elementosEn(int x, int y){
		List<Elemento> toreturn= new LinkedList<Elemento>();
		for (Elemento e:entidades[y/96])                    // (y/96) es la fila
			if ( e.getX()<= x && e.getX()+e.getAncho()>=x)
				toreturn.add(e);
		return toreturn;
	}
	

}
