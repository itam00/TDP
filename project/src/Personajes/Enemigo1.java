package Personajes;

import Graficos.Enemigo1Grafico;
import Juego.Mapa;
import Recolectable.*;

public class Enemigo1 extends Enemigo{

	public Enemigo1(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=1;
		velocidad=velocidadDefault;
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuenciaDefault=500;
		frecuencia=frecuenciaDefault;
		grafico= new Enemigo1Grafico();
	}

	



}
