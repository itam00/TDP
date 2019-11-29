package Personajes;

import Graficos.ElementoGrafico;
import Juego.Mapa;

public class Enemigo4 extends Enemigo{

	public Enemigo4(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.7f;
		velocidad = velocidadDefault;
		vida = 100;
		danio = 5;
		rango = 1;
		puntos =  20;
		recompensa = 30;
		ultimoAtaque=0;
		frecuenciaDefault=500;
		frecuencia=frecuenciaDefault;
		direccionGrafico = "/Sprites/enemigo4.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}
	
	public void actualizar() {
		super.actualizar();
		if(muerto) {
			int random = (int)(Math.random()*6)*96;
			mapa.agregar(new Enemigo4Gemelo((int)x,(int)random,mapa));
		}
	}

	
	



}
