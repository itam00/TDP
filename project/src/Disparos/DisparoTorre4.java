package Disparos;

import Graficos.DisparoGrafico4;
import Juego.Mapa;

public class DisparoTorre4 extends Disparo {


	public DisparoTorre4(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGrafico4(x, y);
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
