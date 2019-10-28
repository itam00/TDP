package Disparos;

import Graficos.DisparoGrafico1;

import Juego.Mapa;
import Visitor.VisitorDisparoTorre;


public class DisparoTorre1 extends Disparo {


	public DisparoTorre1(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGrafico1(x, y);
		velocidad = 2;
		visitor = new VisitorDisparoTorre(this);
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
