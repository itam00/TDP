package Juego;

import Personajes.Enemigo;

import Personajes.Enemigo1;
import Personajes.Enemigo2;
import Personajes.Enemigo3;

public class Nivel1 extends Nivel{
	
	public Nivel1(Mapa mapa) {
		super(mapa);
		frecuencia=500;
		cantEnemigos = 5;
		cantOleadas = 3;
		probabilidadEscudo = 25;
		enemigosPorOleada = 5;
		generarOleadas();
		siguienteNivel = new Nivel2(mapa);
	}


	protected Enemigo generarEnemigo() {
		int tipoEnemigo = (int)(Math.random()*3)+1;
		
		
		Enemigo toReturn = null;
		switch(tipoEnemigo) {
			case 1:
				toReturn = new Enemigo1(finMapa, filaRandom(), mapa);
				break;
			case 2:
				toReturn  =new Enemigo2(finMapa,filaRandom(),mapa);
				break;
			case 3:
				toReturn = new Enemigo3(finMapa,filaRandom(),mapa);
				break;
		}
		agregarEscudo(toReturn);
		return toReturn;
		
	}



	
	
	
	

}