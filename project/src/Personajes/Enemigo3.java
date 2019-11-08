package Personajes;

import Graficos.ElementoGrafico;
import Juego.Mapa;

public class Enemigo3 extends Enemigo {

	public Enemigo3(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault= 0.5f;
		velocidad = velocidadDefault;
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuenciaDefault=500;
		frecuencia = frecuenciaDefault;
		direccionGrafico = "/Sprites/enemigo3.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}
	
}
