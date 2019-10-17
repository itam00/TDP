package Disparos;

import Graficos.DisparoGrafico;
import Juego.Mapa;


public class DisparoTorre1 extends Disparo {


	public DisparoTorre1(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGrafico(x, y);
		velocidad = 2;
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
