package Personajes;
import Recolectable.*;


import Entidad.Elemento;
import Juego.Mapa;

public abstract class Personaje extends Elemento{
	protected int vida, danio, rango,frecuencia;
	protected long ultimoAtaque;
	

	public Personaje(int x, int y,Mapa m) {
		super(x,y,m);
	}
	public Personaje() {}

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

	public boolean puedeAtacar() {
		boolean puede=System.currentTimeMillis()-ultimoAtaque>frecuencia;
		if(puede) {
			ultimoAtaque = System.currentTimeMillis();
		}
		return puede;
	}
}
