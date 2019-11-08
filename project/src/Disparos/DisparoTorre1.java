package Disparos;

import Graficos.ElementoGrafico;
import Juego.Mapa;
import Visitor.VisitorDisparoTorre;


public class DisparoTorre1 extends Disparo {


	public DisparoTorre1(int x, int y,Mapa m,int danio,float rango) {
		super(x, y,m,danio,rango);
		direccionGrafico = "/Sprites/proyectil.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
		velocidad = 1.5f;
		visitor = new VisitorDisparoTorre(this);
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
