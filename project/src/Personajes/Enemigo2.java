package Personajes;

import Disparos.DisparoEnemigo2;

import Entidad.Elemento;
import Graficos.ElementoGrafico;
import Juego.Mapa;

public class Enemigo2 extends Enemigo{

	public Enemigo2(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.8f;
		velocidad=velocidadDefault;
		vida = 100;
		danio = 15;
		rango = 5;
		puntos =  50;
		recompensa = 60;
		ultimoAtaque=0;
		frecuencia= 600;
		frecuenciaDefault=600;
		direccionGrafico = "/Sprites/enemigo2.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}
	
	public void atacar(Elemento elem) {
		mapa.agregar(new DisparoEnemigo2((int)x,(int)y,mapa,danio,rango*96));
	}

}
