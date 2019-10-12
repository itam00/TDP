package Personajes;

import GUI.Mapa;
import PersonajeGrafico.*;  
import Recolectable.PowerUp;

public class Isaac extends Torre{
	int vida  =100;
	int danio = 1;
	int rango = 2;
	int precio = 10;

	public Isaac(int x,int y, Mapa m) {
		super(x,y,m);
		precio = 10;
		rango = 4;
		danio = 1;
		vida  =100;
		inicioRangoX=x;
		finRangoX=x;
		inicioRangoY=y-20;
		finRangoY=y+20;
		tamanio=1;
		grafico = new IsaacGrafico(x,y);
	}

	public Isaac() {
		precio = 0; //cambiar
		rango = 10;
		danio = 1;
		vida  =100;
		tamanio=1;
	}
	
	public void setPos(int x,int y, Mapa m) {
		grafico = new IsaacGrafico(x,y);
		mapa=m;
		inicioRangoX=x;
		finRangoX=x+rango*50;
		inicioRangoY=y-20;
		finRangoY=y+20;
		this.x=x;
		this.y=y;
	}
	
/*	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}
	*/


	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}


}
