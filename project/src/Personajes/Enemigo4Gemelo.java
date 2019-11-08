package Personajes;

import Graficos.ElementoGrafico;
import Juego.Mapa;

public class Enemigo4Gemelo extends Enemigo{
	public Enemigo4Gemelo(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.7f;
		velocidad = velocidadDefault;
		vida = 100;
		danio = 5;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuenciaDefault=500;
		frecuencia=frecuenciaDefault;
		direccionGrafico = "/Sprites/enemigo4Gemelo.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}
	
}
