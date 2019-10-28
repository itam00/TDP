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
	
	public Mapa(GUI g, Tienda t) {
		gui = g;
		tienda=t;
		enemigosDerrotados =0;

		entidades = (List<Elemento>[]) new LinkedList[cantFilas];
		porAgregar = new LinkedList<Elemento>();
		Elemento aux;
		for(int i=0;i<entidades.length;i++) {
			entidades[i] = new LinkedList<Elemento>();
			Iterator<Elemento> it = entidades[i].iterator();
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
			for (int fila:e.obtenerFilas()) {
				entidades[fila].add(e);
			}
			gui.aņadirElemento(e);
		}
		porAgregar.clear();

	}
	
	
	
	public boolean coincidePosicion(Elemento e1, Elemento e2) {
		return  Math.abs(e1.getX() - e2.getX()) <= 3;
	}
	
	/**
	 * Verifica si x e y coincide con cualquiera de las POSICIONES de los elementos en la fila
	 * @param x 
	 * @param y
	 * @return En caso de que la posicion este ocupada retorna true y falso en caso contrario
	 */
	
	public boolean coincidePosicion(int x,int fila) {
		boolean coincide = false;
		//int fila= (int)(y/96);
		//x = (int)(x/102)*102;
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
		boolean hayLugar=e.getCantFilas()-1<=fila;
		boolean puedo=true;
		if (hayLugar) {
			for (int i=0;i<e.getCantFilas() && puedo;i++) {
				puedo=!coincidePosicion(x,fila);
				fila--;
			}
		}
		else
			puedo=false;
		return puedo;
		
	}

	/**
	 * Verifica si el elemento e "colisiona" con otro elemento en su fila segun el rango del elemento
	 * @param e elemento a partir del cual se verica la colision
	 */
	public void verificarColision(Elemento e) {
		boolean colisiona1 = false;
		for (Integer fila:e.obtenerFilas()) {
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
	//PREGUNTAR SI ESTARIA BIEN QUE ESTO ESTE EN LOS ELEMENTOS EN VEZ DEL MAPA
	//SOLO SE PASARIA UN ELEMENTO COM PARAMETRO
	public boolean estaEnRango(Elemento origen,Elemento destino) {
		if (origen==destino)
			return false;
		int inicioRangoX= origen.getInicioRangoX();
		int finRangoX= origen.getFinRangoX();
	//	System.out.println(destino.getX());
	//	System.out.println(inicioRangoX); use esto para ver por que no colisionaba.
	//	System.out.println(finRangoX);
		
		//se computa con el minimo y el maximo ya que el limite de rango de un enemigo
		//estan invertidos con respecto a los de las torres
		return  Math.min(inicioRangoX, finRangoX)<=destino.getX() && destino.getX()<=Math.max(inicioRangoX,finRangoX); 
	}
	
	/**
	 * agrega un elemento al mapa y a la gui
	 * @param e elemento a agregar
	 */
	

	public void agregar(Elemento e) {
		porAgregar.add(e);
		
	}
	

	public List<Elemento> enRango(Elemento e){
		List<Elemento> toreturn= new LinkedList<Elemento>();
		for (Integer fila: e.obtenerFilas())
			for (Elemento elem:entidades[fila])
				if (estaEnRango(e,elem))
					toreturn.add(elem);
				
		return toreturn;
	}
	
	public void soltarPowerUp(int x, int y) {
		Elemento powerup=tienda.getPowerUp(x,y,this);
		porAgregar.add(powerup);
	}
	
	public void incrementarDerrotados() {
		enemigosDerrotados++;
	}
	public int getDerrotados() {
		return enemigosDerrotados;
	}

}
