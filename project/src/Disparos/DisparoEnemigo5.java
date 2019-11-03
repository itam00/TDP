package Disparos;

import Graficos.DisparoGraficoEnemigo5;
import Juego.Mapa;
import Visitor.VisitorDisparoEnemigo;

public class DisparoEnemigo5 extends Disparo{
	public DisparoEnemigo5(int x, int y,Mapa m,int danio,float rango) {
		super(x, y,m,danio,rango);
		grafico=  new DisparoGraficoEnemigo5(x, y);
		velocidad = -4;
		visitor = new VisitorDisparoEnemigo(this);
	}


	@Override
	public float getInicioRangoX() {
		return grafico.getX()-15;
	}

	@Override
	public float getFinRangoX() {
		return grafico.getX()+15;
	}
}
