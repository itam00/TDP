package Personajes;

import Graficos.Enemigo4Grafico;
import Juego.Mapa;
import Recolectable.*;

public class Enemigo4 extends Enemigo{

	public Enemigo4(int x, int y, Mapa m) {
		super(x, y, m);
		velocidadDefault=0.7f;
		velocidad = velocidadDefault;
		vida = 100;
		danio = 5;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuenciaDefault=500;
		frecuencia=frecuenciaDefault;
		grafico= new Enemigo4Grafico();
	}
	
	public void actualizar() {
		super.actualizar();
		if(muerto) {
			int random = (int)(Math.random()*6)*96;
			mapa.agregar(new Enemigo4Gemelo((int)x,(int)random,mapa));
		}
	}

	
	



}
