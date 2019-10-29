package Entidad;

import Graficos.PiedraGrafica;
import Juego.Mapa;
import Personajes.Enemigo;

public class Piedra extends Obstaculo {

	public Piedra(int x, int y, Mapa m) {
		super(x, y, m);
		vida=100;
		grafico= new PiedraGrafica(x,y);
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
