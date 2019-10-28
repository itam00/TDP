package Disparos;

import Graficos.DisparoGraficoEnemigo2;
import Juego.Mapa;
import Visitor.VisitorDisparoEnemigo;

public class DisparoEnemigo2 extends Disparo{

	public DisparoEnemigo2(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGraficoEnemigo2(x, y);
		velocidad = -4;
		visitor = new VisitorDisparoEnemigo(this);
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
