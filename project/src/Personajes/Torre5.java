package Personajes;

import Disparos.DisparoTorre5;
import Graficos.ElementoGrafico;

public class Torre5 extends Torre{
	public Torre5() {
		super();
		rango = 300;
		danio = 6;
		vida = 100;
		vidaMaxima=vida;
		frecuenciaDefault=500;
		frecuencia =frecuenciaDefault;
		cantFilas=2;
		direccionGrafico = "/Sprites/torre5.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre5((int)x,fila*96,mapa,danio,rango));
			}
		}
	}

	@Override
	public int getPrecio() {
		return 200;
	}


}
