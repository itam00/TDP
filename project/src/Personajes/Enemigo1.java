package Personajes;

import GUI.Mapa;
import PersonajeGrafico.*;
import Recolectable.*;

public class Enemigo1 extends Enemigo{

	public Enemigo1(int x, int y, Mapa m) {
		super(x, y, m);
		vida = 100;
		danio = 100;
		rango = 1;
		inicioRangoX=x;
		finRangoX=x-10;
		inicioRangoY=y+10;
		finRangoY=y-10;
		puntos =  10;
		recompensa = 100;
		grafico= new Enemigo1Grafico(x,y);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}


}
