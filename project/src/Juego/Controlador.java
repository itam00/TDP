package Juego;
import java.util.*; 

import Entidad.Elemento;
import Entidad.ObjetoMapa;
import GUI.*;
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
	protected boolean esperando,termino;
	protected long frecuenciaAgregacionEnemigo, frecuenciaAgregacionObjetos,ultimaActualizacion, ultVezAgregueObjeto;;
	
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
		
		frecuenciaAgregacionEnemigo = nivel.getFrecuencia();
		frecuenciaAgregacionObjetos=-1;
		ultimaActualizacion = 0;
		ultVezAgregueObjeto=0;
		
		tiempoEspera = 5000;
		termino=false;
	}
	
	public synchronized void actualizar() {
			mapa.actualizar();
			if(mapa.getEnemigoGana()) {
				gui.enemigoGana();
			}
			tienda.actualizar();
			
			agregarEnemigos();
			if (System.currentTimeMillis()-ultVezAgregueObjeto>=frecuenciaAgregacionObjetos) {
				agregarObjetosMapa();
				frecuenciaAgregacionObjetos+=30000;
				ultVezAgregueObjeto=System.currentTimeMillis();
			}
			if(mapa.getDerrotados()==cantEnemigosOleada) {
				if(oleadasNivel.hasNext()) {
					cargarSiguienteOleada();
				}
				else {
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
					frecuenciaAgregacionEnemigo++;
					ultimaActualizacion=5;
				}
			}
	}
	
	public void agregarEnemigos() {
		Enemigo aux;
		while(oleada.hasNext() && System.currentTimeMillis()-ultimaActualizacion >= frecuenciaAgregacionEnemigo) {
			aux = oleada.next();
			mapa.agregar(aux);
			ultimaActualizacion = System.currentTimeMillis();
		}
	}
	
	public void agregarObjetosMapa() {
		int cantObjetos= (int)(Math.random()*5);
		System.out.println(cantObjetos);
		int x, y,fila;
		ObjetoMapa obj;
		for (int i=0; i<cantObjetos;i++) {
			x= (int)((Math.random()*700)+300); //divido por 102 para que quede colocado en alguna "celda" logica.
			fila= (int)(Math.random()*5);
			y=fila*96; //el constructor recibe el pixel y y computa la fila, por esto es necesario multiplicar por 96.
			obj=nivel.generarObjetoMapa(x, y, mapa);
			if (mapa.puedoPoner(obj,x,y))
				mapa.agregar(obj);
			//gui.añadirElemento(obj);
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
					tienda.devolver(t.getPrecio());
				}
			}
			else if(tienda.hayObstaculoUsado()) {
				Obstaculo o = tienda.getObstaculoComprado();
				if(!colocar(o,x,y)) {
					tienda.devolver(o.getPrecio());
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
