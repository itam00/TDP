package Personajes;

import Graficos.ElementoGrafico;
import Juego.Mapa;

public class Enemigo1 extends Enemigo{

	public Enemigo1(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.4f;
		velocidad=velocidadDefault;
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  20;
		recompensa = 30;
		ultimoAtaque=0;
		frecuenciaDefault=500;
		frecuencia=frecuenciaDefault;
		direccionGrafico = "/Sprites/enemigo1.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}

	



}
