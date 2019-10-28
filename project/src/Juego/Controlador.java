package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import Recolectable.PowerUp;
import Tienda.Tienda;
import Entidad.*;

public class Controlador {
	protected GUI gui;
	protected Mapa mapa;
	protected ContadorTiempo contador;
	protected Jugador jugador;
	protected Tienda tienda;
	protected Nivel nivel;
	protected Iterator<Enemigo> oleada;
	
	public Controlador(GUI g, Mapa m, Jugador j,Tienda t) {
		gui = g;
		mapa=m;
		jugador = j;
		tienda = t;
		//nivel = new nivel1(mapa);
		//oleada = nivel.getOleada().iterator();
	}
	
	public synchronized void actualizar() {
		
		/*Enemigo aux;
		while(oleada.hasNext()) {
			aux = oleada.next();
			
			oleada.remove();
		}*/
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
	public synchronized void colocarEnemigo3(int x, int y) {
		Enemigo enemigo= new Enemigo3(x,y,mapa);
		mapa.agregar(enemigo);
	}
	public synchronized void colocarPiedra(int x, int y) {
		Obstaculo piedra= new Piedra(x,y,mapa);
		mapa.agregar(piedra);
	}
	public synchronized void colocarEnemigo4(int x, int y) {
		Enemigo enemigo= new Enemigo4(x,y,mapa);
		mapa.agregar(enemigo);
	}
	

	public void click(int x,int y) {
		if(y<576) {
			if(tienda.hayComprado()){
				Torre t = tienda.getComprado();
				if (mapa.puedoPoner(t,x,y)) {
					t.setPos(x, y,mapa);
					mapa.agregar(t);
				}
				else
					tienda.devolver(t);
			}
			else if(tienda.hayPowerUpUsado()) {
				PowerUp p = tienda.getPowerUpUsado();
				p.setPos(x, y, mapa);
				mapa.agregar(p);
			}
			else {
				
			}
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
