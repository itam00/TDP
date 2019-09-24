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

public class Mapa extends JPanel{
	protected List<ElementoGrafico>[] entidades;
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

		
		entidades = (List<ElementoGrafico>[]) new LinkedList[6];
		for(int i=0;i<entidades.length;i++) {
			entidades[i] = new LinkedList<ElementoGrafico>();
		}
	}
	
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
	
	public void genocidio() {
		for (List<ElementoGrafico> e:entidades)
			for (int i=0; i<e.size();i++)
				if (e.get(i)!=null) {
					e.get(i).setMuerto(true);
				}
		
	}
}
