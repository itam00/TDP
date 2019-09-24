package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import Entidad.*;

public class Controlador {
	protected GUI gui;
	protected Mapa mapa;
	protected List<Elemento> entidades;
	protected ContadorTiempo contador;
	protected Jugador jugador;
	
	public Controlador(GUI g, Mapa m, Jugador j) {
		gui = g;
		mapa=m;
		entidades = new ArrayList<Elemento>();
		jugador = j;
	}
	
	public void actualizar() {
		List<Elemento> toRemove= new ArrayList<Elemento>();
		for (Elemento e:entidades) {
			e.actualizar();
			if( e.estaMuerto()) {
				toRemove.add(e);
			}
		}
		for (Elemento e:toRemove) {
			entidades.remove(e);
			mapa.eliminar(e.obtenerGrafico());
			
			////////////////////////////////////////////
			
			//ESTO ES SOLO PARA EL SPRINT DSP MUERE
			if(e instanceof Enemigo) {
				jugador.sumarPuntaje(((Enemigo) e).getPuntos());
				System.out.println(jugador.getPuntaje());
			}
			
			/////////////////////////////////////
		}
		mapa.repaint();
	}
	
	public void comprarTorre(int x,int y) {
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
			entidades.add(nueva);
			System.out.println("comprado");
			mapa.agregar(nueva.obtenerGrafico());
		}
	}
	
	public void colocarEnemigo(int x, int y) {
		Enemigo enemigo= new Enemigo1(x,y);
		entidades.add(enemigo);
		mapa.agregar(enemigo.obtenerGrafico());
	}
	
//	public void remover() {
//		for(Disparo s: entidades) {
//			s.obtenerGrafico().cambiar();
//		}
		//también que borrarlo del controlador.
//	}
	
	//cada objeto gráfico tiene que conocer a su objeto lógico.
}
