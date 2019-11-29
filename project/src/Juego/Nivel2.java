package Juego;

import Personajes.Enemigo;
import Personajes.Enemigo2;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;

public class Nivel2 extends Nivel{
	public Nivel2(Mapa mapa) {
		super(mapa);
		frecuencia=500;
		cantEnemigos = 20;
		cantOleadas = 3;
		probabilidadEscudo = 30;
		enemigosPorOleada = 15;
		generarOleadas();
	}

	protected Enemigo generarEnemigo() {
		int tipoEnemigo = (int)(Math.random()*4)+1;
		
		Enemigo toReturn = null;
		switch(tipoEnemigo) {
			case 1:
				toReturn = new Enemigo5(finMapa, filaRandom(), mapa);
				break;
			case 2:
				toReturn  =new Enemigo4(finMapa,filaRandom(),mapa);
				break;
			case 3:
				toReturn = new Enemigo3(finMapa,filaRandom(),mapa);
				break;
			case 4:
				toReturn = new Enemigo2(finMapa,filaRandom(),mapa);
				break;
		}
		agregarEscudo(toReturn);
		return toReturn;
		
	}

}
