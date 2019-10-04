package Personajes;

import PersonajeGrafico.*;
import Recolectable.PowerUp;

public class Isaac extends Torre{
	int vida  =100;
	int danio = 1;
	int rango = 2;
	int precio = 10;

	public Isaac(int x,int y) {
		super(x,y);
		grafico = new IsaacGrafico(x,y);
	}

	public Isaac() {
	}
	
	public void setPos(int x,int y) {
		grafico = new IsaacGrafico(x,y);
	}
	
	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean detectarEnemigo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}


}
