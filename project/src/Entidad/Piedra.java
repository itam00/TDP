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
		e.setQuieto(true);
	}

}
