package Disparos;

import Juego.Mapa;

public abstract class DisparoEnemigo extends Disparo{

	public DisparoEnemigo(int x, int y, Mapa m, int danio, float rango) {
		super(x, y, m, danio, rango);
		// TODO Auto-generated constructor stub
	}
	protected void mover() {
		x-=velocidad;
	}

}
