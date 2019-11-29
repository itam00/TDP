package Personajes;

import Disparos.DisparoEnemigo5;

import Entidad.Elemento;
import Graficos.ElementoGrafico;
import Juego.Mapa;

public class Enemigo5 extends Enemigo{
	public Enemigo5(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.6f;
		velocidad=velocidadDefault;
		vida = 100;
		danio = 20;
		rango = 4;
		puntos =  100;
		recompensa = 70;
		ultimoAtaque=0;
		frecuenciaDefault=700;
		frecuencia=frecuenciaDefault;
		direccionGrafico = "/Sprites/enemigo5.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}
	
	public void atacar(Elemento elem) {
		mapa.agregar(new DisparoEnemigo5((int)x,(int)y,mapa,danio,rango*96));
	}
}
