package Personajes;

import Graficos.Enemigo2Grafico;
import Juego.Mapa;

public class Enemigo2 extends Enemigo{

	public Enemigo2(int x, int y, Mapa m) {
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
		grafico= new Enemigo2Grafico();
	}

}
