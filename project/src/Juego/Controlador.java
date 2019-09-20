package Juego;
import java.util.*;

import GUI.*;
import Personajes.*;

public class Controlador {
	protected GUI gui;
	protected List<Torre> torres;
	protected List<Enemigo> enemigos;
	protected Mapa mapa;
	
	public Controlador(GUI g) {
		gui = g;
		torres = new ArrayList<Torre>();
		enemigos = new ArrayList<Enemigo>();
		mapa = new Mapa(g);
	}
	
	public void mover() {
		//gui.avanzar();
		for(Torre t: torres) {
			//t.buscarEnemigo()|
		}
		for(Enemigo e: enemigos) {
			//e.avanzar
		}
		
		
	}
	
	public void comprarTorre(int x,int y) {
		boolean lugarLibre=true;
		Iterator<Torre> it = torres.iterator();
		Torre aux;
		System.out.println("x:" +x+" y: "+y);
		while(it.hasNext() && lugarLibre) {
			aux = it.next();
			//lugarLibre = !coincidePosicion(aux,x,y);
		}
		if(lugarLibre) {
			Torre nueva = new Isaac(x,y);
			torres.add(nueva);
			System.out.println(nueva.obtenerGrafico().obtenerFila());
			gui.añadir(nueva.obtenerGrafico());
		}
	}
	
	
	
}
