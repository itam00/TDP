package Personajes;

import Graficos.Enemigo1Grafico;
import Graficos.Enemigo3Grafico;
import Juego.Mapa;
import PowerUps.PowerUp;

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
		grafico= new Enemigo3Grafico();
	}
	
}
