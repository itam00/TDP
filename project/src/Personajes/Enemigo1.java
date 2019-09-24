package Personajes;

import Recolectable.PowerUp;

public class Enemigo1 extends Enemigo{

	public Enemigo1(int x, int y) {
		super(x, y);
		vida = 100;
		danio = 100;
		rango = 10;
		puntos =  10;
		recompensa = 100;

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
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

}
