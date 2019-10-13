package Personajes;

import Entidad.DisparoTorre1;
import GUI.Mapa;
import PersonajeGrafico.*;  
import Recolectable.PowerUp;

public class Torre1 extends Torre{
	
	public Torre1() {
		precio = 0; //cambiar
		rango = 10;
		danio = 10;
		vida =100;
		tamanio=1;
		frecuencia =500;
	}
	
	
	@Override
	public void atacar() {
		if(System.currentTimeMillis()-ultimoAtaque>frecuencia) {
			mapa.agregar(new DisparoTorre1(grafico.getX(),grafico.getY(),mapa,danio));
			ultimoAtaque = System.currentTimeMillis();
		}
	}




	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre1Grafica(x,y);
	}


	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}


}
