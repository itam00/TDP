package Personajes;

import Disparos.DisparoTorre1; 
import Graficos.Torre1Grafica;

public class Torre1 extends Torre{
	
	public Torre1() {
		super();
		precio = 0; //cambiar
		rango = 2;
		danio = 1;
		vida =2000;
		cantFilas=1;
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
