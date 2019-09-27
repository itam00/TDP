package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import Entidad.*;

public class Controlador {
	protected GUI gui;
	protected Mapa mapa;
	protected ContadorTiempo contador;
	protected Jugador jugador;
	
	public Controlador(GUI g, Mapa m, Jugador j) {
		gui = g;
		mapa=m;
		jugador = j;
	}
	
	public void actualizar() {
		mapa.actualizar();
	}
	
	
	public synchronized void comprarTorre(int x,int y) {
		boolean lugarLibre=true;
		System.out.println("x:" +x+" y: "+y);
		/*while(it.hasNext() && lugarLibre) {
			aux = it.next();
			//lugarLibre = !coincidePosicion(aux,x,y);
		}
		*/
		if(lugarLibre) {
		//	Torre nueva = new Isaac(x,y);
			Disparo nueva= new DisparoAliado(x,y);
			mapa.agregar(nueva);
			System.out.println("comprado");
			
		}
	}
	
	public synchronized void colocarEnemigo(int x, int y) {
		Enemigo enemigo= new Enemigo1(x,y);
		mapa.agregar(enemigo);
	}

	public void genocidio() {
		mapa.genocidio();
		
	}
	
//	public void remover() {
//		for(Disparo s: entidades) {
//			s.obtenerGrafico().cambiar();
//		}
		//también que borrarlo del controlador.
//	}
	
	//cada objeto gráfico tiene que conocer a su objeto lógico.
}
