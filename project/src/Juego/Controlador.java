package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import PowerUps.PowerUp;
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
	protected long frecuenciaAgregacion,ultimaActualizacion;
	
	public Controlador(GUI g, Mapa m, Jugador j,Tienda t) {
		gui = g;
		mapa=m;
		jugador = j;
		tienda = t;
		nivel = new nivel1(mapa);
		oleada = nivel.getOleada().iterator();
		frecuenciaAgregacion = 0;
		ultimaActualizacion = 5;
	}
	
	public synchronized void actualizar() {
		Enemigo aux;
		while(oleada.hasNext() && ultimaActualizacion>0 && frecuenciaAgregacion % 100==0) {
			aux = oleada.next();
			mapa.agregar(aux);
			oleada.remove();
			ultimaActualizacion--;
		}
		mapa.actualizar();
		tienda.actualizar();
		frecuenciaAgregacion++;
		ultimaActualizacion=5;
		
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
