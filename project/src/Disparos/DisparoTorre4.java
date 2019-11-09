package Disparos;

import Graficos.ElementoGrafico;
import Juego.Mapa;
import Visitor.VisitorDisparoTorre;

public class DisparoTorre4 extends DisparoTorre {


	public DisparoTorre4(int x, int y,Mapa m,int danio,float rango) {
		super(x, y,m,danio,rango);
		direccionGrafico = "/Sprites/proyectilTorre4.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
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
