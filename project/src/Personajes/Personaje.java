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
	public void aplicarPowerUp(PowerUp p) {
		//IMPLEMENTAR ESTA PARTE ES COMUN PARA TODOS
	}
	public void disminuirVida(int n) {
		vida-=n;
		muerto = vida<=0;
	}
	
	public boolean getMuerto() {
		return vida<=0;
	}
	
	public int getDanio() {
		return danio;
	}
	
}
