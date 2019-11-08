package Personajes;

import Disparos.DisparoTorre3;
import Graficos.ElementoGrafico;

public class Torre3 extends Torre{

	public Torre3() {
		super();
		rango = 700;
		danio = 1;
		vida = 100;
		frecuenciaDefault=800;
		frecuencia =frecuenciaDefault;
		direccionGrafico = "/Sprites/torre3.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre3((int)x,fila*96,mapa,danio,rango));
			}
		}
	}

	


}
