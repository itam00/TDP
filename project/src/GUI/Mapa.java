package GUI;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;

import Entidad.Elemento;
import EntidadGrafica.*;

public class Mapa {
	protected List<ElementoGrafico>[] entidades;
	protected ImageIcon fondo;
	protected GUI gui;
	
	public Mapa(GUI g) {
		gui= g;
		entidades = (List<ElementoGrafico>[]) new ArrayList[6];
		for(int i=0;i<entidades.length;i++) {
			entidades[i] = new ArrayList<ElementoGrafico>();
		}
	}
	
	public void agregar(ElementoGrafico e) {
		entidades[e.obtenerFila()].add(e);
	}
	public void eliminar(ElementoGrafico e) {
		int fila = e.obtenerFila();
		for(int i=0;i<entidades[fila].size();i++) {
			if(e==entidades[fila].get(i)) {
				entidades[fila].remove(i);
			}
		}
	}
	
	public boolean coincidePosicion(Elemento g,int x,int y) {
		boolean coincide = false;
		ElementoGrafico elem = g.obtenerGrafico(),aux;
		Iterator<ElementoGrafico> it = entidades[elem.obtenerFila()].iterator();
		
		while(it.hasNext() && !coincide) {
			aux = it.next();
			coincide = aux.getX() == elem.getX(); 
		}
		return coincide;
	}
	
	
}
