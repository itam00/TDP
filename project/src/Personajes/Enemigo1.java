package Personajes;

import GUI.Mapa;
import PersonajeGrafico.*;
import Recolectable.*;

public class Enemigo1 extends Enemigo{

	public Enemigo1(int x, int y, Mapa m) {
		super(x, y, m);
		vida = 100;
		danio = 20;
		rango = 1;
		puntos =  10;
		recompensa = 100;
		ultimoAtaque=0;
		frecuencia = 500;
		grafico= new Enemigo1Grafico(x,y);
	}

	@Override
	public void atacar() {
		if(System.currentTimeMillis()-ultimoAtaque>frecuencia) {
			ultimoAtacado.disminuirVida(danio);
			
			if(ultimoAtacado.estaMuerto()){
				ultimoAtacado=null;
				quieto=false;
			}
			ultimoAtaque = System.currentTimeMillis();
		}
		
	}


	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}


}
