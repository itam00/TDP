package GUI;
import java.util.ArrayList; 
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidad.Elemento;
import EntidadGrafica.*;
import Personajes.Enemigo;

public class Mapa{
	public final int cantFilas = 6;
	protected List<Elemento>[] entidades;
	protected ImageIcon fondo;
	protected GUI gui;
	
	public Mapa(GUI g) {
		gui = g;

		entidades = (List<Elemento>[]) new LinkedList[cantFilas];
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
					///////////////
					//ESTO MUERE DSP DEL SIGUIENTE SPRINT
					
					if(aux instanceof Enemigo) {
						//jugador.sumarPuntaje(((Enemigo) aux).getPuntos());
					}
					//////////////////
				}
				else {
					for(Elemento e: entidades[i]) {
						
						if(e!=aux && coincidePosicion(e, aux)) {
							System.out.println(e.obtenerFila()+"   "+ aux.obtenerFila()+ "   " +i);
							aux.setMuerto(true);
							e.setMuerto(true);
							System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
						}
					}
				}
			}
		}

	}
	
	
	
	public boolean coincidePosicion(Elemento e1, Elemento e2) {
		ElementoGrafico grafico1 = e1.obtenerGrafico();
		ElementoGrafico grafico2 = e2.obtenerGrafico();
		return  Math.abs(grafico1.getX() - grafico2.getX()) <= 3;
	}
	
	public boolean coincidePosicion(Elemento g,int x,int y) {
		boolean coincide = false;
		Elemento elem = g,aux;
		Iterator<Elemento> it = entidades[g.obtenerFila()].iterator();
		
		while(it.hasNext() && !coincide) {
			aux = it.next();
			coincide = aux.getX() == elem.getX(); 
		}
		return coincide;
	}
	
	public void agregar(Elemento e) {
		entidades[e.obtenerFila()].add(e);
		System.out.println("En el mapa se agrego en "+ e.obtenerFila());
		gui.añadirElemento(e);
	}
	
	
	//solo para el sprint
	public void genocidio() {
		for(int i = 0; i<entidades.length;i++) {
			for (Elemento e:entidades[i]) {
					e.obtenerGrafico().setMuerto(true);
			}
		}
		
	}
	
	///////////////////////////////
	//ESTO IRIA EN LA GUI
	
	
	

}
