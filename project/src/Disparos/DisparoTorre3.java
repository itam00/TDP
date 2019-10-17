package Disparos;

import Graficos.DisparoGrafico3;
import Juego.Mapa;

public class DisparoTorre3 extends Disparo {


	public DisparoTorre3(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGrafico3(x, y);
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
