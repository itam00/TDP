package Personajes;

import GUI.Mapa;
import PersonajeGrafico.*;
import Recolectable.*;

public class Enemigo1 extends Enemigo{

	public Enemigo1(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 1;
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuencia = 500;
		grafico= new Enemigo1Grafico();
	}

	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}
	
	



}
