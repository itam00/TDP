package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import Entidad.*;
import EntidadGrafica.ElementoGrafico;

public class Controlador {
	protected GUI gui;
	protected Mapa mapa;
	protected List<Elemento> entidades;
	protected ContadorTiempo contador;
	protected Jugador jugador;
	
	public Controlador(GUI g, Jugador j) {
		gui = g;
		//mapa=m;
		entidades = new ArrayList<Elemento>();
		jugador = j;
	}
	
	public synchronized void actualizar() {
		Iterator<Elemento> it = entidades.iterator();
		List<Elemento> aEliminar= new ArrayList<Elemento>();
		Elemento aux;
		
			
		while(it.hasNext()) {
			aux = it.next();
			aux.actualizar();
			
			for (Elemento e:entidades) {
				if (e!=aux && gui.coincidePosicion(aux,e)) {
					e.setMuerto(true);
					aux.setMuerto(true);
				}
			}
			
			if(aux.estaMuerto()) {
				it.remove();
				gui.eliminar(aux);
				aEliminar.add(aux);
				///////////////
				//ESTO MUERE DSP DEL SIGUIENTE SPRINT
				if(aux instanceof Enemigo) {
					jugador.sumarPuntaje(((Enemigo) aux).getPuntos());
					System.out.println(jugador.getPuntaje());
				}
				//////////////////
			}
		}
		for (Elemento e: aEliminar)
			entidades.remove(e);
		
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
			entidades.add(nueva);
			System.out.println("comprado");
			gui.añadirElemento(nueva);
		}
	}
	
	public synchronized void colocarEnemigo(int x, int y) {
		Enemigo enemigo= new Enemigo1(x,y);
		entidades.add(enemigo);
		gui.añadirElemento(enemigo);
	}
	
	public void genocidio() {
		for (Elemento e:entidades) {
				e.setMuerto(true);
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
