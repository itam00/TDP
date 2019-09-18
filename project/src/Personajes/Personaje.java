package Personajes;
import Recolectable.*;
import Entidad.Elemento;
import Mapa.Celda;

public abstract class Personaje extends Elemento{
	protected int vida, danio, rango;
	

	public Personaje(int x, int y) {
		super(x,y);
	}

	public abstract void atacar();
	public abstract boolean detectarEnemigo();
	public abstract void aplicarPowerUp(PowerUp p);
}
