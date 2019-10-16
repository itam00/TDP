package Personajes;

import GUI.Mapa;
import PersonajeGrafico.Enemigo1Grafico;
import PersonajeGrafico.Enemigo3Grafico;
import Recolectable.PowerUp;

public class Enemigo3 extends Enemigo {

	public Enemigo3(int x, int y, Mapa m) {
		super(x, y, m);
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuencia = 500;
		grafico= new Enemigo3Grafico(x,y);
	}



	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

}
