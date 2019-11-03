package Disparos;

import Graficos.DisparoGrafico5;
import Juego.Mapa;
import Visitor.VisitorDisparoTorre;

public class DisparoTorre5 extends Disparo{
	public DisparoTorre5(int x, int y,Mapa m,int danio,float rango) {
		super(x, y,m,danio,rango);
		grafico=  new DisparoGrafico5(x, y);
		velocidad = 3;
		visitor = new VisitorDisparoTorre(this);
	}


	@Override
	public float getInicioRangoX() {
		return grafico.getX()-10;
	}

	@Override
	public float getFinRangoX() {
		return grafico.getX()+10;
	}
	
}
