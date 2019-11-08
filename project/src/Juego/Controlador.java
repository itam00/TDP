package Juego;
import java.util.*;

import Entidad.Elemento;
import GUI.*;
import Objetos.Objeto;
import Objetos.Obstaculo;
import Personajes.*;
import PowerUps.PowerUp;
import Tienda.Tienda;
import Visitor.VisitorVenta;

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
		
		nivel = new Nivel1(mapa);
		oleadasNivel = nivel.getEnemigos().iterator();
		List<Enemigo>aux = oleadasNivel.next();
		cantEnemigosOleada = aux.size();
		oleada = aux.iterator();
		
		frecuenciaAgregacion = nivel.getFrecuencia();
		ultimaActualizacion = 0;
		
		tiempoEspera = 5000;
	}
	
	public synchronized void actualizar() {
		
		mapa.actualizar();
		if(mapa.getEnemigoGana()) {
			System.out.println("enemigo gana");
		}
		tienda.actualizar();
		
		agregarEnemigos();
		System.out.println("derrotados: " + mapa.getDerrotados());
		if(mapa.getDerrotados()==cantEnemigosOleada) {
			if(oleadasNivel.hasNext()) {
				cargarSiguienteOleada();
			}
			else {
				//siguiente nivel
			}
		}
		
	}
	
	public void agregarEnemigos() {
		Enemigo aux;
		while(oleada.hasNext() && System.currentTimeMillis()-ultimaActualizacion >= frecuenciaAgregacion) {
			aux = oleada.next();
			mapa.agregar(aux);
			ultimaActualizacion = System.currentTimeMillis();
		}
	}
	
	public synchronized void cargarSiguienteOleada() {
		List<Enemigo> aux = oleadasNivel.next();
		cantEnemigosOleada = aux.size();
		oleada = aux.iterator();
		mapa.resetDerrotados();
	}

	public void click(int x,int y) {
		if(y<576) {
			if(tienda.hayTorreComprada()){
				Torre t = tienda.getTorreComprada();
				if(!colocar(t,x,y)) {
					tienda.devolver(t);
				}
			}
			else if(tienda.hayObstaculoUsado()) {
				Obstaculo o = tienda.getObstaculoComprado();
				if(!colocar(o,x,y)) {
					tienda.devolver(o);
				}
			}
			else if(tienda.hayPowerUpUsado()) {
				PowerUp p = tienda.getPowerUpUsado();
				p.setPos(x, y, mapa);
				mapa.agregar(p);
			}
			else if(tienda.hayVenta()) {
				VisitorVenta v= new VisitorVenta(tienda);
				List<Elemento> elementos=mapa.elementosEn(x, y);
				for (Elemento e:elementos)
					e.accept(v);
				tienda.vendio();
			}
		}
	}
	public boolean colocar(Elemento e,int x,int y) {
		boolean puedo = mapa.puedoPoner(e,x,y);
		if (puedo) {
			e.setPos(x, y,mapa);
			mapa.agregar(e);
		}
		return puedo;
	}
	
	
}
