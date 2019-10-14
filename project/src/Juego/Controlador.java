package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import Tienda.Tienda;
import Entidad.*;

public class Controlador {
	protected GUI gui;
	protected Mapa mapa;
	protected ContadorTiempo contador;
	protected Jugador jugador;
	protected Tienda tienda;
	
	public Controlador(GUI g, Mapa m, Jugador j,Tienda t) {
		gui = g;
		mapa=m;
		jugador = j;
		tienda = t;
	}
	
	public synchronized void actualizar() {
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
	}
	
	public synchronized void colocarEnemigo(int x, int y) {
		Enemigo enemigo= new Enemigo1(x,y,mapa);
		mapa.agregar(enemigo);
	}
	
	public synchronized void colocarPiedra(int x, int y) {
		Obstaculo piedra= new Piedra(x,y,mapa);
		mapa.agregar(piedra);
	}

	public void click(int x,int y) {
		if(y<576&&tienda.hayComprado() && !mapa.coincidePosicion(x,y)) {
			Torre t = tienda.getComprado();
			t.setPos(x, y,mapa);
			mapa.agregar(t);
		}
	}
	
//	public void remover() {
//		for(Disparo s: entidades) {
//			s.obtenerGrafico().cambiar();
//		}
		//también que borrarlo del controlador.
//	}
	
	//cada objeto gráfico tiene que conocer a su objeto lógico.
}
