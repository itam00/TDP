package Personajes;

import Graficos.Enemigo4Grafico;
import Juego.Mapa;
import Recolectable.*;

public class Enemigo4 extends Enemigo{

	public Enemigo4(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 2;
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuencia = 500;
		grafico= new Enemigo4Grafico();
	}

	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}
	
	



}
