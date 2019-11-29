package Personajes;

import Disparos.DisparoTorre5;
import Graficos.ElementoGrafico;

public class Torre5 extends Torre{
	public Torre5() {
		super();
		rango = 400;

		danio = 15;
		vida = 300;

		vidaMaxima=vida;
		frecuenciaDefault=800;
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
		return 400;
	}


}
