package Personajes;

import Disparos.DisparoEnemigo5;
import Entidad.Elemento;
import Graficos.Enemigo5Grafico;
import Juego.Mapa;

public class Enemigo5 extends Enemigo{
	public Enemigo5(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.6f;
		velocidad=velocidadDefault;
		vida = 100;
		danio = 10;
		rango = 5;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuenciaDefault=700;
		frecuencia=frecuenciaDefault;
		grafico= new Enemigo5Grafico();
	}
	
	public void atacar(Elemento elem) {
		mapa.agregar(new DisparoEnemigo5((int)x,(int)y,mapa,danio,rango*96));
	}
}
