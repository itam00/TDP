package Personajes;

import Entidad.DisparoAliado;
import GUI.Mapa;
import PersonajeGrafico.*;  
import Recolectable.PowerUp;

public class Isaac extends Torre{
	
	public Isaac() {
		precio = 0; //cambiar
		rango = 10;
		danio = 10;
		vida =100;
		tamanio=1;
		frecuencia =500;
	}
	
	public void setPos(int x,int y, Mapa m) {
		grafico = new IsaacGrafico(x,y);
		mapa=m;
		this.x=grafico.getX();
		this.y=grafico.getY();
	}
	
	@Override
	public void atacar() {
		if(System.currentTimeMillis()-ultimoAtaque>frecuencia) {
			mapa.agregar(new DisparoAliado(grafico.getX(),grafico.getY(),mapa,danio));
			ultimoAtaque = System.currentTimeMillis();
		}
	}



	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInicioRangoX() {
		return grafico.getX();
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+rango*50;
	}


}
