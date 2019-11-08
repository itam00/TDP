package Juego;

import Personajes.Enemigo;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;
import State.ProtegidoEnemigo;

public class Nivel2 extends Nivel{
	public Nivel2(Mapa mapa) {
		super(mapa);
		frecuencia=500;
		cantEnemigos = 40;
		cantOleadas = 3;
		probabilidadEscudo = 30;
	}

	protected Enemigo generarEnemigo() {
		int tipoEnemigo = (int)(Math.random()*3);
		
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
		}
		agregarEscudo(toReturn);
		return toReturn;
		
	}

}
