package Disparos;

import Graficos.DisparoGrafico2;
import Juego.Mapa;

public class DisparoTorre2 extends Disparo {


	public DisparoTorre2(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGrafico2(x, y);
		velocidad = 3;
	}


	@Override
	public int getInicioRangoX() {
		return grafico.getX()-7;
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+7;
	}
	


}
