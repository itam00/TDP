package Personajes;

import Disparos.DisparoTorre1;
import Graficos.Torre1Grafica;
import Juego.Mapa; 
import Recolectable.PowerUp;

public class Torre1 extends Torre{
	
	public Torre1() {
		super();
		precio = 0; //cambiar
		rango = 15;
		danio = 10;
		vida =2000;
		cantFilas=6;
		frecuenciaDefault=1000;
		frecuencia = frecuenciaDefault;
	}
	
	
	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre1((int)x,fila*96,mapa,danio,rango*96));
			}
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre1Grafica(x,y);
	}

	
	
	


}
