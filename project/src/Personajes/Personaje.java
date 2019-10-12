package Personajes;
import Recolectable.*;

import Entidad.Elemento;
import GUI.Mapa;

public abstract class Personaje extends Elemento{
	protected int vida, danio, rango,frecuencia;
	protected long ultimoAtaque;
	

	public Personaje(int x, int y,Mapa m) {
		super(x,y,m);
	}
	public Personaje() {}

	public abstract void atacar();
	public abstract void aplicarPowerUp(PowerUp p);
	public void disminuirVida(int n) {
		vida-=n;
	}
	
	public boolean getMuerto() {
		return vida<=0;
	}
	
}
