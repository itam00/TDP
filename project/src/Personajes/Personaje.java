package Personajes;
import Recolectable.*;

import Entidad.Elemento;
import GUI.Mapa;

public abstract class Personaje extends Elemento{
	protected int vida, danio, rango;
	

	public Personaje(int x, int y,Mapa m) {
		super(x,y,m);
	}

	public abstract void atacar();
	public abstract void aplicarPowerUp(PowerUp p);
}
