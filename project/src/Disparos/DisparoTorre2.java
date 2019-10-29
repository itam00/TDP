package Disparos;

import Graficos.DisparoGrafico2;
import Juego.Mapa;
import Visitor.VisitorDisparoTorre;

public class DisparoTorre2 extends Disparo {


	public DisparoTorre2(int x, int y,Mapa m,int danio, float rango) {
		super(x, y,m,danio,rango);
		grafico=  new DisparoGrafico2(x, y);
		velocidad = 3;
		visitor = new VisitorDisparoTorre(this);
	}


	@Override
	public float getInicioRangoX() {
		return grafico.getX()-7;
	}

	@Override
	public float getFinRangoX() {
		return grafico.getX()+7;
	}
	


}
