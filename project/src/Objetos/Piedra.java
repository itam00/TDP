package Objetos;

import Entidad.ObjetoMapa;
import Graficos.ElementoGrafico;

import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;

public class Piedra extends ObjetoMapa {

	public Piedra(int x, int y, Mapa m) {
		super(x, y, m);
		vida=100;
		direccionGrafico = "/Sprites/piedra.png";
		grafico=  new ElementoGrafico(direccionGrafico);
	}
	
	public void afectar (Torre t) {
		//
	}
	
	public void afectar(Enemigo e) {
		//
	}
	
	public float getInicioRangoX() {
		return grafico.getX()-50;
	}
	public float getFinRangoX() {
		return grafico.getX()+50;
	}


}
