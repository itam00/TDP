package Personajes;

import GUI.Mapa;
import PersonajeGrafico.*;  
import Recolectable.PowerUp;

public class Isaac extends Torre{

<<<<<<< Updated upstream
	public Isaac(int x,int y) {
		super(x,y);
		vida= 100;
		danio= 1;
		rango= 2;
		precio= 0;//MODIFICAR LUEGO
		tamanio= 0;//CONSULTAR QUE REPRESENTA EL TAMANIO
		
		grafico = new IsaacGrafico(x,y);
	}

	@Override
=======
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
>>>>>>> Stashed changes
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
