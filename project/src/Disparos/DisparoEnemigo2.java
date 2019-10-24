package Disparos;

import Graficos.DisparoGraficoEnemigo2;
import Juego.Mapa;

public class DisparoEnemigo2 extends Disparo{

	public DisparoEnemigo2(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGraficoEnemigo2(x, y);
		velocidad = 4;
	}


	@Override
	public int getInicioRangoX() {
		return grafico.getX()-5;
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+5;
	}

}
