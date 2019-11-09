package Disparos;

import Juego.Mapa;

public abstract class DisparoTorre extends Disparo{

	public DisparoTorre(int x, int y, Mapa m, int danio, float rango) {
		super(x, y, m, danio, rango);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void mover() {
		x+=velocidad;
	}

}
