package Juego;
import java.util.*;  

import GUI.*;
import Personajes.*;
import PowerUps.PowerUp;
import Tienda.Tienda;

public class Controlador {
	protected GUI gui;
	protected Mapa mapa;
	protected ContadorTiempo contador;
	protected Jugador jugador;
	protected Tienda tienda;
	protected Nivel nivel;
	protected Iterator<List<Enemigo>> oleadasNivel;
	protected Iterator<Enemigo> oleada;
	protected int cantEnemigosOleada,tiempoEspera;
	protected boolean esperando;
	protected long frecuenciaAgregacion,ultimaActualizacion;
	
	public Controlador(GUI g, Mapa m, Jugador j,Tienda t) {
		gui = g;
		mapa=m;
		jugador = j;
		tienda = t;
		frecuenciaAgregacion = 0;
		ultimaActualizacion = 5;
		
		nivel = new nivel1(mapa);
		oleadasNivel = nivel.getEnemigos().iterator();
		List<Enemigo>aux = oleadasNivel.next();
		cantEnemigosOleada = aux.size();
		oleada = aux.iterator();
		tiempoEspera = 5000;
	}
	
	public synchronized void actualizar() {
		
		mapa.actualizar();
		tienda.actualizar();
		
		agregarEnemigos();
		if(mapa.getDerrotados()==cantEnemigosOleada) {
			if(oleadasNivel.hasNext()) {
				cargarSiguienteOleada();
			}
			else {
				//siguiente nivel
			}
		}
		frecuenciaAgregacion++;
		ultimaActualizacion=5;
		
	}
	
	public void agregarEnemigos() {
		Enemigo aux;
		while(oleada.hasNext() && ultimaActualizacion>0 && frecuenciaAgregacion % 100==0) {
			aux = oleada.next();
			mapa.agregar(aux);
			oleada.remove();
			ultimaActualizacion--;
		}
	}
	
	public synchronized void cargarSiguienteOleada() {
		List<Enemigo> aux = oleadasNivel.next();
		cantEnemigosOleada = aux.size();
		oleada = aux.iterator();
		
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
		}
	}
	
	
}
