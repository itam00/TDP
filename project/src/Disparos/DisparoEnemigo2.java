package Disparos;

import Graficos.ElementoGrafico;
import Juego.Mapa;
import Visitor.VisitorDisparoEnemigo;

public class DisparoEnemigo2 extends DisparoEnemigo{

	public DisparoEnemigo2(int x, int y,Mapa m,int danio,float rango) {
		super(x, y,m,danio,rango);
		direccionGrafico = "/Sprites/enemigo2Proyectil.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
		velocidad = 4;
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
