package Disparos;

import Graficos.DisparoGraficoEnemigo2;
import Juego.Mapa;
import Visitor.VisitorDisparoEnemigo;

public class DisparoEnemigo2 extends Disparo{

	public DisparoEnemigo2(int x, int y,Mapa m,int danio,float rango) {
		super(x, y,m,danio,rango);
		grafico=  new DisparoGraficoEnemigo2(x, y);
		velocidad = -4;
		visitor = new VisitorDisparoEnemigo(this);
	}


	@Override
	public float getInicioRangoX() {
		return grafico.getX()-5;
	}

	@Override
	public float getFinRangoX() {
		return grafico.getX()+5;
	}

}
