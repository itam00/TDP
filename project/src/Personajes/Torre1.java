package Personajes;

import Disparos.DisparoTorre1;
import Graficos.ElementoGrafico;

public class Torre1 extends Torre{
	
	public Torre1() {
		super();
		rango = 1000;
		danio = 8;
		vida =100;
		vidaMaxima=vida;
		cantFilas=1;
		frecuenciaDefault=1000;
		frecuencia = frecuenciaDefault;
		direccionGrafico = "/Sprites/isaac.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
		
	}
	
	
	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre1((int)x,fila*96,mapa,danio,rango));
			}
		}
	}


	@Override
	public int getPrecio() {
		return 50;
	}



	
	
	


}
