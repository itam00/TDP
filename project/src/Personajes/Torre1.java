package Personajes;

import Disparos.DisparoTorre1;
import Graficos.Torre1Grafica;
import Juego.Mapa; 
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
	public void disparar() {
		mapa.agregar(new DisparoTorre1(x,y,mapa,danio));
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
