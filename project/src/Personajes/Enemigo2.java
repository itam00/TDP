package Personajes;

import Disparos.DisparoEnemigo2;
import Entidad.Elemento;
import Graficos.Enemigo2Grafico;
import Juego.Mapa;

public class Enemigo2 extends Enemigo{

	public Enemigo2(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.8f;
		velocidad=velocidadDefault;
		vida = 100;
		danio = 10;
		rango = 5;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuenciaDefault=600;
		frecuencia=frecuenciaDefault;
		grafico= new Enemigo2Grafico();
	}
	
	public void atacar(Elemento elem) {
		mapa.agregar(new DisparoEnemigo2((int)x,(int)y,mapa,danio,rango*96));
	}

}
