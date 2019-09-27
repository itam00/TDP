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

public class Mapa extends JPanel{
	public final int cantFilas = 6;
	protected List<Elemento>[] entidades;
	protected ImageIcon fondo;
	protected GUI gui;
	
	public Mapa(GUI g) {
		gui= g;
		this.setLayout(null);
		this.setVisible(true);
		this.setOpaque(false);
		this.setBounds(0, 0, 1028, 576);//esto quedo asi porque con 1024 no se ve el borde
		agregarFondo();
		addMouseListener(gui);

		
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
					gui.eliminar(aux.obtenerGrafico());
					///////////////
					//ESTO MUERE DSP DEL SIGUIENTE SPRINT
					
					if(aux instanceof Enemigo) {
						//jugador.sumarPuntaje(((Enemigo) aux).getPuntos());
					}
					//////////////////
				}
			}
		}

		gui.repaintMapa();
	}
	
	
	
	public boolean coincidePosicion(Elemento e1, Elemento e2) {
		ElementoGrafico grafico1 = e1.obtenerGrafico();
		ElementoGrafico grafico2 = e2.obtenerGrafico();
		System.out.println(grafico1.getX()+"    "+grafico2.getX());
		return  (grafico1.getX() == grafico2.getX()) && (grafico1.getY() == grafico2.getY());
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
	
	private void agregarFondo(){
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Sprites/sueloMapa.png"));
		JLabel dibujo = new JLabel(imagen);
		dibujo.setOpaque(false);
		add(dibujo);
		dibujo.setBounds(0, 0,1024,576);
	}
	
	public void añadirElemento(ElementoGrafico e) {
		add(e);
		int x = e.getX();
		int y = e.getY();
		System.out.println(x+" -aca- "+y);
		e.setBounds(x,y,e.getAlto(),e.getAncho());
		setComponentZOrder(e, 0);
	}
	
	public void agregar(ElementoGrafico e) {
		entidades[e.obtenerFila()].add(e);
		añadirElemento(e);
	}
	
	public void eliminar(ElementoGrafico e) {
		boolean eliminado=false;
		int fila = e.obtenerFila();
		for(int i=0;i<entidades[fila].size() && !eliminado;i++) {
			if(e==entidades[fila].get(i)) {
				entidades[fila].remove(i);
				remove(e);
				eliminado=true;
			}
		}
	}
	
	

}
