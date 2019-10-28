package Disparos;

import Graficos.DisparoGraficoEnemigo2;
import Graficos.DisparoGraficoEnemigo5;
import Juego.Mapa;
import Visitor.VisitorDisparoEnemigo;

public class DisparoEnemigo5 extends Disparo{
	public DisparoEnemigo5(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGraficoEnemigo5(x, y);
		velocidad = -4;
		visitor = new VisitorDisparoEnemigo(this);
	}


	@Override
	public int getInicioRangoX() {
		return grafico.getX()-15;
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+15;
	}
}
