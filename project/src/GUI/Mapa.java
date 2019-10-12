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
<<<<<<< Updated upstream
			entidades[i] = new LinkedList<ElementoGrafico>();
=======
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
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	
	public void genocidio() {
		for (List<ElementoGrafico> e:entidades)
			for (int i=0; i<e.size();i++)
				if (e.get(i)!=null) {
					e.get(i).setMuerto(true);
				}
		
=======
	/**
	 * Verifica si el elemento e "colisiona" con otro elemento en su fila segun el rango del elemento
	 * @param e elemento a partir del cual se verica la colision
	 */
	public void verificarColision(Elemento e) {
		boolean colisiona1 = false;
		Iterator<Elemento> it = entidades[e.obtenerFila()].iterator();
		Elemento aux;
		while(it.hasNext() && !colisiona1 ) {
			aux = it.next();
			if (e!=aux) {
				colisiona1 = estaEnRango(e,aux);
				if(colisiona1) {
					aux.accept(e.getVisitor());
				}
				else{
					//CAMBIAR AL ELEMENTO A SU ESTAO POR DEFECTO
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
		return  Math.min(inicioRangoX, finRangoX)<destino.getX() && destino.getX()<Math.max(inicioRangoX,finRangoX); 
	}
	
	/**
	 * agrega un elemento al mapa y a la gui
	 * @param e elemento a agregar
	 */
	
	public synchronized void agregar(Elemento e) {
		entidades[e.obtenerFila()].add(e);
		System.out.println("En el mapa se agrego en "+ e.obtenerFila());
		gui.añadirElemento(e);
>>>>>>> Stashed changes
	}
}
